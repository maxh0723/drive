import java.util.ArrayList;
import javax.swing.*;
import BreezySwing.*;

public class LoanDialog extends GBDialog {
	JLabel titleLabel = addLabel("Title:", 1,1,1,1);
	JLabel loanerLabel = addLabel("Loaner:", 1,3,1,1);
	JLabel dateLabel = addLabel("Date Loaned:", 1,4,1,1);
	
	JTextField titleField = addTextField("", 2,1,1,1);
	JTextField loanerField = addTextField("", 2,3,1,1);
	JTextField dateField = addTextField("", 2,4,1,1);
	
	JButton loanButton = addButton ("Loan", 3,1,1,1);
	Library library;
	
	public LoanDialog(JFrame parent, Library library) {
		super(parent);
		this.library = library;
	}
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == loanButton) {
			try {
				Book b = library.checkoutBook(titleField.getText(), loanerField.getText(), dateField.getText());
				System.out.println("[CheckoutBook]: SUCCESS Book: " + b.toString());
			} catch (LibraryException e) {
				System.out.println("Error Checking Out Book: Title: " + titleLabel.getText() + ": " + e.getMessage());
			}
			dispose();
		}
	}
}
