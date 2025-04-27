/*
	WAP to create class name as Perfect with two functions 
	void setValue(): this function can accept number as parameter 
	void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect

*/
import java.util.*;
public class CheckPerfect
{
	public int no;
	void setValue(int no)
	{
		this.no=no;
	}
	void checkPerfect()
	{
		int sum=1;
		for(int i=2;i*i<=no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
				if(i*i!=no)
				{
					sum=sum+no/i;
				}
			}
		}
		if(sum==no)
		{
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not A Perfect Number");
		}
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		CheckPerfect ck=new CheckPerfect();
		System.out.println("Enter Number");
		int n=s.nextInt();
		ck.setValue(n);
		ck.checkPerfect();
	}
}