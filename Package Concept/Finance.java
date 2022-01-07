import industry.*;
import java.util.*;
public class Finance 
{
    public static void main(String[] args) 
    {
        int m,r,c;
        int a,l,s;
        int profit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the expenses for machinery purchased : ");
        m = sc.nextInt();
        System.out.print("Enter the expenses for raw materials purchased : ");
        r = sc.nextInt();
        System.out.print("Enter the expenses for contingencies : ");
        c = sc.nextInt();

        Expenses e = new Expenses(m,r,c);

        System.out.print("Enter the assets of the company : ");
        a = sc.nextInt();
        System.out.print("Enter the liablities of the company : ");
        l = sc.nextInt();
        System.out.print("Enter the sales of the company : ");
        s = sc.nextInt();

        AvailAmount aa = new AvailAmount(a,l,s);

        profit = aa.totalAvailAmount() - e.totalExpenses();
        System.out.print("\nProfit of the Company : "+profit);
    }
}
