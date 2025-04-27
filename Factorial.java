/*
	Q2. WAP to create class name as Factorial with two functions 
	void setNumber(): this function can accept the number as parameter
	void displayFactorial(): this function can display the factorial of number  
*/
import java.util.*;

public class Factorial
{
	private int no;
	void setNumber(int no)
	{
		this.no=no;
	}
	void displayFactorial()
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Factorial fact=new Factorial();
		System.out.println("Eneter Value ");
		int val=s.nextInt();
		fact.setNumber(val);
		fact.displayFactorial();
	}
}

