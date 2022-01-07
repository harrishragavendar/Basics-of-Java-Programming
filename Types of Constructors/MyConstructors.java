class Student
{
    String name;
    int roll,marks;
    double cgpa;
    Student() // default constructor
    {
        name = "New Student";
        roll = 0;
        marks = 0;
        cgpa = 0.0;
    }
    Student(String n,int r,int m,double c) // parameterized constructor
    {
        this.name = n;
        this.roll = r;
        this.marks = m;
        this.cgpa = c;
    }
    Student(Student s) // copy constructor
    {
        this.name = s.name;
        this.roll = s.roll;
        this.marks = s.marks;
        this.cgpa = s.cgpa;
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
public class MyConstructors
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student("John",101,456,8.96);
        Student s3 = new Student(s2);
        System.out.println("================STUDENT DETAILS===============\n");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("================================================");
    }
}