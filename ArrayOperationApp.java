/* Write a java program to create class name as ArrayOperation using contsructor overloading name as :
	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
*/
import java.util.*;
class ArrayOperation
{
	ArrayOperation(int a[])
	{
		int ar[]= new int[a.length];
		for(int i=0;i<ar.length;i++)
		{	ar[i]=a[i];
		}
		for(int i=0;i<ar.length;i++)
		{	
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.print("Ascending Sort Array:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		int arr[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Descending Sort Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	System.out.println(" ");	
	}
	
	
	ArrayOperation(int ar[], int a[])
	{
		
		int c[]=new int[ar.length + a.length];
		
		for(int i=0;i<ar.length;i++)
		{
			c[i]=ar[i];
		}
		for(int i=0;i<a.length;i++)
		{
			c[ar.length+i]=a[i];
		}
		System.out.print("Marge Array Is:");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
public class ArrayOperationApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[6];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		ArrayOperation arop=new ArrayOperation(ar);
		
		System.out.println("Enter First Array Elements for Merge");
		int arr[]=new int[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter second Array Elements for Merge");
		int a[]=new int[4];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		ArrayOperation arops=new ArrayOperation(arr, a);
	}
}