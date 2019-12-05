import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame {

	JButton addBook = addButton("Add Book", 3, 1, 1, 1);
	JButton removeBook = addButton("Remove Book", 3, 2, 1, 1);
	JButton loanBook = addButton("Loan Book", 3, 3, 1, 1);
	JButton returnBook = addButton("Return Book", 3, 4, 1, 1);

	JTextField dateField = addTextField("Enter Date, format DD/MM/YYYY", 1, 1, 1, 1);
	JTextField titleField = addTextField("Enter Title Here", 2, 1, 1, 1);
	JTextField authorField = addTextField("Enter Author Here", 2, 2, 1, 1);

	// Default (start with empty library)
	Library library = new Library();

	// Debug (preseed library with books)
	//Library library = new Library(true);
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == addBook) {
			AddDialog add = new AddDialog(this, library);
			add.setVisible(true);
		} else if (buttonObj == loanBook) {
			LoanDialog loan = new LoanDialog(this, library);
			loan.setVisible(true);
		} else if (buttonObj == returnBook) {
			ReturnDialog returnDialog = new ReturnDialog(this, library);
			returnDialog.setVisible(true);
		} else if(buttonObj == removeBook) {
			RemoveDialog remove = new RemoveDialog(this, library);
			remove.setVisible(true);
		}
	}

	public static void main(String args[]) {
		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setTitle("Library Program");
		gui.setSize(1000, 1000);
	}
}
