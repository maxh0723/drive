import javax.swing.*;
import BreezySwing.*;

public class RemoveDialog extends GBDialog{
	JLabel titleLabel = addLabel("Title:", 1,1,1,1);
	JTextField titleField = addTextField("",2,1,1,1);
	JButton removeBook = addButton("Remove Book", 3,1,1,1);
	Library library;
	
	public RemoveDialog(JFrame parent, Library library) {
		super(parent);
		this.library = library;
	}
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == removeBook) {
			try {
				library.removeBookFromLibrary(titleField.getText());
			} catch (LibraryException e) {
				System.out.println("Failed to delete Book[title=" + titleField.getText() + ": " + e.getMessage());
			}
			dispose();
		}
	}
}
