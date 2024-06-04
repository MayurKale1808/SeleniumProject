package day16;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 
			HashSet  myset = new HashSet();
			
//	OR      Set myset = new HashSet();
	        
//Or		HashSet<Integer>  myset = new HashSet<Integer>();
		
			myset.add(100);
			myset.add(10.5);
			myset.add("Welcome");
			myset.add(null);
			myset.add(100);      // -------Duplicates not allowed
			myset.add(null);     //  ----------Multiple null not allowed
		
		
			System.out.println(myset);   //-----output ---[null, 100, 10.5, Welcome]
											//----order of the data also not fixed....randomly put the data
											//insertion not oreserved - means randomly put data
		
			System.out.println(myset.size());
			
	//remove value from hashset, as there is no index number we have to directly put the value
			
			myset.remove(10.5);
			
			System.out.println(myset); 		

//----Insertion of new value in between is not possible in HashSet... 			
	
//getting specific value from Hashset is also not possible.....
			
			
//			we can get data from hashset only by looping statement
			
			System.out.println("       ");       //-----just to create new space between two lines
			
			
			for(Object x:myset)
			{
				System.out.println(x);
			}
			
			
			
			
	}

}
