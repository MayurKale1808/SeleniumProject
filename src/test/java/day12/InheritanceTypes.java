package day12;


class A
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}



class B extends A
{
	int b ;
	
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c ;
	void print()
	{
		System.out.println(c);
	}
	
}



public class InheritanceTypes {

	public static void main(String[] args) {
		
		C bobj = new C();
		
		B bc = new B();
		
		bc.show();
		System.out.println(bc.a=700);
		
		bobj.a= 10;
		bobj.b=40;
		bobj.c = 30;
		
		
		System.out.println(bobj.a);
		
		System.out.println(bobj.b);
		System.out.println(bobj.c);
		
		
		bobj.display();
		
		bobj.show();
		bobj.print();
		
		
	}

}







