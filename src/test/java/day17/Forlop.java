package day17;

import java.util.ArrayList;

public class Forlop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr2={1,2,3,4,5,6,12};
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i] + ": is not multiple of 2");
			}
		}
		
		for(int r: arr2)
			
		{
			if(r % 2==0)
			{
				System.out.println(r);
				break;
			}
			else
			{
				System.out.println(r + ": is not multiple of 2");
			} 
		}
		//arraylist is used to store number of dynamic data. 
		ArrayList<String> arrlst = new ArrayList<String>();
		
		arrlst.add("Mayur");
		arrlst.add("Bhushan");
		arrlst.add("Rahul");
//		arrlst.remove(2);
		System.out.println(arrlst.get(2));
		
		
//		String is an object that represents sequence of characters.
		
//		two ways to define string, 1) String literal, 2) new memory allocate operator
		
		String g = "Mayur Rahul Rohit"; //in these cases java will not create new variable as the input is same
		String k = "Mayur Rahul Rohit"; //for both the strings,it will just point out 'k' to the location of 'g'. 
		String p = "Hello";
		
		
		String m = new String("Welcome"); //Here the value will get store again though its a repetitive input
		String l = new String("Welcome"); // as we are creating an object.
		
		String q = "Manya Nupur Sarthak";
		
//      String[] spltdstrng = q.split(" ");
		
		String[] spltdstrng = q.split("Nupur");
		 
		 System.out.println(spltdstrng[0]);
		 System.out.println(spltdstrng[1]);
//		 System.out.println(spltdstrng[2]);
		 
		 System.out.println(spltdstrng[1].trim());
		 
		 for(int i=0; i<q.length(); i++)
		 {
			 System.out.println(q);
			 
		 }
		 
		 
		
		
		
		
		
		
	}

}
