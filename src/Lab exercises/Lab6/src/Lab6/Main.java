package Lab6;
import java.util.*;
class Student
{
    private String name;
    private int grade;
    private int age;
    public Student(String name, int grade, int age)
    {
        setName(name);
        setGrade(grade);
        setAge(age);
    }
    public String getName()
    {
        return this.name;
    }
    public int getGrade()
    {
        return this.grade;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "Name: " + name + " Grade: " + grade + " Age: "+ age;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList <Student> students = new LinkedList<>();
        Deque<Student>studentsPartedByGrade= new ArrayDeque<>();
        Deque<Student>sortedStudents = new ArrayDeque<>();
        for(int i = 0; i<n;i++)
        {
            String name = sc.next();
            int grade = sc.nextInt();
            int age = sc.nextInt();
            sc.nextLine();
            Student newStudent = new Student(name,grade,age);
            students.add(newStudent);
        }
        for(Student student:students)
        {
            if(student.getGrade()>=5)
            {
                studentsPartedByGrade.addLast(student);
            }
            else
            {
                studentsPartedByGrade.addFirst(student);
            }
        }
        List<Student>sort = new ArrayList<>(studentsPartedByGrade);
        sort.sort(Comparator.comparing(Student::getAge));
        sortedStudents.addAll(sort);
        Student best = null;
        for(Student student:sortedStudents)
        {
            if(best == null || student.getGrade() > best.getGrade())
            {
                best = student;
            }
        }
        if(best!=null) {
            System.out.printf("Best student: %s", best.toString());
        }
        else
        {
            System.out.println("Empty!");
        }

    }
}
