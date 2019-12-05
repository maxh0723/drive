import javax.swing.*;
import BreezySwing.*;

public class ReturnDialog extends GBDialog {
	JLabel titleLabel = addLabel("Title:", 1,1,1,1);
	
	JTextField titleField = addTextField("", 2,1,1,1);
	
	JButton returnButton = addButton ("Return", 3,1,1,1);
	Library library;
	
	public ReturnDialog(JFrame parent, Library library) {
		super(parent);
		this.library = library;
	}
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == returnButton) {
			try {
				Book book = library.returnBook(titleField.getText());
				System.out.println("[Book]: SUCCESS Book: " + book.toString());
			} catch (LibraryException e) {
				System.out.println("Error Checking Out Book: Title: " + titleLabel.getText() + ": " + e.getMessage());
			}
			dispose();
		}
	}
}
