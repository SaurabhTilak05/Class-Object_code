
import java.util.Scanner;



/*
    Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is Rs.50/- (per Hour).
    Daily shift hour time is only 8 hours.
    Note- for a week only 40 hours of working are allowed.
    1.Create class Employee with data member ID, Name, total working, salary, overtime Set 
    Information by using a parameterized constructor and create a display Information() method to display all information with salary.
    2.Create another class name as OverTime with method setEmployee(Employee emp[ ]) and void calculateOvertime() to calculate overtime.
*/
class Employe{
    private int id;
    private String name;
    private int totalwork;
    private int salary;
    private int overTimePay;

    public Employe(int id, String name, int totalwork) {
        this.id = id;
        this.name = name;
        this.totalwork = totalwork;
       this.salary = 0;
       this.overTimePay=0;

    }
    public void Information(){
        System.out.println("-------------------------------------");
        System.out.println("Name:   "+name);
        System.out.println("Id:  "+id);
        System.out.println("totalWork:  "+totalwork);
        System.out.println("salary:  "+salary);
        System.out.println("Over time pay:  "+overTimePay);
        System.out.println("total salary:"+salary);
          System.out.println("-------------------------------------");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalwork(int totalwork) {
        this.totalwork = totalwork;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalwork() {
        return totalwork;
    }

    public int getSalary() {
        return salary;
    }

    public void setOverTimePay(int overTimePay) {
        this.overTimePay = overTimePay;
    }

    public int getOverTimePay() {
        return overTimePay;
    }
}

class OverTime{
    Employe emp[];
    public final int rate=50;
    public final int work=40;
    public final int regular=100;
    public void setEmployee(Employe emp[])
    {
        this.emp=emp;

    }
    public void calculateOvertime()
    {
        for (Employe em:emp) {
           int working=em.getTotalwork();
            int over=0;
            int calOverPay=0;
            int basSalary=0;
            if(working>work)
            {
                over=working-work;
                calOverPay=over*rate;
                basSalary=work*rate;

            }
            else{
                basSalary=working*regular;
            }
            em.setOverTimePay(calOverPay);
           
            basSalary=work*regular;
            em.setSalary(basSalary+calOverPay);
        }
    }
}
public class EmployeeOverTimeApp
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter Number of employees");
        int no=s.nextInt();
        Employe emp[]=new Employe[no];
        for(int i=0;i<emp.length;i++)
        {
            System.out.println("Enter id");
            int id=s.nextInt();
            s.nextLine();
             System.out.println("Enter Name ");
             String name=s.nextLine();
             System.out.println("totalWork");
            int work=s.nextInt();
            s.nextLine();
            emp[i]=new Employe(id, name, work);
        }

        OverTime ot=new OverTime();
        ot.setEmployee(emp);
        ot.calculateOvertime();

        for (int i = 0; i < emp.length; i++) {
            emp[i].Information();   
        }
    }
}