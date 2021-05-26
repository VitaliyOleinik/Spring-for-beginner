package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Take the book from University:      ");
        System.out.println("_____-______________-_______________-_____");
    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("We return the book to UniLibrary");
        return "War and piece";
    }
    public void getMagazine(){
        System.out.println("We take a magazine form uni");
        System.out.println("_____-______________-_______________-_____");
    }

    public void returnMagazine(){
        System.out.println("Oh my, you return the book");
        System.out.println("_____-______________-_______________-_____");
    }

    public void addBook(String personName, Book book){
        System.out.println("We add the book to University:      ");
        System.out.println("_____-______________-_______________-_____");
    }

    public void addMagazine(){
        System.out.println("We add the magazine to University:      ");
        System.out.println("_____-______________-_______________-_____");
    }
}
