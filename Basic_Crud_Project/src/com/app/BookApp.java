package com.app;

import java.util.Scanner;

import com.DAO.Book_Implementation;

public class BookApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book_Implementation bi = new Book_Implementation();
		char ch;
		
		
		do {
		System.out.println("enter the choice for boook");
		System.out.println("1.insert \n2.display \n3.update \n4.delete \n5.search");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:bi.insert();
		break;
		case 2:bi.displayAllBooks();
		break;
		case 3:
		System.out.println("enter the id ");
		int upId=sc.nextInt();
		bi.update(upId);
		break;
		case 4:
		System.out.println("enter the id ");
		int deId=sc.nextInt();
		bi.delete(deId);
		break;
		case 5:
		System.out.println("enter the id ");
		int seId=sc.nextInt();
		bi.search(seId);
		break;
		
		default: System.out.println("Invalid operation");
		}
		
		System.out.println("do you want continue");
		ch=sc.next().charAt(0);
				
		}while(ch=='y' || ch=='Y');

	}
}
