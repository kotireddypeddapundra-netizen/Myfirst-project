package com.langfundamentals;

public class LibraryBook {

	static String LibraryName="Vcube";
	static String LibrarianName="Ramesh";
	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;

	void displaybookdetails() {
		System.out.println("Book ID : "+bookid);
		System.out.println("Title : "+booktitle);
		System.out.println("Author : "+authorname);
		System.out.println("Available Copies "+availablecopies);
	}
	void issuebook() {
		if (availablecopies > 0) {
			availablecopies--;
			System.out.println("One copy issued successfully for: " + booktitle);
		} else {
			System.out.println("No copies available for: " + booktitle);
		}
	}
	static void displayLibraryDetails() {
        System.out.println("Library Name: " + LibraryName);
        System.out.println("Librarian Name: " + LibrarianName);
    }
//	 static void changeLibrarian(String newLibrarian) {
//	        LibrarianName = newLibrarian;
//	    }
//	

	public static void main(String[] args) {
		
		LibraryBook book1 = new LibraryBook();
        book1.bookid = 101;
        book1.booktitle = "Java Programming";
        book1.authorname = "James Gosling";
        book1.availablecopies = 5;
        
        LibraryBook book2 = new LibraryBook();
        book2.bookid = 102;
        book2.booktitle = "Data Structures";
        book2.authorname = "Mark Allen";
        book2.availablecopies = 2;
        
        System.out.println("--- Initial Library & Book Details ---");
        displayLibraryDetails();
        System.out.println("\nBook 1 Details:");
        book1.displaybookdetails();
        System.out.println("\nBook 2 Details:");
        book2.displaybookdetails();
        
        System.out.println("\n--- Issuing Books ---");
        book1.issuebook();
        book2.issuebook();
        
        System.out.println("\n--- Updated Book Details ---");
        System.out.println("\nBook 1 Updated Details:");
        book1.displaybookdetails();
        System.out.println("\nBook 2 Updated Details:");
        book2.displaybookdetails();

	}

}
