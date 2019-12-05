
public class Book {
	 
	String title;
	String author;
	String borrower = null;
	CheckoutDate checkoutDate = null;
	
	boolean loaned = false;
		
	public Book(){}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBorrower() {
		return borrower;
	}
	
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	
	public void setLoaned(boolean loaned) {
		this.loaned = loaned;
	}
	
	public boolean getLoaned() {
		return loaned;
	}

	public CheckoutDate getCheckoutDate() {
		return checkoutDate;
	}
	
	public void setCheckoutDate(CheckoutDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	
	@Override
	public String toString() {
		return "Book[title=" + title + "][author=" + author + "][loaned=" + loaned + "]" +
			((loaned == true) ? ("[borrower=" + borrower + "]") : "") + 
			"[CheckedOut=" + checkoutDate + "]";
	}
	
	public static class CheckoutDate {
		int day;
		int month;
		int year;
	
		public CheckoutDate(int month, int day, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		public static CheckoutDate getDate(String checkoutDate) {
			String[] tokens = checkoutDate.split("/");
			if(tokens.length != 3) {
				return null;
			}
			
			try {
				int month = Integer.parseInt(tokens[0]);
				int day = Integer.parseInt(tokens[1]);
				int year = Integer.parseInt(tokens[2]);
				return new CheckoutDate(month, day, year);
			} catch (NumberFormatException e) {
				System.out.println("Date string not in format mm/dd/yyyy: " + checkoutDate);
				return null;
			}
			
		}
		
		@Override
		public String toString() {
			return month + "/" + day + "/" + year;
		}
		
	}
	
	
}
