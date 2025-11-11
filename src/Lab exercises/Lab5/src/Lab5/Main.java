package Lab5;
import java.util.Locale;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a word/sentence: ");
        int countOfVowels = 0;
        String word = sc.nextLine();
        char[]letters = word.toCharArray();
        for(int i =0; i< letters.length;i++)
        {
            if(letters[i] == 'a'|| letters[i] == 'e'|| letters[i] == 'o'|| letters[i] == 'u'|| letters[i] == 'i')
            {
                countOfVowels++;
            }
        }
        System.out.println("Vowels: " + countOfVowels);*/

        /*System.out.println("Enter a word: ");
        String word = sc.nextLine();
        StringBuilder wordReversed = new StringBuilder();
        char[]letters = word.toCharArray();
        for(int i = letters.length-1;i>=0;i--)
        {
            wordReversed.append(letters[i]);
        }
        if(word.equals(wordReversed.toString()))
        {
            System.out.printf("Word %s is a palindrome!",word);
        }
        else
        {
            System.out.printf("Word %s is not a palindrome!",word);
        }*/

        /*System.out.println("Enter a word/sentence: ");
        String sentence = sc.nextLine();
        String updatedSentence = sentence.replaceAll(" ","_").toLowerCase();
        System.out.println("The sentence only with lower case letters and intervals replaces with _: "+updatedSentence);*/

        /*System.out.println("Enter a phone number: ");
        String phoneNumber = sc.nextLine();
        if(phoneNumber.matches("^\\d{10}$"))
        {
            System.out.println("Valid phone number!");
        }
        else
        {
            System.out.println("Invalid phone number!");
        }*/

        /*System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        String updatedSentence = sentence.replaceAll("\\d","*");
        System.out.println(updatedSentence);*/

        /*System.out.println("Enter a password: ");
        String password = sc.nextLine();
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasLetter = password.matches(".*[A-Za-z].*");
        if(password.length()>=8 && hasLetter && hasDigit)
        {
            System.out.println("Valid password!");
        }
        else
        {
            System.out.println("Invalid password!");
        }*/

        /*System.out.println("Enter a count of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++)
        {
            String newString = sc.nextLine();
            int startName = newString.indexOf('@') + 1;
            int endName = newString.indexOf('|');
            int startAge = newString.indexOf('#')+1;
            int endAge = newString.indexOf('*');
            String name = newString.substring(startName,endName);
            String age = newString.substring(startAge,endAge);
            System.out.printf("%s is %s years old!%n",name,age);
        }*/

        System.out.println("Enter usernames separated by , ");
        String[]usernames = sc.nextLine().split(", ");
        for(String user:usernames)
        {
            if(user.matches("^[A-Za-z0-9_-]{3,16}$"))
            {
                System.out.println(user);
            }
        }

    }
}
