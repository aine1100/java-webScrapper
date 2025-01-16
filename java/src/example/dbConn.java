import example.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbConn extends Person {

    public static void main(String[] args) {
        String username = "postgres";
        String password = "aine";
        String url = "jdbc:postgresql://localhost:5432/jdbc";

        // CSV file path
        File file = new File("/home/aine/Downloads/students.csv");

        // Database connection
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to db successfully");

            // Reading the CSV file
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                br.readLine(); // Skip header line

                // Preparing SQL query for inserting data
                String sql = "INSERT INTO students (id, name, class, age) VALUES (?, ?, ?, ?)";
                try (PreparedStatement stmt = con.prepareStatement(sql)) {

                    // Reading CSV lines and inserting into DB
                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(",");

                        // Parsing data
                        int id = Integer.parseInt(data[0]);
                        String name = data[1];
                        String stuclass = data[2];
                        int age = Integer.parseInt(data[3]);

                        // Setting values to the prepared statement
                        stmt.setInt(1, id);
                        stmt.setString(2, name);
                        stmt.setString(3, stuclass);
                        stmt.setInt(4, age);

                        // Executing the insert
                        stmt.executeUpdate();
                    }
                    System.out.println("Data inserted successfully into the database.");
                } catch (SQLException e) {
                    System.out.println("Error while preparing statement or inserting data: " + e.getMessage());
                }
            } catch (IOException e) {
                System.out.println("Error reading the CSV file: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the db: " + e.getMessage());
        }
    }
}
