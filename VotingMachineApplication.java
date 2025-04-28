
/*
 * WAP Voting application using method with variable argos concept
	Voter: id name and age mark as POJO class 
	VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then
 	display its data otherwise not
	VotingMachineApp: this method cantais voter details and pass to VotingMachine class 
*/
import java.util.*;

class Voter {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;

}

class VotingMachine {
	Voter v;

	void acceptWord(Voter... v) {

		System.out.println("Eligible Voters Are");
		System.out.println("Id \t Name \t Age");
		for (int i = 0; i < v.length; i++) {
			if (v[i].getAge() >= 18) {
				System.out.println(v[i].getId() + "\t" + v[i].getName() + "\t" + v[i].getAge());
			}
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Not Eligible Voters Are");
		System.out.println("Id \t Name \t Age");
		for (int i = 0; i < v.length; i++) {
			if (v[i].getAge() < 18) {
				System.out.println(v[i].getId() + "\t" + v[i].getName() + "\t" + v[i].getAge());
			}
		}
	}
}

public class VotingMachineApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Voters");
		int n = s.nextInt();
		Voter v[] = new Voter[n];

		System.out.println("Enter Voter Details");
		for (int i = 0; i < n; i++) {
			v[i] = new Voter();
			System.out.print("Enter Voter Id:");
			int id = s.nextInt();
			v[i].setId(id);
			s.nextLine();
			
			System.out.print("Enter Name of Voter:");
			String name = s.nextLine();
			v[i].setName(name);
			System.out.println("Enter Age of Voter ");
			int age = s.nextInt();
			v[i].setAge(age);

		}

		VotingMachine vm = new VotingMachine();
		vm.acceptWord(v);
	}

}
