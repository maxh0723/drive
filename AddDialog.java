import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class AddDialog extends GBDialog{
	JLabel titleLabel = addLabel("Title:", 1,1,1,1);
	JLabel authorLabel = addLabel("Author:", 1,2,1,1);
	
	JTextField titleField = addTextField("",2,1,1,1);
	JTextField authorField = addTextField("", 2,2,1,1);
	
	JButton addBook = addButton("Add Book", 3,1,1,1);
	
	Book book = new Book();
	
	public AddDialog(JFrame parent, ArrayList<Book> books) {
		super(parent);
	
	}
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == addBook) {
			String loaner = "";
			book.addBook(titleField.getText(), authorField.getText(), loaner);
			dispose();
		}
	}
}
