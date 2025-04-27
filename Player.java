// WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.

import java.util.*;
public class Player{
	private int id;
	private String name;
	private int run;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun(){
		return run;
	}
	
	public void DisplayPlayer()
	{
		System.out.println("ID is:"+id);
		System.out.println("Name is:"+name);
		System.out.println("Run is:"+run);
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Player p=new Player();
		System.out.println("Enter Id of the Player:");
		int id=s.nextInt();
		p.setId(id);
		s.nextLine();
		System.out.println("Enter Name of the Player:");
		String name=s.nextLine();
		p.setName(name);
		
		System.out.println("Enter Runs of the Player:");
		int run=s.nextInt();
		p.setRun(run);
		p.DisplayPlayer();
	}
	
}