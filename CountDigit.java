/*
	WAP to create class name as CountDigit with two functions 
 void setValue(): this function can accept number from keyboard 
 void showDigitCount(): this function can count the digit and display it.


*/
import java.util.*;
public class CountDigit
{
	public int n;
	void setValue(int n){
		this.n=n;
	}
	void showDigitCount(){
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Count is:"+count);
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numeber");
		int no=s.nextInt();
		CountDigit ct=new CountDigit();
		ct.setValue(no);
		ct.showDigitCount();	
	}
}