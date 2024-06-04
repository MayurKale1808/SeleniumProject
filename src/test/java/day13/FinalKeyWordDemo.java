package day13;


class Test
{
	final int x=100;       // if we assign final to variable we have to compulsory assign value to it 
							// we can not keep it like  final int x;  
//	void 
	
}








public class FinalKeyWordDemo {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
//		t.x=200;            // we can not modify the value of x as we have assigned final key word
		
		System.out.println(t.x);
	}

}
