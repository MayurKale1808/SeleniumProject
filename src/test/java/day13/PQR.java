package day13;

public class PQR extends MNO implements ABC, XYZ
{
	
// We can implement multiple interfaces but can extends only
// ONE class at a time , as its multiple inheritance
	
	public void m2() 
	{
		
		System.out.println("this is from XYZ");
		System.out.println(y);
	}

	
	public void m1() 
	{
		
		System.out.println("this is from ABC");
		System.out.println(x);
		
	}
	
	
	

	public static void main(String[] args) {
		
		PQR obj= new PQR();
		
		
		obj.m1();
		obj.m2();
		obj.m3();

	}

	

}
