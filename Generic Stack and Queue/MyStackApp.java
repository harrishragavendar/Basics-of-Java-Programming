import java.util.*;
class Stack<T> 
{
    T[] stack;
    int top;
    int size;
    Stack() 
    {
        this.size = 10;
        stack = (T[]) new Object[this.size];
        //set size as 10 if no size is specified
        top = -1;
    }
    Stack(int s) 
    {
        //s -> user defined size
        this.size = s;
        stack = (T[]) new Object[s];
        top = -1;
    }
    public void push(T e) 
    {
        if(!isFull()) 
        {
            this.top++;
            stack[this.top] = e;
            System.out.print("\nElement pushed into stack.\n\n");
        }
        else    
            System.out.print("\nStack Overflow.\n\n");
    }
    public T pop() 
    {
        if(!isEmpty()) 
        {
            T ans = stack[top];
            top--;
            return ans;
        }
        else 
        {
            System.out.print("\nStack Underflow.\n\n");
            return null;
        }
    }
    public T top() 
    {
        if(!isEmpty()) 
        {
            T ans = stack[top];
            return ans;
        }
        else 
        {
            System.out.print("\nStack is empty.\n\n");
            return null;
        }
    }
    public void display() 
    {
        if(!isEmpty()) 
        {
            System.out.print("\nStack\n");
            for(int i=top;i>=0;i--) 
            {
                System.out.println("|_"+stack[i]+"_|");
            }
            System.out.print("\n\n");
        }
        else    
            System.out.print("\nStack is empty.\n\n");
    }
    public boolean isFull() 
    {
        return top==size-1;
    }
    public boolean isEmpty() 
    {
        return top==-1;
    }
}
public class MyStackApp 
{
    public static void main(String[] args) 
    {
        int ch,e;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s =  new Stack<Integer>(5);
        do 
        {
            System.out.print("\t========MENU========\n");
            System.out.print("\t1.PUSH\n");
            System.out.print("\t2.POP\n");
            System.out.print("\t3.DISPLAY\n");
            System.out.print("\t4.TOP ELEMENT\n");
            System.out.print("\t5.EXIT\n");
            System.out.print("\t====================\n\n");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter an element to push : ");
                    e = sc.nextInt();
                    s.push(e);
                    break;
                case 2: 
                    System.out.print("Popped element :  "+s.pop()+"\n\n");
                    break;
                case 3:
                    s.display();
                    break;
                case 4: 
                    System.out.print("Top element :  "+s.top()+"\n\n");
                    break;
                default:
                    System.out.print("\nEnter a valid choice.\n\n");
                    break;
            }
        }while(ch!=5);
    }
}