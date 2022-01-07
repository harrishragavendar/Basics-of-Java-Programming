import java.util.*;
class Employee
{
    int id;
    String name,email;
    Employee(int i, String n, String e)
    {
        this.id = i;
        this.name = n;
        this.email = e;
    }
    public String toString()
    {
        return  "Name : " + name +
                "\nEmployee ID : " + id +
                "\nE-Mail ID : " + email +
                "\n";
    }
}
class RegularEmployee extends Employee
{
    double basic,hra,da,gross;
    RegularEmployee(int i, String n, String e, double b, double h, double d)
    {
        super(i,n,e);
        this.basic = b;
        this.hra = h;
        this.da = d;
    }
    public double calculateGross()
    {
        gross = basic + hra + da;
        return gross;
    }
    public String toString()
    {
        return super.toString() +
                "Basic Pay : " + basic + 
                "\nHouse Rent Allowance : " + hra +
                "\nDearness Allowance : " + da +
                "\nGross Salary : " + gross;
    }
}
class WagedEmployee extends Employee
{
    int days;
    double pay;
    WagedEmployee(int i, String n, String e, int d)
    {
        super(i,n,e);
        this.days = d;
    }
    public double calculatePay()
    {
        return days*300;
    } 
    public String toString()
    {
        return super.toString() +
               "Pay for " + days + " days = " + calculatePay();
    }
}
public class MyEmployeeApp
{
    public static void main(String[] args) 
    {
        int i,d;
        String n,e;
        double b,h,da;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Regular Employee ID : ");
        i = sc.nextInt();
        sc.nextLine(); // buffer

        System.out.print("Enter Employee Name : ");
        n = sc.nextLine();

        System.out.print("Enter Employee E-Mail : ");
        e = sc.nextLine();

        System.out.print("Enter the basic pay : ");
        b = sc.nextDouble();

        System.out.print("Enter the house rent allowance : ");
        h = sc.nextDouble();

        System.out.print("Enter the dearness allowance : ");
        da = sc.nextDouble();

        RegularEmployee r = new RegularEmployee(i, n, e, b, h, da);

        r.calculateGross();
        
        System.out.print("\nEnter Waged Employee ID : ");
        i = sc.nextInt();
        sc.nextLine(); // buffer

        System.out.print("Enter Employee Name : ");
        n = sc.nextLine();

        System.out.print("Enter Employee E-Mail : ");
        e = sc.nextLine();

        System.out.print("Enter the no. of days worked : ");
        d = sc.nextInt();

        WagedEmployee w = new WagedEmployee(i, n, e, d);
        w.calculatePay();

        System.out.println("===================REGULAR EMPLOYEE DETAILS==================");
        System.out.println(r);
        System.out.println("=============================================================");

        System.out.println("====================WAGED EMPLOYEE DETAILS===================");
        System.out.println(w);
        System.out.println("=============================================================");
        sc.close();
    }
}
