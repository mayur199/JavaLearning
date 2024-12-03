package com.mayur.lms;



public class MainClass {
	public static void main(String[] args) {
		Library lib = new Library();

		Book b1 =new Book();
		b1.setTitle("AA");
		b1.setAuthor("abc");
		b1.setIsbn("132");
		Book b2 =new Book();
		b2.setTitle("BB");
		b2.setAuthor("bcd");
		b2.setIsbn("111");
		Book b3 =new Book();
		b3.setTitle("CC");
		b3.setAuthor("cdd");
		b3.setIsbn("121");
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.ViewBooks();
		lib.removeBook("111");
		lib.ViewBooks();
	}

}
