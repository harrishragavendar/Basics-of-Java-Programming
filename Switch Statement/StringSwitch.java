//String object as an expression in switch statement

import java.util.Scanner;
public class StringSwitch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String ch;

        System.out.print("Enter Number 1 : ");
        a=sc.nextInt();

        System.out.print("Enter Number 2 : ");
        b=sc.nextInt();
        sc.nextLine(); //buffer

        System.out.println("\t======MENU=====");
        System.out.println("\tadd");
        System.out.println("\tsubtract");
        System.out.println("\tmultiply");
        System.out.println("\tdivide");
        System.out.println("\texit");
        System.out.println("\t===============");

        do 
        {
            System.out.print("Enter your choice as String : ");
            ch=sc.nextLine();
            switch(ch) {
                case "add":
                    System.out.println("Sum : "+(a+b));
                    break;
                case "subtract":
                    System.out.println("Difference : "+(b-a));
                    break;
                case "multiply":
                    System.out.println("Product : "+(a*b));
                    break;
                case "divide":
                    System.out.println("Division : "+(double)(b/a));
                    break;
                case "exit":
                    break;
                default:
                System.out.println("Enter a valid choice.");
            }
        }while(ch != "exit");
        sc.close();
    }
}
