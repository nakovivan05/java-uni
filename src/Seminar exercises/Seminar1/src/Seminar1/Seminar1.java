package Seminar1;

public class Seminar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("Enter another integer: ");
        int b = sc.nextInt();
        if(a>=b)
        {
            System.out.printf("%d is bigger",a);
        }
        else
        {
            System.out.printf("%d is bigger",b);
        }
        System.out.println("Enter an integer");*/

        /*int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.printf("%d is even",a);
        }
        else
        {
            System.out.printf("%d is odd",a);
        }*/

        /*System.out.println("Enter integer 1-7: ");
        int a = sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.printf("%d is Monday",a);
                break;
            case 2:
                System.out.printf("%d is Tuesday",a);
                break;
            case 3:
                System.out.printf("%d is Wednesday",a);
                break;
            case 4:
                System.out.printf("%d is Thursday",a);
                break;
            case 5:
                System.out.printf("%d is Friday",a);
                break;
            case 6:
                System.out.printf("%d is Saturday",a);
                break;
            case 7:
                System.out.printf("%d is Sunday",a);
                break;
            default:
                System.out.println("Error!");
                break;*/

        /*System.out.println("Enter day of week: ");
        String dayOfWeek = sc.nextLine();
        switch (dayOfWeek)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.printf("%s is working day",dayOfWeek);
                break;
            case "Saturday":
            case "Sunday":
                System.out.printf("%s is weekend",dayOfWeek);
                break;
            default:
                System.out.println("Error");
                break;*/

        /*System.out.println("Enter an integer:");
        int a = sc.nextInt();
        if(a >= -100 && a<= 100 && a!=0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        }*/

        /*int a = sc.nextInt();
        if (a < 100 || a > 200) {
            System.out.println("Invalid!");
        }*/

        /*System.out.println("Enter N:");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++)
        {
            System.out.print(i + " ");
        }*/

        /*System.out.println("Enter N:");
        int n = sc.nextInt();
        for(int i = n; i>=1;i--)
        {
            System.out.print(i + " ");
        }*/

        /*System.out.println("Enter N:");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++)
        {
            if(i%7==0 && i%3==0) {
                System.out.print(i + " ");
            }
        }*/

        /*System.out.println("Enter N:");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++)
        {
            if(i%5==0 && i%7==0) {
                System.out.print(i + " ");
            }
        }*/

        /*int n = sc.nextInt();
        int[]nums = new int[n];

        for(int i = 0; i<n;i++)
        {
            int newNum = sc.nextInt();
            nums[i] = newNum;
        }
        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
            if(nums[i]<min)
            {
                min = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);*/

        /*int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<n;i++)
        {
            int newNum = sc.nextInt();
            sum += newNum;
        }
        System.out.println(sum);*/

        /*String text;
        while(true)
        {
            text = sc.nextLine();
            if(Objects.equals(text, "Stop")) {
                break;
            }
            System.out.println(text);
        }*/

        /*while(true)
        {
            int newNum = sc.nextInt();
            if(newNum%10!=0)
            {
                System.out.println("Error!Try again!");
                continue;
            }
            System.out.println("Success!");
            break;
        }*/

        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int minutesAfter15 = (hours*60) + minutes + 15;
        int hoursClock = minutesAfter15 / 60;
        int minutesClock = minutesAfter15 % 60;
        if(hoursClock > 24 || hoursClock<0)
        {
            System.out.println("Wrong hour");
        }
        else
        {
            if(hoursClock < 10)
            {
                if(minutesClock<10)
                {
                    System.out.printf("0%d:0%d",hoursClock,minutesClock);
                }
                System.out.printf("0%d:%d",hoursClock,minutesClock);
            }
            else{
                if(minutesClock<10)
                {
                    System.out.printf("%d:0%d",hoursClock,minutesClock);
                }
                System.out.printf("%d:%d",hoursClock,minutesClock);
            }

        }
}
