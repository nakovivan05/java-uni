package Lab1;
import java.util.Scanner;

public class BmiCalculator
{
    static void printIntroduction()
    {
        System.out.println("Hello! This is a program to calculate your BMI!");
    }
    static double getBMI(Scanner sc)
    {
        System.out.println("Enter your weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        System.out.println("Enter your height in inches: ");
        double heightInInches = sc.nextDouble();
        double weightInKg = weightInPounds / 2.2046;
        double heightInCm = heightInInches / 0.3937;
        double heightInMeters = heightInCm / 100;
        return BMIfor(weightInKg,heightInMeters);
    }
    static double BMIfor(double weight,double height)
    {
        double BMI = weight / (height*height);
        return BMI;
    }
    static String getStatus(double BMI)
    {
        if(BMI > 30)
        {
            return "Obese";
        }
        else if(BMI > 25)
        {
            return "Overweight";
        }
        else if(BMI > 18.5)
        {
            return "Normal";
        }
        else
        {
            return "Underweight";
        }
    }
    static void reportResults(double BMI, String status)
    {
        System.out.printf("BMI: %.2f Status: %s ",BMI,status);
    }

    public static void main(String[]args)
    {
        printIntroduction();
        Scanner sc = new Scanner(System.in);
        double BMI = getBMI(sc);
        String status  = getStatus(BMI);
        reportResults(BMI,status);

    }
}

