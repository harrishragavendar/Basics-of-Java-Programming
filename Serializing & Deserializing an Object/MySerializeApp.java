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
public class MySerializeApp 
{
    public static void main(String[] args) throws Exception
    {
        Student s1 = new Student("John",101,456,8.96);
        Student s2 = new Student("Ravi",102,555,9.02);
        File f1 = new File("students.txt");
	    FileOutputStream fos = new FileOutputStream(f1);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(s1);
	    oos.writeObject(s2);
	    oos.close();
	    fos.close();
    }
}
