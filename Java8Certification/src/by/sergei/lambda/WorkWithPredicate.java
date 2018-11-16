package by.sergei.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class WorkWithPredicate {
    
    public static void main(String[] args) {
        Book book1 = new Book("Dan", "Brown", "USA", "Angels and Demons", 500);
        Book book2 = new Book("Thomas", "Chase", "USA", "True Detective", 450);
        Book book3 = new Book("Jhon", "Tolkien", "UK", "Lord of the Rings", 1000);
        Book book4 = new Book("Mikhail", "Bulgakov", "Russia", "Heart of a dog", 350);
        Book book5 = new Book("Gans-Christian", "Andersen", "Denmark", "Snow queen", 50);
        Book book6 = new Book("Stanislav", "Lem", "Czeck", "Solaris", 280);

        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6));
        
        Predicate<Book> filterBookByPagesAmountPredicate = book -> book.getPageAmount()>440;
        List<Book> booksFilteredByPagesAmount = filterBook(books, filterBookByPagesAmountPredicate);
        System.out.println("Books with page amount > 440 " + booksFilteredByPagesAmount);
        
        Predicate<Book> filterBookByCountryDenmarkPredicate = book -> book.getAuthorCountry().equals("Denmark");
        List<Book> booksFilteredByCountry = filterBook(books, filterBookByCountryDenmarkPredicate);
        System.out.println("Books with country Denmark " + booksFilteredByCountry);
        
        Predicate<Book> pageAmountPredicate = book -> book.getPageAmount()>450;
        List<Book> booksFilteredByPageAmountAndCountry = filterBook(books, pageAmountPredicate.and(book -> book.getAuthorCountry().equals("UK")));
        System.out.println("Books with pages amount > 450 AND author count UK " + booksFilteredByPageAmountAndCountry);
        
        List<Book> booksFilteredByPageAmountOrCountry = filterBook(books, pageAmountPredicate.or(book -> book.getAuthorCountry().equals("UK")));
        System.out.println("Books with pages amount > 450 OR author count UK " + booksFilteredByPageAmountOrCountry);
        
        List<Book> booksFilteredByPageAmountNegate = filterBook(books, pageAmountPredicate.negate());
        System.out.println("Books with pages is not amount > 450 " + booksFilteredByPageAmountNegate);
        
        List<Book> booksFilteredByMethodReference = filterBook(books, Book::useAuthor);
        System.out.println("Method reference filter by author country USA " + booksFilteredByMethodReference);
        
        Predicate<String> isEquals = Predicate.isEqual("hello world");
        System.out.println(isEquals.test("bye bye world"));
        
    }
    
    public static List<Book> filterBook(List<Book> books, Predicate<Book> filter){
        List<Book> filteredBooks = new ArrayList<>();
        for(Book book : books){
            if(filter.test(book)){
                filteredBooks.add(book);
            }
        }
        
        return filteredBooks;
    }

    
    
}
