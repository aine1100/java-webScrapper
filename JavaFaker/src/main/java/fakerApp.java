import com.github.javafaker.Faker;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class fakerApp {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/people";
        String username = "postgres";
        String password = "aine";

        Faker faker = new Faker();
        int batchsize = 1000;
        int totalRecords = 100000;

        File newFile=new File("//home//aine/Downloads//codes//person.csv");

        String insertDb = "INSERT INTO people(name, email, address, age) VALUES(?, ?, ?, ?)";

        // Initialize CSV Writer
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(newFile))) {
            // Write header to CSV file
            csvWriter.writeNext(new String[]{"ID", "Name", "Email", "Address", "Age"});

            // Establish connection to the database
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = conn.prepareStatement(insertDb)) {

                conn.setAutoCommit(false); // Disable auto-commit for batching
                System.out.println("Starting to insert data into the database and CSV file");

                // Insert and write data
                for (int i = 1; i <= totalRecords; i++) {
                    String userName = faker.name().fullName();
                    String email = faker.internet().emailAddress();
                    String address = faker.address().fullAddress();
                    int age = faker.number().numberBetween(15, 100);

                    // Insert data into the database
                    stmt.setString(1, userName);
                    stmt.setString(2, email);
                    stmt.setString(3, address);
                    stmt.setInt(4, age);
                    stmt.addBatch();

                    // Write the data to the CSV file
                    csvWriter.writeNext(new String[]{String.valueOf(i), userName, email, address, String.valueOf(age)});

                    // Execute batch insert every 1000 records
                    if (i % batchsize == 0) {
                        stmt.executeBatch();
                        conn.commit();
                        System.out.println("Inserted " + i + " records into the database");
                    }
                }

                // Insert any remaining data
                stmt.executeBatch();
                conn.commit();
                System.out.println("Data insertion completed");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
