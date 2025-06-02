/*Problem Statement:
Define an interface Taxable with a method double calculateTax(). Create two classes:
•Employee with fields: empId, name, salary
•Product with fields: productId, name, price
Both classes should implement Taxable interface and:
•Employee should have tax calculated as 10% of the salary.
•Product should have tax calculated as 5% of the price.
Write a Java program to create an object of both classes, accept user-defined values via constructors, 
and display the calculated tax.
*/


import java.util.Scanner;
interface Taxable
{
    double calculateTax();
}
class Employees implements Taxable
{
    private int id;
    private String name;
    private int salary;

    public Employees(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public double calculateTax(){
        return salary*0.10;
    }

}
class Products implements Taxable
{
    private int pid;
    private String pname;
    private int price;

    public Products(int pid, String pname, int price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    public double calculateTax(){
        return price*0.5;
    }
}

public class TaxableAppInf
{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Of Employees: ");
        int n=s.nextInt();
        System.out.println("Enter Number Of Products: ");
        int no=s.nextInt();
        Employees emp[]=new Employees[n];
        Products prod[]=new Products[no];

        for(int i=0;i<emp.length;i++)
        {
            System.out.print("Enter Employee Id:   ");
            int id=s.nextInt();
            s.nextLine();
            System.out.print("Enter Employee Name:    ");
            String name=s.nextLine();
            System.out.print("Enter Employee Salary:    ");
            int sal=s.nextInt();
            emp[i]=new Employees( id,name,sal);
        }
       
        for(int i=0;i<prod.length;i++)
        {
            System.out.print("Enter Product id:  ");
            int id=s.nextInt();
            s.nextLine();
            System.out.print("Enter Product Name:   ");
            String name=s.nextLine();
            System.out.print("Enter Product Price:  ");
            int price=s.nextInt();
            prod[i]=new Products(id, name, price);
        }
        System.out.println("=======================================================");
        System.out.println("Id  \t\t Name\t\t Salary\t\t Tax");
        for(int i=0;i<emp.length;i++)
        {
           System.out.println( emp[i].getId()+"\t\t"+emp[i].getName()+"\t\t"+emp[i].getSalary()+"\t\t"+emp[i].calculateTax());
        }
        System.out.println("=======================================================");
        System.out.println("PId \t\t PName\t \tPrice\t \tTax");
        for(int i=0;i<prod.length;i++)
        {
           System.out.println( prod[i].getPid()+"\t\t"+prod[i].getPname()+"\t\t"+prod[i].getPrice()+"\t\t"+prod[i].calculateTax());
        }
    }
}