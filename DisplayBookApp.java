 //   WAP to create POJO class name as Book  with field id,name and 
//    price and author and input the book details and display it.
import java.util.*;
 class Book{
	private int id;
	private String name;
	private int price;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	
	public void DisplayBook(){
		System.out.println("Book id:"+id);
		System.out.println("Book Name:"+name);
		System.out.println("Book Price:"+price);
	}
}
public class DisplayBookApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Book b=new Book();
		System.out.println("Enter Id of Book");
		int id=s.nextInt();
		b.setId(id);
		s.nextLine();
		System.out.println("Enter Name of Book");
		String n=s.nextLine();
		b.setName(n);
		
		
		System.out.println("Enter Price of Book");
		int price=s.nextInt();
		b.setPrice(price);
		
		b.DisplayBook();
		
	}
	
}