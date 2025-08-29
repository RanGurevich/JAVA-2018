package com.company;

import java.awt.print.Book;

public class Library {
	private String libraryName; // The library name
	private Shelf[] shelfInLibrary = new Shelf[10]; // The Shelfs in the library
	
	public Library(String libraryName) {
		
		// Constructor with value
		this.libraryName = libraryName;
		init();
	}
	
	private void init() {
		
		// This function restart all the shelfs in the libary
		for (int i = 0; i < 10; i++) {
			this.shelfInLibrary[i] = new Shelf();
		}
	}
	
	// Get & set functions
	
	
	public Shelf[] getShelfInLibrary() {
		return shelfInLibrary;
	}
	
	public void setShelfInLibrary(Shelf shelfInLibary) {
		for (int i = 0; i < 10; i++) {
			if (this.shelfInLibrary[i].isEmpty()) {
				this.shelfInLibrary[i]=shelfInLibary;
				return;
			}
		}
		System.out.println("Set shelf failed. all the shelf in this library are full.");
	}
	
	public String getLibraryName() {
		return libraryName;
	}
	
	public void setLibraryName(String libaryName) {
		this.libraryName = libaryName;
	}
	
	public int getNumberOfBooks() {
		
		//The function returns how many books in the library
		int count = 0; // Books counter
		for (int i = 0; i < 10; i++) {
			if (this.shelfInLibrary[i]!=null) {
				count += this.shelfInLibrary[i].getNumberOfBooks();
			}
		}
		return count;
	}
	
	public int getNumberOfPages() {
		//The function returns how many pages in the library
		int count = 0; // Pages counter
		for (int i = 0; i < 10; i++) {
			if (this.shelfInLibrary[i]!=null) {
				count += this.shelfInLibrary[i].getNumberOfPages();
			}
		}
		return count;
	}
	
	public boolean addBook(Book bookToAdd) {
		
		//Input: the function gets a book
		//Output: the function return true if succeed else false
		for (int i = 0; i < 10; i++) {
			if (this.shelfInLibrary[i].addBook(bookToAdd))
				return true;
		}
		return false;
	}
	
	public boolean addBook(Book bookToaAdd, int shelfNumber) {
		
		//Input: the function gets a book
		//Output: the function return true if succeed else false
		if (shelfNumber > 10 || shelfNumber < 0) {
			return false;
		}
		if (this.shelfInLibrary[shelfNumber - 1].addBook(bookToaAdd)) {
			return true;
		}
		return false;
	}
	
	public boolean removeBook(int shelfNumber, int bookNumber) {
		
		//Inputs: The function gets shelf number and book number
		//Outputs: The function tries to remove the book, if the process succeed the function return true else false
		if (shelfNumber > 10 || shelfNumber < 0 || bookNumber > 5 || bookNumber < 0) {
			return false;
		}
		if (this.shelfInLibrary[shelfNumber - 1].removeBook(bookNumber)) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		
		// The function returns if the library empty from books
		for (int i = 0; i < 5; i++) {
			if (!this.shelfInLibrary[i].isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		
		// The function returns a string which describe the library
		String finalString = this.libraryName + "'s library contains " + this.getNumberOfBooks() + " books summing " + this.getNumberOfPages() + " pages.";
		if (isEmpty()) {
			return "";
		}
		
		for (int i = 0; i < 5; i++) {
			finalString += "\n" + this.shelfInLibrary[i].toString();
		}
		return finalString;
	}
	
	public String extendedToString() {
		
		// This method returns a string which describe how many books on the library
		if (isEmpty()) {
			return this.libraryName + "'s library is empty";
		}
		return "There are " + getNumberOfBooks() + " on this libarary.";
	}
	
	public void print() {
		
		// Printing information about the library
		System.out.println(toString());
	}
}
