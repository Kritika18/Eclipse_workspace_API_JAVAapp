package com.example.bookdata;



public class books {

    private int Bookid;
    private String Bookname;
    private String Authorfirstname;
    private int Bookisbnno ;
    
    private String Authorlastname ;
    private int Bookcategory  ;
    private String Bookcategoryid  ;
    private String Booksubject ; 
    private int BookPages ;
  //  private int Bookreleaseyear ;


    public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public void setAuthorfirstname(String authorfirstname) {
		Authorfirstname = authorfirstname;
	}

	public void setBookisbnno(int bookisbnno) {
		Bookisbnno = bookisbnno;
	}

	public void setAuthorlastname(String authorlastname) {
		Authorlastname = authorlastname;
	}

	public void setBookcategory(int bookcategory) {
		Bookcategory = bookcategory;
	}

	public void setBookcategoryid(String bookcategoryid) {
		Bookcategoryid = bookcategoryid;
	}

	public void setBooksubject(String booksubject) {
		Booksubject = booksubject;
	}

	public void setBookPages(int bookPages) {
		BookPages = bookPages;
	}

//	public void setBookreleaseyear(int bookreleaseyear) {
//		Bookreleaseyear = bookreleaseyear;
//	}

	public int getBookid() {
		return Bookid;
	}

	public String getBookname() {
		return Bookname;
	}

	public String getAuthorfirstname() {
		return Authorfirstname;
	}

	public int getBookisbnno() {
		return Bookisbnno;
	}

	public String getAuthorlastname() {
		return Authorlastname;
	}

	public int getBookcategory() {
		return Bookcategory;
	}

	public String getBookcategoryid() {
		return Bookcategoryid;
	}

	public String getBooksubject() {
		return Booksubject;
	}

	public int getBookPages() {
		return BookPages;
	}

//	public int getBookreleaseyear() {
//		return Bookreleaseyear;
//	}

	
}
