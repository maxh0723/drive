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
	
	public LoanDialog(JFrame parent, ArrayList<Book> books) {
		super(parent);
	
	}
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == loanButton) {
			for (int i = 0; i < books.size(); i++) {
				
			}
		}
	}
}
