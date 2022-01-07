import java.io.*;
class Student implements Serializable
{
    String name;
    int roll,marks;
    double cgpa;
    Student(String n,int r,int m,double c)
    {
        this.name = n;
        this.roll = r;
        this.marks = m;
        this.cgpa = c;
    }
    public String toString()
    {
        return  "Name : " + name + 
                "\nRoll Number : " + roll +
                "\nMarks : " + marks + " / 600" +
                "\nCGPA : " + cgpa + 
                "\n";
    }
}
public class MyDeserializeApp 
{
    public static void main(String[] args) throws Exception
    {
        Student s1,s2;
        File f1=new File("students.txt");
        FileInputStream fis=new FileInputStream(f1);
        ObjectInputStream ois=new ObjectInputStream(fis);
        s1=(Student)ois.readObject();
        System.out.println(s1);
        s2=(Student)ois.readObject();
        System.out.println(s2);
        ois.close();
        fis.close();
    }
}
