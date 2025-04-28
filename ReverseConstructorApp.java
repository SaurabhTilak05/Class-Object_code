/*   Write a java program to create class name ReverseApp using constructor name as :
	ReverseApp(int [ ])
	{
		//  perform integer reverse array logic.
	}
	ReverseApp(String )
	{
		//  perform string reverse logic.
	}
*/
import java.util.*;
class ReverseApp
{
	ReverseApp(int ar[])
	{
		for(int i=0;i<ar.length/2;i++)
		{
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
		System.out.print("Reverse Integer Array is:\t");
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
	
	ReverseApp(String srt)
	{
			System.out.println("");
		String st="";
		for(int i=0;i<srt.length();i++)
		{
			st=srt.charAt(i)+st;
		}
		System.out.println("Reverse String is:\t"+st);
	}
	
}
public class ReverseConstructorApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		s.nextLine();
		System.out.println("");
		System.out.println("Enter String ");
		String srt=s.nextLine();
		
		ReverseApp rv=new ReverseApp(ar);
		ReverseApp rev=new ReverseApp(srt);
		
		
	}
}