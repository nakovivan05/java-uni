package Sem4;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.Arrays;

class Student{
    private String name;
    private int age;
    private double grade;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Student: " + name + " " + "Age: " + age + " " + "Grade: " + grade;
    }
}
public class Main3 {
    public static double getAverageGrade(List<Student> students) {
        return students.stream().mapToDouble(Student::getGrade).average().orElse(0);
    }
    public static Map<Boolean, List<Student>> partitionByPass(List<Student> students, double passGrade) {
        return students.stream().collect(Collectors.partitioningBy(s -> s.getGrade() >= passGrade));
    }
    public static List<String> getStudentsAboveAverageSorted(List<Student> students) {
        double avg = getAverageGrade(students);
        return students.stream().filter(s -> s.getGrade() > avg).map(Student::getName).sorted().toList();
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", 20, 4.50),
                new Student("Maria", 19, 5.80),
                new Student("Georgi", 21, 3.90),
                new Student("Petya", 22, 5.20)
        );
        double avgGrade = getAverageGrade(students);
        System.out.println("Average grade: " + avgGrade);
        Map<Boolean, List<Student>> partition = partitionByPass(students, 4.0);
        System.out.println("Passed: " + partition.get(true));
        System.out.println("Failed: " + partition.get(false));
        List<String> aboveAverage = getStudentsAboveAverageSorted(students);
        System.out.println("Above average (sorted): " + aboveAverage);
    }
}

