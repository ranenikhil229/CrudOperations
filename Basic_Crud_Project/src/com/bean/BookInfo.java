package com.bean;

public class BookInfo {
	
	public int bookId;
	public String bookName;
	public int price;
	
	public BookInfo(int bookId,String bookName,int price)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	
	public String toString()
	{
		return bookId+" "+bookName+" "+price;
	}

}
