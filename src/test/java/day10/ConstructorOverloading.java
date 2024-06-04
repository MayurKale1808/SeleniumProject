package day10;

public class ConstructorOverloading {
	
	
	int x,y,z;
	double d;
	
	
	ConstructorOverloading()
	{
		x=10;
		y=20;
		
	}
	
	ConstructorOverloading(int a, int b)
	{
		x=a;
		y=b;
		
	}
	ConstructorOverloading(int a, double b)
	{
		x=a;
		d=b;
		
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading(200,300.5 );
		
		co.display();
		
		
		
	}

}
