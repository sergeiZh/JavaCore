package by.sergei.lambda;

import java.util.Comparator;
import java.util.List;

import by.sergei.lambda.library.Book;
import by.sergei.lambda.library.LibraryTools;

public class WorkWithComparator {
    
    public static void main(String[] args) {
        List<Book> books = LibraryTools.generateListOfBooks();
        
        // List of books before sorting
        System.out.println(books);
        
        Comparator<Book> compareByAuthorName = Comparator.comparing(Book::getAuthorName);
        books.sort(compareByAuthorName);
        System.out.println(books);
        
        Comparator<String> reverseCompare = (authorName1, authorName2) -> authorName2.compareTo(authorName1);
        Comparator<Book> compareByNameReverse = Comparator.comparing(Book::getAuthorName, reverseCompare);
        books.sort(compareByNameReverse);
        System.out.println(books);
        
        books.sort(compareByAuthorName.reversed());
        System.out.println(books);
        
        Comparator<Book> compareByPageAmount = Comparator.comparingInt(Book::getPageAmount);
        books.sort(compareByPageAmount);
        System.out.println(books);
        
        books.sort(compareByAuthorName.thenComparing(compareByPageAmount));
        System.out.println(books);
    }

}
