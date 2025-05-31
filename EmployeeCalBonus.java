/*
    Create a class Employee with the following attributes: int id , String name , double salary.
    Create a parameterized constructor that initializes the id, name, and salary fields. calculateBonus(): Write a method calculateBonus() that returns a bonus amount based on the employee’s salary as follows:
    If salary is greater than or equal to 100,000, bonus is 15% of salary.
    If salary is between 50,000 (inclusive) and 100,000, bonus is 10% of salary. If salary is less than 50,000, bonus is 5% of salary.
    displayEmployeeDetails(): Write a method displayEmployeeDetails() that displays the employee's id, name, salary, calculated bonus, and total compensation (salary + bonus).
    Create an Employee object using the parameterized constructor.
    Call calculateBonus() and displayEmployeeDetails() to show the employee's information along with the bonus and total compensation
*/

import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private double salary;
    
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double calculateBonus() {
        double bonus = 0;
        if (salary >=100000)
        {
            return salary * 0.15;
        }
        else if (salary >=50000)
        {
            return salary * 0.10;
        }
        else
        {
            return salary * 0.05;
        }
    }
    public void displayEmployeeDetails() {
        double bonus = calculateBonus();
         System.out.println("--------------------------------------");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Compensation: " + (salary + bonus));
        System.out.println("--------------------------------------");
    }
}
public class EmployeeCalBonus{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers of Employee ID: ");
        int no=s.nextInt();

      Employee emp[]=new Employee[no];
      for(int i=0;i<emp.length;i++)
      {
        System.out.println("Enter Employee ID");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Enter Employee Name");
        String name=s.nextLine();
        System.out.println("Enter Employee Salary");
        double salary=s.nextDouble();
        s.nextLine();
        emp[i]=new Employee(id,name,salary);
         
      }
      for (int i =0; i < emp.length; i++) {
       emp[i].displayEmployeeDetails();   
      }
    
    }
}