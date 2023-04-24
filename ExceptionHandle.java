package javaPrograms;
import java.util.*;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		System.out.print("enter a no");
		int x = ob.nextInt();
		
		System.out.print("enter a no");
		int y = ob.nextInt();
		
		try{
			System.out.println(x/y);        //this is the line can produce exception
			}
		
		
		
		
		catch(ArithmeticException e)
		{
			int s=100/0;
			System.out.println("exception");
		}
		
		System.out.println("After the try and catch");
		

	}

}
