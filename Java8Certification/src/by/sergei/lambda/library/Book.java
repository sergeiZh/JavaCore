package by.sergei.lambda.library;

import java.util.List;

public class Book {
    
    private String authorName;
    private String authorLastName;
    private String country;
    private String bookName;
    private int pageAmount;
    private long price;
    private String genre;
    private List<Award> awards;
    
    public Book(String authorName, String authorLastName, String authorCountry, String bookName, int pageAmount){
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.country = authorCountry;
        this.bookName = bookName;
        this.pageAmount = pageAmount;
    }
    
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    public String getAuthorLastName() {
        return authorLastName;
    }
    
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getPageAmount() {
        return pageAmount;
    }
    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }
    
    public static boolean useAuthor(Book book) {
        return book.getCountry().equals("USA");
    }
    
    @Override
    public String toString() {
        return authorName + " " + authorLastName + " " + bookName + " " + pageAmount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}
