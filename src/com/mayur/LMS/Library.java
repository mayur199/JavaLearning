package com.mayur.LMS;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> BookList = new ArrayList<>();

	public List<Book> getBookList() {
		return BookList;
	}

	public void setBookList(List<Book> bookList) {
		BookList = bookList;
	}
	
	public void addBook(Book book) {
		this.BookList.add(book);
	}
	
	public void ViewBooks() {
		for (Book book : BookList) {
			System.out.println(book);
		}
	}
	
	public void removeBook(String isbn) {
		BookList.removeIf(bk -> bk.getIsbn().equals(isbn));
}

	@Override
	public String toString() {
		return "Library [BookList=" + BookList + ", getBookList()=" + getBookList() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
