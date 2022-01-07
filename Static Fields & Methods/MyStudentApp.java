class Student
{
    String name;
    int rollno;
    double cgpa;
    int total;
    char grade;
    static int x;
    Student(String n,double c,int t)
    {
        name = n;
        cgpa = c;
        total = t;
        x++;
    }
    public static int getRoll()
    {
        return x;
    }
    public void setRoll()
    {
        rollno = getRoll();
    }
    public void setGrade()
    {
        if(total>=500 && total<=600)
            grade = 'O';
        else if(total>=400 && total<=500)
            grade = 'A';
        else if(total>=300 && total<=400)
            grade = 'B';
        else if(total>=200 && total<=300)
            grade = 'C';
        else
            grade = 'D';
    }
    public String toString()
    {
        return  "Name : " + name + 
                "\nRoll Number : " + rollno +
                "\nTotal Marks : " + total +
                "\nGrade : " + grade + 
                "\nCGPA : " + cgpa + 
                "\n";
    }
}
public class MyStudentApp 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("John", 8.76, 478);
        s1.setRoll();
        s1.setGrade();

        Student s2 = new Student("Shiva", 9.54, 567);
        s2.setRoll();
        s2.setGrade();

        Student s3 = new Student("Rahul", 7.67, 324);
        s3.setRoll();
        s3.setGrade();

        Student s4 = new Student("Krithik", 8.32, 444);
        s4.setRoll();
        s4.setGrade();

        System.out.println("========================STUDENT DETAILS=======================");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("==============================================================");
    }
}
