package com.mayur.LMS;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> bookList = new ArrayList<>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		this.bookList.add(book);
	}

	public void ViewBooks() {
		for (Book book : bookList) {
			System.out.println(book);
		}
	}

	public void removeBook(String isbn) {
		bookList.removeIf(bk -> bk.getIsbn().equals(isbn));
	}

	@Override
	public String toString() {
		return "Library [bookList=" + bookList + "]";
	}

}
