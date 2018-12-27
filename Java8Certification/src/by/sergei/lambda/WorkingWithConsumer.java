package by.sergei.lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import by.sergei.lambda.library.Book;
import by.sergei.lambda.library.LibraryTools;

public class WorkingWithConsumer {

    public static void main(String[] args) {
        List<Book> books = LibraryTools.generateListOfBooks();

        Consumer<List<Book>> printFirstAuthorConsumer = list -> System.out.println(list.get(0).getAuthorName());
        processConsumer(books, printFirstAuthorConsumer);

        Consumer<List<Book>> printFirstAuthorLastName = list -> System.out.print(list.get(0).getAuthorLastName() + " ");
        
        processConsumer(books, printFirstAuthorLastName.andThen(printFirstAuthorConsumer));
        
        BiConsumer<List<Book>, String> changeCountryOfSecondBook = (list, str) -> {
            Book secondBook = list.get(1);
            list.get(1).setCountry(secondBook.getCountry() + str);
        };
        
        processBiConsumer(books, " changed", changeCountryOfSecondBook);
        System.out.println(books.get(1).getCountry());
    }

    static void processConsumer(List<Book> list, Consumer<List<Book>> consumer) {
        consumer.accept(list);
    }
    
    static void processBiConsumer(List<Book> list, String strValue, BiConsumer<List<Book>, String> consumer) {
        consumer.accept(list, strValue);
    }
    

}
