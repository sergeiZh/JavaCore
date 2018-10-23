package by.sergei.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingStringValues {
    
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Mozambick", "USA", "France", "Australia", "Iceland", "Canada"));
        
        countries.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(countries);
    }

}
