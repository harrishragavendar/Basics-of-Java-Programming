class Time
{
    int hour;
    int minute;
    int second;
}
class SecondThread extends Thread
{
    Time t;
    SecondThread(Time x)
    {
        t=x;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                t.second++;
                this.sleep(1000);
                System.out.println(t.hour + " Hours " + t.minute + " Minutes " + t.second + " Seconds ");
            }
            catch(Exception e){}
        }
    }
}
class MinuteThread extends Thread
{
    Time t;
    MinuteThread(Time x)
    {
        t=x;
    }
    public void run()
    {
        while(true)
        {
            if(t.second==60)
            {
                t.minute++;
                t.second = 0;
            }
        }
    }
}
class HourThread extends Thread
{
    Time t;
    HourThread(Time x)
    {
        t=x;
    }
    public void run()
    {
        while(true)
        {
            if(t.minute==60)
            {
                t.hour++;
                t.minute = 0;
            }
        }
    }
}
public class MyTimeApp 
{
    public static void main(String[] args) 
    {
        Time t = new Time();
        SecondThread s = new SecondThread(t);
        MinuteThread m = new MinuteThread(t);
        HourThread h = new HourThread(t);
        s.start();
        m.start();
        h.start();
    }
}
