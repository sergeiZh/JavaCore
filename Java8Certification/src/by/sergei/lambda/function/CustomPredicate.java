package by.sergei.lambda.function;

@FunctionalInterface
public interface CustomPredicate<T> {
    
    public boolean test(T t);
    
    default CustomPredicate<T> or(CustomPredicate<T> nextPredicate){
        return t -> test(t) || nextPredicate.test(t);
    }
    
    default CustomPredicate<T> and(CustomPredicate<T> nextPredicate){
        return t -> test(t) && nextPredicate.test(t);
    }
    
}
