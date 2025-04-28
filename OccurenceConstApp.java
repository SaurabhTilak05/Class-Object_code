/* Write a java program to create class name as OccurenceApp using contsructor name as :
	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}
*/
import java.util.*;
class OccurenceApp
{
	OccurenceApp(int ar[])
	{
		int even=0;
		int odd=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even++;
			}
			else if(ar[i]%2==1){
				odd++;
			}
		}
		System.out.println("Even Number Count is:"+even);
		System.out.println("Odd Number Count is:"+odd);
	}
	OccurenceApp(char chh[])
	{
		int v=0;
		int c=0;
		
		for(int i=0;i<chh.length;i++)
		{
				char ch=Character.toLowerCase(chh[i]);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
				v++;
			}
			else {
				c++;
			}
		}
		System.out.println("Vowel Count is:"+v);
		System.out.println("Consonent Count is:"+c);
	}
	
}
public class OccurenceConstApp{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=s.nextInt();
		System.out.println("Enter Array Elements");
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Character Array Size");
		int si=s.nextInt();
		System.out.println("Enter Character Array Elements");
		char a[]=new char[si];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next().charAt(0);
		}
		OccurenceApp oc=new OccurenceApp(ar);
		OccurenceApp occ=new OccurenceApp(a);
		
	}
}