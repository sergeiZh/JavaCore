package by.sergei.lambda;

import java.util.ArrayList;
import java.util.List;

import by.sergei.lambda.function.CustomPredicate;

public class WorkWithCustomPredicate {
    
    public static void main(String[] args) {
        
        List<Book> books = LibraryTools.generateListOfBooks();
        
        CustomPredicate<Book> authorNameIsDanPredicate = book -> book.getAuthorName().equals("Dan");
        System.out.println("Books with author name Dan " + filter(books, authorNameIsDanPredicate));
        
        CustomPredicate<Book> authorNameIsDanAndJhonPredicate = authorNameIsDanPredicate.or(book -> book.getAuthorName().equals("Jhon"));
        System.out.println("Books with author name Dan and Jhon " + filter(books, authorNameIsDanAndJhonPredicate));
    }
    
    public static List<Book> filter(List<Book> books, CustomPredicate<Book> predicate){
        List<Book> filteredBooks = new ArrayList<>();
        for(Book book : books){
            if(predicate.test(book)){
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

}
