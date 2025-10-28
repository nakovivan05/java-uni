package Sem2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int findMax(int[]arr)
    {
        int max = arr[0];
        for(int i =0; i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        /*int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;
        System.out.println("Average = " + avg);*/

        /*int[]numbers = {1,22,5,4,70};
        int max = findMax(numbers);
        System.out.println(max);*/



        /*int[] arr = {2, 4, 6, 8};
        int sum = 0;
        for (int n : arr)
        {
            sum += n;
        }
        System.out.println("Sum = " + sum);*/

        /*String[] words = {"cat", "banana", "apple", "dog"};
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));*/

        /*int [] arr = {1,5,4,7,9};
        int index = findElement(arr,5);
        System.out.println(index);*/

        /*int[] arr = {-3, 4, -1, 0, 9, -5};
        int pos = 0
        int neg = 0;
        for (int n : arr) {
            if (n > 0)
            {pos++;}
            else if (n < 0)
            {neg++;}
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg);*/

        /*int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.print("Common elements: ");
        for (int x : a) {
            for (int y : b) {
                if (x == y)
                {System.out.print(x + " ");}
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int remove = sc.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num != remove)
            {count++;}
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != remove) {
                newArr[index++] = num;
            }
        }
        for (int num : newArr) {
            System.out.print(num + " ");*/
    }




}
