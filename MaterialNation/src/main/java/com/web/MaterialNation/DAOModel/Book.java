package com.web.MaterialNation.DAOModel;

public class Book {

	private Long bookId;
	private String bookName;
	private String authorFirstName;
	private Long bookIsBnno;
	private String authorLastName;
	private String bookCategory;
	private Integer bookCategoryId;
	private String bookSubject;
	private Integer bookPages;
	// private int Bookreleaseyear ;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public Long getBookIsBnno() {
		return bookIsBnno;
	}

	public void setBookIsBnno(Long bookIsBnno) {
		this.bookIsBnno = bookIsBnno;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Integer getBookCategoryId() {
		return bookCategoryId;
	}

	public void setBookCategoryId(Integer bookCategoryId) {
		this.bookCategoryId = bookCategoryId;
	}

	public String getBookSubject() {
		return bookSubject;
	}

	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}

	public Integer getBookPages() {
		return bookPages;
	}

	public void setBookPages(Integer bookPages) {
		this.bookPages = bookPages;
	}

}
