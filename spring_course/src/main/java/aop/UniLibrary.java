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

    public String returnMagazine(){
        System.out.println("ok");
        return "Oh my, you return the book";
    }
}
