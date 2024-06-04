package day15;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
//Example 1 ------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		
		System.out.println(100/num);  //if we provide some invalid input like '0'- ArithmeticException

//----------------------------------------------------------------------------------		
	
//Example 2------		
		
		int a[]= new int[5];   //0-4 indices
		
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
//		a[5]=600;    // ArrayIndexOutOfBoundsException - as array is of 5 integers only int[5]
		
		System.out.println("Enter the number for Array:");
		
		int inputNum=sc.nextInt();
		
		System.out.println("Enter position/Index for Array (0-4):");
		
		int pos = sc.nextInt();
		
		a[pos]=inputNum;
		
		System.out.println(a[pos]);
		
//Example 3 ------------------------------------------------------
		
		
		String s = "Welcome";
		
		int q = Integer.parseInt(s);
		
		System.out.println(q);    // NumberFormatException as we can not convert alphabets into number
		
		
		
		
		System.out.println("Program is completed");
		System.out.println("Program is in Exited.. ");

	}

}
