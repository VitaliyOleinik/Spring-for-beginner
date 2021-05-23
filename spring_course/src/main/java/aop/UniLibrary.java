package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Take the book from University:      ");
    }
    public void returnBook(){
        System.out.println("We return the book to UniLibrary");
    }
    public void getMagazine(){
        System.out.println("We take a magazine form uni");
    }

    public void returnMagazine(){
        System.out.println("Oh my, you return the book");
    }

    public void addBook(){
        System.out.println("We add the book to University:      ");
    }

    public void addMagazine(){
        System.out.println("We add the magazine to University:      ");
    }
}
