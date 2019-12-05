import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame {

	JButton addBook = addButton("Add Book", 3, 1, 1, 1);
	JButton loanBook = addButton("Loan Book", 3, 2, 1, 1);

	JTextField dateField = addTextField("Enter Date, format DD/MM/YYYY", 1, 1, 1, 1);
	JTextField titleField = addTextField("Enter Title Here", 2, 1, 1, 1);
	JTextField authorField = addTextField("Enter Author Here", 2, 2, 1, 1);

	Book book = new Book();
	ArrayList<Book> books = new ArrayList<Book>();

	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == addBook) {
			AddDialog add = new AddDialog(this, books);
			add.setVisible(true);
		} else if (buttonObj == loanBook) {
			LoanDialog loan = new LoanDialog(this, books);
			loan.setVisible(true);
		}
	}

	public static void main(String args[]) {
		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setTitle("Library Program");
		gui.setSize(1000, 1000);
	}
}
