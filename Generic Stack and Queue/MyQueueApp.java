import java.util.*;
class Queue<T> 
{
    T[] queue;
    int front,rear;
    int size;
    Queue() 
    {
        this.size = 10;
        queue = (T[]) new Object[this.size];
        //set size as 10 if no size is specified
        front = rear = -1;
    }
    Queue(int s) 
    {
        //s -> user defined size
        this.size = s;
        queue = (T[]) new Object[s];
        front = rear = -1;
    }
    public void enqueue(T e) 
    {
        if(!isFull()) {
            if(front==-1) 
            {
                front++;
            }
            this.rear++;
            queue[this.rear] = e;
            System.out.print("\nElement queued.\n\n");
        }
        else    
            System.out.print("\nQueue is full.\n\n");
    }
    public T dequeue() 
    {
        if(!isEmpty() && front<=rear) 
        {
            T ans = queue[front];
            front++;
            return ans;
        }
        else 
        {
            System.out.print("\nQueue is empty.\n\n");
            return null;
        }
    }
    public void display() 
    {
        if(!isEmpty()) {
            System.out.print("\nQueue : ");
            for(int i=front;i<=rear;i++) 
            {
                System.out.print(queue[i]+"   ");
            }
            System.out.print("\n\n");
        }
        else    
            System.out.print("\nQueue is empty.\n\n");
    }
    public boolean isFull()
    {
        return rear==size-1;
    }
    public boolean isEmpty() 
    {
        return front==-1 && rear==-1;
    }
}
public class MyQueueApp 
{
    public static void main(String[] args) 
    {
        int ch,e;
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q =  new Queue<Integer>(5);
        do 
        {
            System.out.print("\t========MENU========\n");
            System.out.print("\t1.ENQUEUE\n");
            System.out.print("\t2.DEQUEUE\n");
            System.out.print("\t3.DISPLAY\n");
            System.out.print("\t4.EXIT\n");
            System.out.print("\t====================\n\n");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.print("Enter an element to queue : ");
                    e = sc.nextInt();
                    q.enqueue(e);
                    break;
                case 2: 
                    System.out.print("Dequeued element :  "+q.dequeue()+"\n\n");
                    break;
                case 3:
                    q.display();
                    break;
                case 4: 
                    break;
                default:
                    System.out.print("\nEnter a valid choice.\n\n");
                    break;
            }
        }while(ch!=4);
    }
}