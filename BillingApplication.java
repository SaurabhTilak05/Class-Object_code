/*
	WAP to create billing application 
	Classes 
	Customer : id,name and mobile mark as POJO class
	Product class: id,name,price,qty,rate 
	Bill class contain method 
	void calBill(Customer c,Product …p): this function can accept single customer detail and multiple product details and your output should like as
*/
import java.util.*;
class Customer{
	private int id;
	private String name;
	private int contact;
	
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
	
	public void setContact(int contact){
		this.contact=contact;
	}
	public int getContact(){
		return contact;
	}	
}
class Product   //id,name,price,qty,rate 
{
	private int pid;
	private String name;
	private int price;
	private int qty;
	private int rate;
	
	public void setId(int pid)
	{
		this.pid=pid;
	}
	public int getId(){
		return pid;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}


}

class Bill{  	// void calBill(Customer c,Product …p)
	 Customer c; 
	Product p;
	
	void calBill(Customer c,Product ...p)
	{
		
		double totalbill=0;
		System.out.println("---------------- Customer Details ------------------");
		System.out.println("Customer Id :"+c.getId());
		System.out.println("Customer Name :"+c.getName());
		System.out.println("Customer Contact :"+c.getContact());
		System.out.println(" ");
		
		
		System.out.println("---------------- Product Details ------------------");
		System.out.println(" Id \t Name \t Price \t qty \t total"); 
		for(int i=0;i<p.length;i++)
		{
			Product prod=p[i];
			double total=prod.getPrice()*prod.getQty();
			totalbill=totalbill+total;
			System.out.println(prod.getId()+"\t"+prod.getName()+"\t"+prod.getPrice()+"\t"+prod.getQty()+"\t"+total);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Total Bill \t\t\t"+totalbill);
		
		
	}
}
public class BillingApplication
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Customer cs=new Customer();
		System.out.println("Enter Customer id:\t");
		int id=s.nextInt();
		cs.setId(id);
		s.nextLine();
		
		System.out.print("Enter Customer name:\t");
		String name=s.nextLine();
		cs.setName(name);
		
		System.out.print("Enter Customer Contact:\t");
		int cont=s.nextInt();
		cs.setContact(cont);
		
		System.out.print("Enter Numbers of Products:\t");
		int np=s.nextInt();
		
		Product p[]=new Product[np];
		
		for(int i=0;i<p.length;i++) // id,name,price,qty,rate 
		{
			
			System.out.println("Enter Product "+(i+1)+" Dtails");
			
			Product pd=new Product();
			System.out.print("Enter Product Id:\t");
			int idp=s.nextInt();
			pd.setId(idp);
			s.nextLine();
			
			System.out.print("Enter Name of Product:\t");
			String na=s.nextLine();
			pd.setName(na);
			
			System.out.print("Enter Price of Product:\t");
			int pr=s.nextInt();
			pd.setPrice(pr);
			
			System.out.print("Enter Quentity of Product:\t");
			int qty=s.nextInt();
			pd.setQty(qty);
			
			p[i]=pd;
		}
		
		Bill b=new Bill();
		b.calBill(cs, p);
		
	}
}