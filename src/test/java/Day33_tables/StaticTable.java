package Day33_tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//Find total number of rows in the table
		
//we have two approach first locate the table and count all the <tr> tags as number of <tr> represents all the rows
		
//		1st aproach
              
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();    //this we have to use when we have multiple tables on a single web page
		
	//	int rows=driver.findElements(By.tagName("tr")).size();     //it will alsom return the same but only if we have single table on web page, otherwise it will give a count of all the rows of all the tables on the web page
		
		System.out.println(rows);
		
//Now number of columns

 //in first <tr> tag we have
 //<th> tag that represents the header as well as number of column in the tabel
 
// 			xpath to locate all columns i.e all headers - -  
		
		//  1)   //table[@name='BookTable']//tr[1]//th
		
		// 2) //table[@name='BookTable']//th          these both are right
		
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();   //multiple tables
		
	//	int cols = driver.findElements(By.tagName("th")).size();    //only for single table
		
		
		System.out.println(cols);
		
		
//Q) read the data from specific row and column (eg 5th row and 1st column)
		
		
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();  //we have to locate in such way theat we should reach the exact number from column and row like matrix
																											//now after locating this element i.e particular box even if the text chnage in future we can still get with the same xpath
		System.out.println(bookname);
		
//now to locate any row any column we can use the same xpath just need to change the row and column number
		
		
		String At = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[2]")).getText();
		
		System.out.println(At);
		
	
//Q) to read all the column and row ----we have to use looping statement
		
		//table[@name='BookTable']//tr[7]//td[2]---with this xpath only we can get all places from table
		//so now we have to put this xpath into looping statement
		
//		outer for loop to repeat the rows
//   	inner for loop to repeat the columns
		
//If we want to print header also we have to print it seperately as header in DOM has TH tag, and we are using to print data td' tag		
		
//	if in header also there is same 'td'tag you can use the same loop starting r=1	
		
// To print header now
		
		
		
		System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		
		
		
		for(int r=2; r<=rows; r++)         //here we have taken 'rows' as we have already taken count of rows in int rows 
		{		
											// we took r=2, as first row is header part our actual data starts from 2nd row
			for(int c=1; c<=cols; c++)
			{								//here we have taken 'cols' as we have already taken count of column in int cols
				
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				
//				System.out.println(value);
				
//Q)if we have to print data in same tabular format
				
				System.out.print(value+ "\t");    //java command \t -  after prnting value it will give one tabs pace
				
			}
			System.out.println(); //after completing inner for loop this will jump to the next line
			
															
															//we can not pass the variable in xpath like r' and c' dynamically changing
															//if we have to pass we have to follow particular syntax "+r+" and "+c+"
		}
															// this is the syntax to pass the parameter to the xpath remember it
		
		
		
		
		
//Q)Print all the Author names , we just have to loop row and keep column for author constant 
		
		
//		for(int R=2; R<=rows; R++)
//		{
//			String AuthorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[2]")).getText();
//			
//			System.out.println(AuthorName);
//		}
		
		
		
		
		
		
		
//Q) Print  book names whose author is Mukesh
		
		for(int R=2; R<=rows; R++)
		{
			String AuthorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[2]")).getText();
			
			if(AuthorName.equals("Mukesh"))
			{
				String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[1]")).getText();
				
				System.out.println(BookName+"\t"+AuthorName);
			}
		}
		
	
		
		
//Q) print all the prices from price column
		
		for(int R=2; R<=rows; R++)
		{
			String prices = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[4]")).getText();
			
			System.out.println(prices);
		
		}
		
		
		
		

//Q) Find the total price of the books, toatl of coulmn 4
		
		
//		Here we can not do addition as the price in the table is in string format, 
//		so first we have to conver into integer before doing addition of all
		
		int total=0;
		
		for(int R=2; R<=rows; R++)
		{
			String prices = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[4]")).getText();
			
			total=total+Integer.parseInt(prices);   //here in every operation the price is getting added into total
													//thats why to print last toatal price we have to print total out of loop
		
			
			
		}
		System.out.println(total);    

		
		
	}

}
