import ac.rca.isomero.Book;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book b1=new Book(1,"Oop with java","Mike",1000);
        Book b2=new Book(1,"Oop with java","Mike",1000);
        Book b3=new Book(2,"Advanced Java","Annabelle",2000);
        Book b4=new Book(2,"Advanced Java","Annabelle",3000);
        Book b5=new Book(5,"Advanced Java","Ange",2000);

        ArrayList<Book> books=new ArrayList<Book>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
       Collections.sort(books);

        for(Book b:books){
            System.out.println(b);
        }




    }
}
//you change the order while sorting by just changing the places of sorting
//treeset doesnt allow the duplicates values