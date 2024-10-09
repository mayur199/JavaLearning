package com.mayur.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> booksList;

	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

	public void addBook(Book book) {
		this.booksList = new ArrayList<>();
		this.booksList.add(book);
	}

	public void viewBook() {
		System.out.println("Book Details: ");
		for (Book book : booksList) {

			System.out.println(book);
		}
	}

	public void removeBook(Book book) {
		//this.booksList.remove(book);
		for (Book b : booksList) {
			if ( b.getIsbn().equals(book.getIsbn())) {
				booksList.remove(book);
			}
		}
        //booksList.removeIf(b -> b.getIsbn.equals(book.getIsbn()));

	}

	@Override
	public String toString() {
		return "Library [booksList=" + booksList + ", getBooksList()=" + getBooksList() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
