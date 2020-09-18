package library.model;

public class LibBook {

	private Long bookId;
	private String bookName;
	private String authorFirstName;
	private Long bookIsBnno;
	private String authorLastName;
	private String IssuedByUserId;
	private String bookSubject;
	private Integer bookPages;
	private String availability;
	// private int Bookreleaseyear ;

	public String getIssuedByUserId() {
		return IssuedByUserId;
	}

	public void setIssuedByUserId(String issuedByUser) {
		IssuedByUserId = issuedByUser;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

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
