package by.sergei.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class WorkWithPredicate {

    public static void main(String[] args) {
        List<Book> books = LibraryTools.generateListOfBooks();
        examplesWithPredicate(books);
        
        int[] intArray = {1, 2, 58, 45, 78, 6, 19, 199, 219, 11, 16, 2, 78, 2, 55};
        examplesWithIntPredicate(intArray);

    }

    private static void examplesWithIntPredicate(int[] intArray) {
        int[] filterMultiplyOf3 = filter(intArray, integer -> integer%3==0);
        System.out.println(Arrays.toString(filterMultiplyOf3));
        
        IntPredicate multiplyBy3 = integer -> integer%3==0;
        int[] predicateMultiplyBy3And2 = filter(intArray, multiplyBy3.and(integer -> integer%2 == 0));
        System.out.println(Arrays.toString(predicateMultiplyBy3And2));
        
        int[] predicateMultiplyBy3Or11 = filter(intArray, multiplyBy3.or(integer -> integer%11 == 0));
        System.out.println(Arrays.toString(predicateMultiplyBy3Or11));
        
        int[] predicateNotMultiplyBy3 = filter(intArray, multiplyBy3.negate());
        System.out.println(Arrays.toString(predicateNotMultiplyBy3));
        
    }

    private static void examplesWithPredicate(List<Book> books) {
        List<Book> booksFilteredByPagesAmount = filterBook(books, book -> book.getPageAmount() > 440);
        System.out.println("Books with page amount > 440 " + booksFilteredByPagesAmount);

        List<Book> booksFilteredByCountry = filterBook(books, book -> book.getAuthorCountry().equals("Denmark"));
        System.out.println("Books with country Denmark " + booksFilteredByCountry);

        Predicate<Book> pageAmountPredicate = book -> book.getPageAmount() > 450;
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

    public static List<Book> filterBook(List<Book> books, Predicate<Book> filter) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (filter.test(book)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }
    
    public static int[] filter(int[] intArray, IntPredicate predicate){
        int[] output = new int[intArray.length];
        if(intArray != null && intArray.length > 0){
            for(int i=0, k=0; i<intArray.length; i++){
                if(predicate.test(intArray[i])){
                    output[k] = intArray[i];
                    k++;
                }
            }
        }
        return output;
    }

}
