package libarary;


import java.awt.print.Book;

public class Shelf {
	private Book booksOnShelf[] = new Book[5]; // The books that can be on the shelf
	private int shelfNumber; // The shelf number
	
	public Shelf() {
		
		// default constructor
		this.shelfNumber = 0;
		init();
	}
	
	public Shelf(int shelfNumber) {
		
		// Constructor with shelf number
		this.shelfNumber = shelfNumber;
		init();
	}
	
	// Get and set
	public Book[] getBooksOnShelf() {
		return booksOnShelf;
	}
	
	public void setBooksOnShelf(Book[] booksOnShelf) {
		this.booksOnShelf = booksOnShelf;
	}
	
	public void setShelfNumber(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	
	public int getShelfNumber() {
		return shelfNumber;
	}
	
	private void init() {
		
		// This method restart all the book in the shelf
		for (int i = 0; i < 5; i++) {
			this.booksOnShelf[i] = null;
		}
	}
	
	public int getNumberOfBooks() {
		
		//This method return how many books are in the shelf
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (this.booksOnShelf[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public int getNumberOfPages() {
		
		// This method returns how many pages in the shelf
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (this.booksOnShelf[i] != null) {
				count += this.booksOnShelf[i].getPages();
			}
		}
		return count;
	}
	
	public boolean addBook(Book bookToAdd) {
		
		//This method try to add book to shelf, if the process succeed the method will returns true, else false.
		//Input: this method get a book
		//Output: this method return true if the process succeed else false
		for (int i = 0; i < 5; i++) {
			if (this.booksOnShelf[i] == null) {
				this.booksOnShelf[i] = bookToAdd;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeBook(int bookNumberToRemove) {
		
		// Inputs: this method gets number of book to remove
		// Outputs: the method tries to remove the book if the process succeed the method will return true else false
		bookNumberToRemove-=1;
		Book toMove;
		if (bookNumberToRemove>4 || bookNumberToRemove<-1) {
			return false;
		}
		if (this.booksOnShelf[bookNumberToRemove] == null) {
			return false;
		}
		this.booksOnShelf[bookNumberToRemove] = null;
		for (int i = bookNumberToRemove; i < 5; i++) {
			if (this.booksOnShelf[i] == null) {
				toMove = this.booksOnShelf[i];
				this.booksOnShelf[bookNumberToRemove] = toMove;
				this.booksOnShelf[i] = null;
				break;
			}
		}
		return true;
	}
	
	public boolean isEmpty() {
		
		// This method returns true if the shelf is empty else false
		for (int i = 0; i < 5; i++) {
			if (this.booksOnShelf[i]!=null) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		
		// This method returns a string which describe the shelf
		String finalString ="";
		if (isEmpty()) {
			return finalString;
		}
		finalString= "The books on shelf number "+this.shelfNumber+" are:";
		for (int i = 0; i < 5; i++) {
			if (this.booksOnShelf[i]!=null) {
				finalString+="\n "+this.booksOnShelf[i].toString();
			}
		}
		return finalString;
	}
	
	public String extendedToString() {
		
		// This method returns a string which describe how many books on the shelf
		if (isEmpty()) {
			return "Shelf number "+this.shelfNumber+" is empty";
		}
		return "There are "+getNumberOfBooks()+" on shelf number "+this.shelfNumber;
	}
	
	public void print () {
		
		// Printing the shelf
		System.out.println(toString());
	}
}
