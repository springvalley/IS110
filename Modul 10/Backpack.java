import java.util.*;


public class Backpack
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> books;
    
    public Backpack()
    {
        books = new ArrayList<>();
        TextBook a = new TextBook("IS-110 tekstbok");
        Journal b = new Journal("IS-110 skrivebok", false);
        addBook(a);
        addBook(b);
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    public void printBooks(){
        for(Book b : books){
            System.out.println(b.getName());
        }
    }
}
