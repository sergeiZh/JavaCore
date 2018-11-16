package by.sergei.lambda;

public class Book {
    
    private String authorName;
    private String authorLastName;
    private String authorCountry;
    private String bookName;
    private int pageAmount;
    
    Book(String authorName, String authorLastName, String authorCountry, String bookName, int pageAmount){
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.authorCountry = authorCountry;
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
    
    public String getAuthorCountry() {
        return authorCountry;
    }
    
    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
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
        return book.getAuthorCountry().equals("USA");
    }
    
    @Override
    public String toString() {
        return authorName + " " + authorLastName + " " + bookName + " " + pageAmount;
    }
}
