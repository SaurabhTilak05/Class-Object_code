/*
	Q1. WAP to create class name as Table with two functions 
	void setValue(): this function is used for accept number from keyboard 
	void showTable(): this function can display the table of number 
*/
import java.util.*;
public class Printtable 
{
	private int no;
	void setValue(int no)
	{
		this.no=no;
	}
	void showTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*no);
		}
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Printtable t=new Printtable();
		System.out.println("Eneter value");
		int val=s.nextInt();
		t.setValue(val);
		t.showTable();
	}
}