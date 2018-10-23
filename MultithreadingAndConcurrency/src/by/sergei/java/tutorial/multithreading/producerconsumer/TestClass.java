package by.sergei.java.tutorial.multithreading.producerconsumer;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Siarhei_Zhabrykau
 *
 */
public class TestClass {
    static int si = 10;
    int ii = 20;

    public void inner() {
        int ai = 30; // automatic variable
        final int fai = 40; // automatic final variable
        class Inner {
            public Inner() {
                System.out.println(si + "  " + ii + "   " + fai);
            }
        }
        new Inner();
    }

    public static void main(String[] args) throws URISyntaxException, SQLException {
//        Comparator<Apple> byWeight = new Comparator<Apple>() {
//            public int compare(Apple a1, Apple a2) {
//                return a1.getWeight().compareTo(a2.getWeight());
//            }
//        };
        
        Integer inter = 5;
        Function<Integer, String> func = (k) -> "hello "+ k;
        Comparator<Apple> byWeight = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    }
}

class Apple {
    
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    
}