public class MyJNICalc
{
	static
	{
		System.loadLibrary("calc");
	}
	public static native int add(int x,int y);
	public static native int sub(int x,int y);
	public static void main(String[] args)
	{
		System.out.println(add(5,5));
		System.out.println(sub(5,3));
	}
}
