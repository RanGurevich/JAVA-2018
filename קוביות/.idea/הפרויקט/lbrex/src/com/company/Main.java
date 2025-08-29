package com.company;


public class Main {

    public static void main(String[] args) {
	    Book [] books = new Book[6];
	    books[0] = new Book("one","ran",1985,53);
	    books [1] = new Book();
	    books [2] = new Book("three","ran",2800,-5);
       Book x = new Book("four","ran",1874,83);
        books [4] = new Book("five","ran",1952,175);
        books [5] = new Book("six","ran",1571,2155);
        Shelf firstShelf = new Shelf(53);
        for (int i = 0; i < 6; i++) {
            firstShelf.addBook(books[i]);
        }
        Library check = new Library("LibraryCheck");
        check.setShelfInLibrary(firstShelf);
        System.out.println(check.toString());
        System.out.println(firstShelf.getNumberOfPages());
        Book [] books2 = new Book[3];
        
    }
}
