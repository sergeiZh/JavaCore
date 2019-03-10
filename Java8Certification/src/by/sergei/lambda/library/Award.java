package by.sergei.lambda.library;

import java.time.LocalDate;

public class Award {
    
    private String name;
    private String country;
    private String awardCategory;
    private LocalDate year;
    private Author author;
    private Book book;
    
    public Award(String name, String country, String awardCategory, LocalDate year, Author author, Book book) {
        this.name = name;
        this.country = country;
        this.awardCategory = awardCategory;
        this.year = year;
        this.author = author;
        this.book = book;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAwardCategory() {
        return awardCategory;
    }
    public void setAwardCategory(String awardCategory) {
        this.awardCategory = awardCategory;
    }
    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
