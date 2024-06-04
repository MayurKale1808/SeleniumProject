package day16;

import java.util.ArrayList;


//class Employee
//{
//	int empno;
//	String empName;
//	
//	void displ()
//	{
//		//code
//	}
//
//}


public class ArrayListDemo {

	public static void main(String[] args) {
		
//		ArrayList myist = new ArrayList();
		
//		ArrayList<Integer> myList = new ArrayList<Integer>(); //we can specify wrapper class for homogeneous data
																//homogeneuous- only same data type
//		List mylist = new ArrayList();
	
		ArrayList mylist = new ArrayList();
		
		
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		Employee emp3 = new Employee();
		
		
//	Adding data elements into arraylist------------
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");    //In Arraylist we can store different data types, primitive,notprimitive
		mylist.add(true);			//as well ass object also -----group of element 
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
//		mylist.add(emp1);
//		mylist.add(emp2);
		
//----Size of array list -----in array we used .length()----
		
		System.out.println(mylist.size());
		
		System.out.println(mylist);    //--Direct print data from Arraylist
										//[100, 10.5, Welcome, true, 100, null, null]
		
		//remove value from arraylist
		
		mylist.remove(5);
		
		System.out.println(mylist);
		
//.add()---will add the data into end of the list
//.add(index, data) ---will insert the data in the middle of the list		

		
		mylist.add(2, "Java"); 
		
		System.out.println(mylist);
		
//to get specific value from array list
		
		
		mylist.get(3);
		System.out.println(mylist.get(3));
		
//to read all the data one by one from Arraylist, we have to use looping statement
		
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
//clear all data from arraylist
		
		mylist.clear();
		
		System.out.println(mylist);
		
		
		
		
		
		
		
		
	}

}
