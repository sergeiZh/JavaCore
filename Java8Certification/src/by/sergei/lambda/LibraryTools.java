package by.sergei.lambda;

public class LibraryTools {
    
    public void reverseAuthorName(Book book){
        StringBuilder reverseAuthorName = new StringBuilder();
        String[] splittedAuthor = book.getAuthorName().split("");
        for(int i=splittedAuthor.length-1, k=0; i>=0; i--, k++){
            reverseAuthorName.append(splittedAuthor[i]);
            
        }
        
        System.out.println(reverseAuthorName.toString());
        book.setAuthorName(reverseAuthorName.toString());
    }

}
