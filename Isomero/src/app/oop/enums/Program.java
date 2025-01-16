package app.oop.enums;

enum gender{
    Male,Female
}
//the declaration of enums in same file of the class
public class Program {
    //can also be in the same file of the same file

    enum gender{
        Male,Female
    }
    public  static void main(String[] args){
        Gender gender=Gender.FEMALE;
        System.out.println(gender);
        //this is conversion of the enum value to string value;
        System.out.println(gender.name());
        //the ordinal means the location or position of selected value in its array
        System.out.println(gender.ordinal());
        Days d1=Days.MONDAY;
        d1.information();
        //to print all constant values from our enum you use .values() keyword for printing
        for(Days d:Days.values()){
            System.out.println(d);
        }

    }
}
