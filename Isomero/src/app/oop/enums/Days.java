package app.oop.enums;

public enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    public void information(){
        switch (this){
            case MONDAY :
                System.out.println("EGGS");
                break;
            case TUESDAY:
                System.out.println("Kawunga");
                break;
            case WEDNESDAY:
                System.out.println("Ugali and meat");
                break;
            case THURSDAY:
                System.out.println("Rice");
                break;
            case FRIDAY:
                System.out.println("Potato");
                break;
            case SATURDAY:
                System.out.println("Chips");
                break;
            case SUNDAY:
                System.out.println("Banana");
                break;
        }
    }
}
