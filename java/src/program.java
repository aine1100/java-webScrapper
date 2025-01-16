import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<employee> emps = new ArrayList<>();


        emps.add(new employee(1, "Mary", "Mugisha", "RCA", "Accountant", 1000));
        emps.add(new employee(2, "Mike", "Muhoza", "RCA", "Institution", 1200));
        emps.add(new employee(3, "Peter", "Mugeni", "RCA", "Developer", 1000));
        emps.add(new employee(4, "Mike", "Muhoza", "RCA", "Instructor", 1200));
        emps.add(new employee(5, "Mike", "Ganza", "RCA", "Instructor", 2000));


        for (employee emp : emps) {
            System.out.println(emp);
        }
    }
}
