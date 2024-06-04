package day15;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		
//		System.out.println(100/num);   			// ArithmeticException - if we provide some invalid input like '0'- 
		
		
		try 
		{
			System.out.println(100/num);
		}
		
		catch(Exception e)         
		{
//			e.printStackTrace();
//	 		System.out.println(e.getMessage());
			
			System.out.println("Exception thrown");
		}
		
		catch(ArithmaticException b)
		{
			System.out.println("Arithmatic exception");
		}
		String s = null;
		
		try 
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown");
		}
		
		
		System.out.println("Program is completed");
		System.out.println("Program is in Exited.. ");
	}

}
