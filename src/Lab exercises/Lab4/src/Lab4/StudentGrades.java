package Lab4;
import java.util.Scanner;
class InvalidGradeException extends Exception
{
    public InvalidGradeException(String message)
    {
        super(message);
    }
}
public class StudentGrades {
    public static void validateGrade(int grade) throws InvalidGradeException
    {
        if(grade<2 || grade > 6)
        {
            throw new InvalidGradeException("Grade must be an integer between 2 and 6!");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int grade;
         while(true)
         {
             try
             {
                 System.out.println("Enter a grade or 0 to end the program: ");
                 grade = sc.nextInt();
                 if(grade == 0)
                 {
                     System.out.println("Operation ended!");
                     break;
                 }
                 validateGrade(grade);
                 System.out.println("Grade: "+grade);
             }
             catch (InvalidGradeException e)
             {
                 System.out.println("Error: " + e.getMessage());
             }


         }
          sc.close();
    }
}
