/*
	Write Program to perform method overriding you have to create class name as ArrParent with method
	void setValue(int arr[]): this method can accept array as parameter
	void arrangeSeq(): this method can display array as per user input sequence You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.
*/
import java.util.*;
class ArrParent
{
	int ar[];
	void setValue(int ar[])
	{
		this.ar=ar;
	}
	void arrangeSeq(){
		if(ar!=null)
		{
			System.out.println("Original Array");
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println("");
		}
		else{
			System.out.println("Array is Null");
		}
	}
}

class ArrangeAscendingOrder extends ArrParent{
	
	public void arrangeSeq(){
		super.arrangeSeq();
		if(ar!=null)
		{
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
			System.out.println("Ascending Order Array");
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
		else{
			System.out.println("Array is Null");
		}
	}
}


class ArrangeDescendingOrder extends ArrParent{
	
	public void arrangeSeq(){
		
		if(ar!=null)
		{
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					if(ar[i]>ar[j])
					{
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
			System.out.println("\nDescending Order Array");
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
		else{
			System.out.println("Array is Null");
		}
	}
}
public class SortAscDscRevArrMethodOver
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=s.nextInt();
		
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		ArrParent ap=new ArrangeAscendingOrder();
		ap.setValue(ar);
		ap.arrangeSeq();
		
		ap=new ArrangeDescendingOrder();
		ap.setValue(ar);
		ap.arrangeSeq();
		
		
	}
}