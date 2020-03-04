package com.bean;

public class Book {
	int Bookid;
	String Bookname;
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", Bookname=" + Bookname + "]";
	}

}
