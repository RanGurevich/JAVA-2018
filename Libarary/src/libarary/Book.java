package libarary;



public class Book {
	private String name; // The book name

	private String author; // The author name
	private int pages; // The amount of pages in the book
	private int year;  // The publishing year of the book
	
	public Book() {
		
		// Defult consructor
		this.name="";
		this.author="";
		this.pages=0;
		this.year=0;
	}
	
	public Book ( String name, String author, int year, int pages) {
		
		// Consructor this values
		this.name=name;
		this.author=author;
		this.pages=(pages<0) ? 0 : pages;
		this.year = (year >=2017 || year<0) ? 0: year;
	}
	
	// Get & set
	
	
	public int getPages() {
		return this.pages;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPages(int pages) {
		if (pages>0) {
			System.out.println("Set pages failed. pages number cannot be negative");
		}
		else {
		this.pages=pages;
		}
	}
	
	public void setYear(int year) {
		if (year>0 && year>2017) {
			System.out.println("Set year failed. year cannot be  or bigger then 2017");
		}
		else {
			this.pages=pages;
		}
	}
	
	public void set ( String name, String author, int year, int pages) {
		
		//input: The function gets the book info and change them
		this.name=name;
		this.author=author;
		this.pages=(pages<0) ? 0 : pages;
		this.year = (year >=2017 && year<0) ? 0: year;
	}
	
	public boolean isEmpty() {
		
		// Check if the book is as his default constructor.
		return (year == 0 && pages == 0 && this.name == "" && this.author == "") ? true : false;
	}
	
	@Override
	public String toString() {
		// Information about the book
		return (isEmpty()) ? "" : "Book name: " +this.name +" by "+this.author+". "+this.pages+" pages. Year: "+this.year;
	}
	
	public void print() {
		// Printing the book
		System.out.print(toString());
	}
}

