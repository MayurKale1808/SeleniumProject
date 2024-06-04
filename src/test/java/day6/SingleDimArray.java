package day6;

import java.util.Arrays;

public class SingleDimArray {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*1) Declare an array
	2) insert values into array
	3) Find size of an array
	4) read single value from an array
	5) read multiple values from an array
	*/
		
		int a[]=new int[10];
		
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		
		System.out.println("Print the number:" + a[2]);
		
		/*--------------------------------------------------------------------------------------------*/


		int b[]= {100, 200, 300, 400, 500, 600, 700};
		
		System.out.println(b.length);
		
//get single value from array
		
		System.out.println(b[5]);
		
//get all the values from array
		
		
		System.out.println(Arrays.toString(b));
		
//grt all the values from array using loop
		
		for (int i = 0; i < b.length; i++)     // for(int i=0; i<7; i++)
		{
			System.out.println(b[i]);          // if we dont know the exact length of array and we have to get all elements
		}
		
//for each loop OR Enhanced for loop
		
		//read data from array using enhanced for loop
		
		int n[]= {1000, 2000, 3000, 4000, 5000 };
		
		for(int x:n ) 
		{
			System.out.println(x);
		}
		
		
// Two dimentional Array
		
		int m[][]= new int[3][2];
		
		m[0][0]=100;
		m[0][1]=200;
		m[1][0]=300;
		m[1][1]=400;
		m[2][0]=500;
		m[2][1]=600;
		
		
		int p[][]= { {100,200},{300,400},{500,600} };   	// { {100,200},
															//   {300,400},
	//length of Array , Number of rows and column		    //   {500,600} }
		
		System.out.println(p.length); // row length
		
		System.out.println(p[0].length);     //we have to specify atleast 1 row to get column number as all rows have same number of columns
		
	//Read specific value from Multidimn arrays
		
		System.out.println(p[2][1]);
		
	// read all the data one by one from array using classic for loop
		
		for(int r=0; r<p.length; r++)       //we have to write two for loops one for row and one for column
		{
			for(int c=0; c<p[r].length; c++)
			{
				System.out.println(p[r][c]);
			}
		}
		
		for(int x[]:p) 
		{
			for(int v:x) 
			{
				System.out.println(v);
			}
		}
		
		
		
		
	//Object type of Array
		
	//	When you create Object type variable , you can store any type of data
	//  Object is a predefined class in JAVA 
		
		Object t[]=new Object[5];
		
		t[0]= 100;
		t[1]= 10.5;
		t[2]= "Welcome";
		t[3]= "A";
		t[4]= true;
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
