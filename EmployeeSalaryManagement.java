/*
	Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 		
	Note- for a week only 40 hours of working are allowed. 
	1. Create class Employee with data member ID, Name, total working, salary, overtime
	Set Information by using a constructor and create a display Information() method to
	display all information with salary.
	2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
	void calculateOvertime() to calculate overtime. 
*/
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int workhr;
	private int sal;
	private int over;
	
	Employee(int id, String name, int workhr, int sal)
	{
		this.id=id;
		this.name=name;
		this.workhr=workhr;
		this.sal=sal;
		
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getWork(){
		return workhr;
	}
	public int getSal(){
		return sal;
	}
	public int getOver(){
		return over;
	}
	
	
	public void DisplayInfo(){
		
		System.out.println("----------------------------------");
		System.out.println("Id :  "+getId());
		System.out.println("Name:  "+getName());
		System.out.println("Work: "+getWork());
		System.out.println("Sal: "+getSal());
		
		
		
		
	}
} 
class OverTime
{
	Employee e[];
	void setEmployee(Employee e[]){
		this.e=e;
	}
	void calculateOvertime(){
		System.out.println("Employee Over time information ");
		
		for(int i=0;i<e.length;i++)
		{
			int ot=0;
			e[i].DisplayInfo();
			if(e[i].getWork()>40)
			{
				ot=e[i].getWork()-40;
			}
			int overtime=ot*50;
			System.out.println("----------------------------------");
			System.out.println("Over time is:"+ot);
			System.out.println("Over Time Salary is:"+overtime);
		}
		
	}
	
}
public class EmployeeSalaryManagement{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number Of Employee Add");
		int n=s.nextInt();
		Employee em[]=new Employee[n];
		for(int i=0;i<em.length;i++)
		{
		
			System.out.println("Enter Id Of Employee");
			int id=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter Employee Name");
			String name=s.nextLine();
			
			System.out.println("Enter Work Of Employee");
			int w=s.nextInt();
			
			System.out.println("Enter salary Of Employee");
			int sal=s.nextInt();
			
		//	System.out.println("Enter Over time Of Employee");
		//	int ov=s.nextInt();
			em[i]=new Employee(id, name, w, sal);
		}
		
		OverTime o=new OverTime();
		o.setEmployee(em);
		o.calculateOvertime();
	}
}