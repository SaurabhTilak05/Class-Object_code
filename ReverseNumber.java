/*
	 WAP to create class name as Reverse with two functions 
	void setNumber(): this function can accept the number from keyboard 
	void reverseNumber(): this function can reverse the number and display it
*/
import java.util.*;
public class ReverseNumber
{
	public int no;
	void setNumber(int no)
	{
		this.no=no;
	}
	void reverseNumber()
	{
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse is:"+rev);
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		ReverseNumber rev= new ReverseNumber();
		System.out.println("Enetr Number");
		int no=s.nextInt();
		rev.setNumber(no);
		rev.reverseNumber();
		
	}
}