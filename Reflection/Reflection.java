//FileName : Reflection.java

import java.util.*;
import java.lang.reflect.*;
final class Complex 
{
    Scanner s = new Scanner(System.in);
    public int real,imag;
	private int r,i;
    Complex(int r,int i) 
    {
        this.real = r;
        this.imag = i;
    }
    public void sum(Complex a,Complex b) 
    {
        real = a.real + b.real;
        imag = a.imag + b.imag;
    }
    protected void product(Complex a,Complex b) 
    {
        real = (a.real*b.real) - (a.imag*b.imag);
        imag = (a.real*b.imag) + (a.imag*b.real);
    }
    void display() 
    {
        System.out.println(real+" + "+imag+" i"+"\n");
    }
}
public class Reflection 
{
    public static void main(String[] args) 
    {
        Complex c1 = new Complex(5,5);
        
        Class c = c1.getClass(); //Creating object for class Class
        //Class c = Complex.class;
        //Class c = Class.forName("Complex"); While using forname add the statement
		//throws Exception in main method

        //Getting Class Name
        System.out.println("Class Name : "+c.getName());

        //Getting Superclass Name
        System.out.println("\nSuperclass Name : "+c.getSuperclass().getName());

        //Getting Class Modifiers
        int x = c.getModifiers();
        System.out.println("\nClass Modifiers : "+Modifier.toString(x));

        //Fetching the Public Fields
        Field f[] = c.getFields(); //getFields returns only public fields
		System.out.println("\nPublic Fields : ");
        for(Field field : f) 
        {
			x = field.getModifiers(); //returns the field modifiers
            System.out.println(Modifier.toString(x) + " " + field.getType().getName() + " " + field.getName());
        }
		
		//Fetching all Fields
		Field df[] = c.getDeclaredFields(); //Returns all fields
		System.out.println("\n\nAll fields : ");
		for(Field field : df) 
        {
			System.out.println(field);
		}
		
		//Fetching Constructors
		Constructor cons[] = c.getDeclaredConstructors();
		System.out.print("\nConstructors : ");
		for(Constructor constructor : cons) 
        {
			System.out.println(constructor);
		}
		//Fetching all methods
		Method m[] = c.getDeclaredMethods();
		System.out.println("\nAll Methods : ");
		for(Method method : m) 
        {
			x = method.getModifiers();
			Class pc[] = method.getParameterTypes();
			System.out.println("\n\nMethod : " + method.getName());
			System.out.println("Method Modifiers : " + Modifier.toString(x));
			System.out.println("Return Type : " + method.getReturnType());
			System.out.print("Parameters  : ");
			for(Class obj : pc) 
            {
				System.out.print(obj.getName() + " ");
			}
		}
    }
}