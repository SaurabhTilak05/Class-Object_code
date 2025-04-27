//   . WAP to create POJO class name as Laptop with field id, name ,price and ram space
//	,hard disk space etc and input the details of laptop and display it

import java.util.*;
class Laptop
{
	private int id;
	private String name;
	private int price;
	private int ram;
	private  int disk;
	
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
	public void setRam(int ram){
		this.ram=ram;
	}
	public int getRam(){
		return ram;
	}
	public void setDisk(int disk){
		this.disk=disk;
	}
	public int getDisk(){
		return disk;
	}
	
	public void DisplayLaptopDetail(){
		System.out.println("Laptop id is:"+getId());
		System.out.println("Laptop Name is:"+getName());
		System.out.println("Laptop Price is:"+getPrice());
		System.out.println("Laptop Ram is:"+getRam());
		System.out.println("Laptop Disk is:"+getDisk());
	}
}
public class LaptopDetailApp{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Laptop lp=new Laptop();
		
		System.out.println("Enter Laptop id:");
		int id=s.nextInt();
		lp.setId(id);
		s.nextLine();
		
		System.out.println("Enter Laptop Name:");
		String name=s.nextLine();
		lp.setName(name);
		
		
		System.out.println("Enter Laptop Price:");
		int price=s.nextInt();
		lp.setPrice(price);
	
		
		System.out.println("Enter Laptop Ram :");
		int ram=s.nextInt();
		lp.setRam(ram);
		
		System.out.println("Enter Laptop Disk :");
		int disk=s.nextInt();
		lp.setDisk(disk);
		
		lp.DisplayLaptopDetail();
		
		
		
	}
}