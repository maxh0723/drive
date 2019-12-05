import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class AddDialog extends GBDialog{
	JLabel titleLabel = addLabel("Title:", 1,1,1,1);
	JLabel authorLabel = addLabel("Author:", 1,2,1,1);
	
	JTextField titleField = addTextField("",2,1,1,1);
	JTextField authorField = addTextField("", 2,2,1,1);
	
	JButton addBook = addButton("Add Book", 3,1,1,1);
	Library library;
	
	public AddDialog(JFrame parent, Library library) {
		super(parent);
		this.library = library;
	}
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == addBook) {
			Book book = new Book(titleField.getText(), authorField.getText());
			library.addBookToLibrary(book);
			dispose();
		}
	}
}
