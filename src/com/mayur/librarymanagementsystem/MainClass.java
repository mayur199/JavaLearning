package com.mayur.librarymanagementsystem;

public class MainClass {

	public static void main(String[] args) {
		Library l = new Library();
		Book b = new Book();
		b.setAuthor("akash");
		l.addBook(b);
		l.viewBook();
		l.removeBook(b);
		l.viewBook();
		l.removeBook(b	);
		l.viewBook();


        
	}
}
