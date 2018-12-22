package by.sergei.lambda.function;

import java.util.Comparator;
import java.util.function.Function;

@FunctionalInterface
public interface CustomComparator<T> {
    
    int compare(T t1, T t2);
    
    public default CustomComparator<T> andThen(CustomComparator<T> nextComparator){
        
        return (p1, p2) -> compare(p1, p2) == 0 ? nextComparator.compare(p1, p2) : compare(p1, p2); 
    }
    
    public default CustomComparator<T> andThen(Function<T, Comparable> function){
        
        return andThen(comparing(function));
    }
    
    public static <U> CustomComparator<U> comparing(Function<U, Comparable> function){
        
        return (p1, p2) -> function.apply(p1).compareTo(function.apply(p2));
    }

}
