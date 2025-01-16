
import java.util.*;

public class employee implements Comparable {
    private Integer id;
    private String firstName;
    private  String lastName;
    private String institution;
    private  String positioon;
    private Integer salary;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPositioon() {
        return positioon;
    }

    public void setPositioon(String positioon) {
        this.positioon = positioon;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public employee(){

    }
    public  employee(Integer id,String firstName,String lastName,String institution,String positioon,Integer salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.institution=institution;
        this.positioon=positioon;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "ID"+getId()+" First Name:"+getFirstName()+" Last Name:"+getLastName()+" Institution:"+getInstitution()+" Position"+getPositioon()+" Salary"+getSalary();
    }
    public int compareTo(Object o){
        employee emp=(employee) o;
        if(this.id.compareTo(emp.id)!=0)
            return this.id.compareTo(emp.id);
        if(this.firstName.compareTo(emp.firstName)!=0)
            return - this.firstName.compareTo(emp.firstName);
        if(this.lastName.compareTo(emp.lastName)!=0)
            return this.lastName.compareTo(emp.lastName);
        if(this.institution.compareTo(emp.institution)!=0)
            return this.institution.compareTo(emp.institution);
        if(this.positioon.compareTo(emp.positioon)!=0)
            return this.positioon.compareTo(emp.positioon);
        return this.salary.compareTo(emp.salary);
    }
    @Override
    //hashcode checks whether the main content and memory are equal
    public int hashCode(){
        return this.id.hashCode()+this.firstName.hashCode()+this.lastName.hashCode()+this.salary.hashCode()+this.institution.hashCode()+this.positioon.hashCode();
    }

    @Override
    //this method checks whether the both are equal if not hence they cant
    public boolean equals(Object obj) {
        employee emp=(employee) obj;
        return this.id.equals(emp.id)&&this.firstName.equals(emp.firstName)&&this.lastName.equals(emp.lastName)&&this.positioon.equals(emp.positioon)&&this.salary.equals(emp.salary);
    }

    public static void main(String[] args){
        Set<employee> emps=new HashSet<employee>();
        emps.add(new employee(1,"Mary","Mugisha","RCA","Accountant",1000));
        emps.add(new employee(2,"Mike","Muhoza","RCA","Instructor",1200));
        emps.add( new employee(3,"Peter","Mugeni","RCA","Developer",1500));
        emps.add(new employee(2,"Mike","Muhoza","RCA","Instructor",1200));
        emps.add(new employee(2,"Mike","Ganza","RCA","Instructor",1300));
//        Collections.sort(emps);
//        System.out.println(emps.hashCode());


        for(employee emp:emps){
            System.out.println(emp);
        }


    }


}