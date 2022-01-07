class Account
{
	int balance;	
	public Account(){}
	public Account(int n)
    {
        this.balance = n;
    }
	public int getBalance()
    {
        return balance;
    }
	public void setBalance(int n)
    {
        this.balance = n;
    }
	synchronized public void withdraw(int amt)
	{
		try
        {
			int n = getBalance();
			Thread.sleep(2000);
			setBalance(n-amt);
		}
		catch(InterruptedException ie){}
	}
}
class ATM implements Runnable
{
	Account person;
	int amount;
	public ATM(Account p,int a)
	{
		this.person = p;
        this.amount = a;
	}
	public void run()
	{
		person.withdraw(amount);
	}
}
public class MyScnchronizedThread
{
	public static void main(String[] args) throws InterruptedException
	{
		Account harrish = new Account(100000);

		ATM a1 = new ATM(harrish,1000);
		ATM a2 = new ATM(harrish,5000);
		ATM a3 = new ATM(harrish,500);
        
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		Thread t3 = new Thread(a3);

		System.out.println("Current Balance : "+ harrish.getBalance());

		t1.start();
        t2.start();
        t3.start();

		Thread.sleep(500);

		System.out.println("t1 State : "+ t1.getState());
		System.out.println("t2 State : "+ t2.getState());
		System.out.println("t3 State : "+ t3.getState());

		t1.join();
        t2.join();
        t3.join();

		System.out.println("Balance after withdraw: "+ harrish.getBalance());
	}
}