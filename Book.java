import java.util.ArrayList;

public class Book {
	 
	String title, author, borrower;
	int day, month, year;
	
	boolean loaned = false;
	
	
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	public Book(){}
	
	public Book(String name, String auth, String loan) {
		title = name;
		author = auth;
		borrower = loan;
	}
	
	public void addBook(String title, String author, String loaner) {
		Book b = new Book(title, author, loaner);
		books.add(b);
	}
	
	public void setLoaned(boolean loan) {
		loaned = loan;
	}
	
	public void setDate(String d) {
		
	}
	
	
}
