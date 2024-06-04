package day10;

public class ThisKeyword {
	
	
	int x,y;
	
//	void setData(int x, int y) 
//	{
//		this.x=x;
//		this.y=y;
//		
//	}
	
	ThisKeyword(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void display() 
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	

	public static void main(String[] args) {
		
//		ThisKeyword th = new ThisKeyword();
		
		ThisKeyword th = new ThisKeyword(200, 300);
		
//		th.setData(10, 20);
		th.display();
		
		
		
	}

}
