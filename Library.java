import java.util.ArrayList;

public class Library {

	private ArrayList<Book> allBooks = new ArrayList<>();
	
	public Library() {
		this(false);
	}
	
	public Library(boolean debug) {
		if(debug == true) {
			addBookToLibrary(new Book("The Pearl", "John Steinbeck"));
			addBookToLibrary(new Book("The Bible", "God"));
			addBookToLibrary(new Book("The Death of Expertise", "Tom Nichols"));
			addBookToLibrary(new Book("The Great Gatsby", "F Scott Fitzgerald"));
			System.out.println("Library[DEBUG] Pre-Seeded Library\n");
		}
		debugPrintLibrary();
	}
	
	public void addBookToLibrary(Book b) {
		allBooks.add(b);
		debugPrintLibrary();
	}
	
	public Book returnBook(String title) throws LibraryException {
		Book book = findBookByTitle(title);
		return returnBook(book);
	}
	
	public Book returnBook(Book book) {
		book.setBorrower(null);
		book.setCheckoutDate(null);
		book.setLoaned(false);
		System.out.println("Library: [ReturnBook]: " + book.toString());
		debugPrintLibrary();		
		return book;
	}
	
	public Book checkoutBook(String title, String borrower, String checkoutDate) throws LibraryException {
		Book book = findBookByTitle(title);
		return checkoutBook(book, borrower, checkoutDate);
	}
	
	public Book checkoutBook(Book book, String borrower, String checkoutDate) throws LibraryException {
		
		Book.CheckoutDate checkedOut = Book.CheckoutDate.getDate(checkoutDate);
		if(checkedOut == null) {
				throw new LibraryException("Cannot checkout book Title[" + book.getTitle() + "]: invalid date string: " + checkoutDate);
		}
		book.setCheckoutDate(checkedOut);
		book.setBorrower(borrower);
		book.setLoaned(true);
		System.out.println("Library: [CheckoutBook]: " + book.toString());
		debugPrintLibrary();
		return book;
	}
	
	public Book findBookByTitle(String title) throws LibraryException {
		Book found = null;
		for(Book b : allBooks) {
			if(b.getTitle().contentEquals(title)) {
				found = b;
				break;
			}
		}
		if(found == null) {
			throw new LibraryException("Book not found with title: " + title);
		}
		return found;
	}
	
	public ArrayList<Book> getAllBooks() {
		return allBooks;
	}
	
	public ArrayList<Book> getAllCheckedOutBooks() {
		ArrayList<Book> checkedOutBooks = new ArrayList<>();
		for(Book b : allBooks) {
			if(b.loaned == true)
				checkedOutBooks.add(b);
		}
		return checkedOutBooks;
	}
	
	public void removeBookFromLibrary(String title) throws LibraryException {
		removeBookFromLibrary(findBookByTitle(title));
	}
	
	public void removeBookFromLibrary(Book b) {
		allBooks.remove(b);
		System.out.println("Library: [RemoveBookFromLibrary]: " + b.toString());
		debugPrintLibrary();		
	}
	
	public void debugPrintLibrary() {
		int i = 1;
		System.out.println("==========================\n====== Library ===========\n==========================\n");
		for(Book b : allBooks) {
			System.out.println("[" + (i++) + "]: " + b.toString());
		}
		System.out.println("==========================\n==== End of Library ======\n==========================\n");		
	}
}
