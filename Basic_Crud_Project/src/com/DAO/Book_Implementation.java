package com.DAO;

import java.util.Scanner;

import com.bean.BookInfo;

public class Book_Implementation implements BookDetails {

	BookInfo b[] = new BookInfo[3];
	Scanner sc = new Scanner(System.in);

	int count;

	public Book_Implementation() {
		count = 0;
	}

	@Override
	public void search(int id) {

		for (int i = 0; i < count; i++) {
			if (b[i] != null) {
				if (b[i].bookId == id) {
					System.out.println(b[i]);
				}
			}
		}

	}

	@Override
	public void insert() {

		System.out.println("enter the number of books..");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("enter the id of book");
			int bid = sc.nextInt();
			System.out.println("enter the name of book");
			String bname = sc.next();
			System.out.println("enter the price of book");
			int bprice = sc.nextInt();

			b[count] = new BookInfo(bid, bname, bprice);
			count++;
		}

	}

	@Override
	public void update(int id) {

		System.out.println("enter the choice for boook");
		System.out.println("1.id \n2.name \n3.price ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("enter the new bookid");
			int updateId = sc.nextInt();

			for (int i = 0; i < count; i++) {
				if (b[i].bookId == id && b[i] != null) {
					b[i].bookId = updateId;
				}
			}
			break;

		case 2:
			System.out.println("enter the new book name");
			String updateName = sc.next();

			for (int i = 0; i < count; i++) {
				if (b[i].bookId == id && b[i] != null) {
					b[i].bookName = updateName;
				}
			}
			break;
			
			
		case 3:
			System.out.println("enter the new price");
			int price = sc.nextInt();

			for (int i = 0; i < count; i++) {
				if (b[i].bookId == id && b[i] != null) {
					b[i].price = price;
				}
			}
			break;

		}
	}

	@Override
	public void delete(int id) {

		for (int i = 0; i < count; i++) {
			if (b[i] != null) {
				if (b[i].bookId == id) {
					b[i] = null;
				}
			}
		}
		System.out.println("Deleted done....");
	}

	@Override
	public void displayAllBooks() { 

		for (int i = 0; i < count; i++) {
			System.out.println(b[i]);
		}
	}

}
