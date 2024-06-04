package day14;

public class DataConversionMethod {
	
	public static void main (String[] args) {
		
		
//Sting to Integer------------------		

		String s = "Welcome";
		
//		Int a = Integer.parseInt("Welcome");   //---We can not convert Alphabets String into Number--It throws 
												// Number Fromat Exception
		
		String a = "10";
		
		String b = "20";
		
		System.out.println(a+b);   		//it performs normal concat operation
		
		
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));   //this is how we can add two integer String 
																		//by converting into Integer format.
		
//String to Double
		
		String p = "100.50";
		
		String q = "100.50";
		
		System.out.println(Double.parseDouble(p)+Double.parseDouble(q));
		
//	----------OR----------
		 
		double j = Double.parseDouble(p);
		
		double k = Double.parseDouble(q);
		
		System.out.println(j+k);
		
		
// String to Boolean
		
		
		String n = "true";
		
		System.out.println(Boolean.parseBoolean(n));
		
		
//int , char, double, boolean to String----------
		
		int y = 90;
		double r = 10.10;
		char w = 'A';
		boolean i = false;
		
		System.out.println(String.valueOf(y));  // these are all string formats
		System.out.println(String.valueOf(r));
		System.out.println(String.valueOf(w));
		System.out.println(String.valueOf(i));

		

		
		
		
		
		
	}

}
