package by.sergei.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryTools {
    
    public void reverseAuthorName(Book book){
        StringBuilder reverseAuthorName = new StringBuilder();
        String[] splittedAuthor = book.getAuthorName().split("");
        for(int i=splittedAuthor.length-1; i>=0; i--){
            reverseAuthorName.append(splittedAuthor[i]);
            
        }
        
        System.out.println(reverseAuthorName.toString());
        book.setAuthorName(reverseAuthorName.toString());
    }
    
    public static List<Book> generateListOfBooks(){
        Book book1 = new Book("Dan", "Brown", "USA", "Angels and Demons", 500);
        Book book2 = new Book("Thomas", "Chase", "USA", "True Detective", 450);
        Book book3 = new Book("Jhon", "Tolkien", "UK", "Lord of the Rings", 1000);
        Book book4 = new Book("Mikhail", "Bulgakov", "Russia", "Heart of a dog", 350);
        Book book5 = new Book("Gans-Christian", "Andersen", "Denmark", "Snow queen", 50);
        Book book6 = new Book("Stanislav", "Lem", "Czeck", "Solaris", 280);
        
        return new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6));
    }

}
