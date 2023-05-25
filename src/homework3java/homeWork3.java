package homework3java;

import java.util.Scanner;

public class homeWork3 {


    public static void main(String[] args) {
        System.out.println("-----TASK 1-----");
        task1();
        System.out.println("-----TASK 2-----");
        task2();
        System.out.println("-----TASK 3-----");
        task3();
        System.out.println("-----TASK 4-----");
        task4();
        System.out.println("-----TASK 5-----");
        task5();
        System.out.println("-----TASK 6-----");
        task6();
        System.out.println("-----TASK 7-----");
        task7();
        System.out.println("-----TASK 8-----");
        task8();
    }

    public static void task1(){
        int a = 1;
        System.out.println("Variable 'a' getting bigger by 2 every time 'for(...)' lap works");
        for (int i = 0; i < 55; i++) {
            System.out.println(a);
            a+=2;
        }
    }

    public static void task2(){
        System.out.println("90 to 0 with 5-scale gap");
        for (int a = 90; a >= 0; a-=5) {
            System.out.println(a);
        }
    }

    public static void task3(){
        int a = 2;
        System.out.println("Number 2 multiplied by 2 twenty times");
        for (int i = 0; i < 20; i++) {
            System.out.println(a);
            a*=2;
        }
    }

    public static void task4(){
        for (int i = -29; i <= 10; i++) {
            if(i%5==0){
                System.out.println(i+" can be divided by 5");
            }
        }
    }

    public static void task5(){
        int sum = 0;
        for (int i = 50; i <= 150; i++) {
            sum+=i;
            if(i%2==0) {
                System.out.println(i+" is a even number");
            }
        }
        System.out.println("Summary of numbers from 50 to 150: "+sum);
    }

    public static void task6(){
        int sum1 = 0;
        int sum2 = 1;
        int sum = 0;
        System.out.println("Fibonacci numbers");
        System.out.println(sum1);
        System.out.println(sum2);
        for (int i = 2; i < 11; i++) {
            sum = sum1 + sum2;
            System.out.println(sum);
            sum1 = sum2;
            sum2 = sum;
        }
    }

    public static void task7() {
        int array[] = {5,-3,-2,16,55,0};
        int sum = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0){
                a++;
                System.out.println(array[i]+" is a positive number in array");
                sum+=array[i];
            }

        }
        System.out.println("Amount of positive numbers: "+a);
        System.out.println("Summary of positive numbers: "+sum);
    }

    public static void task8(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String number = input.nextLine();
        String[] digits = String.valueOf(number).split("");
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            int num = Integer.parseInt(digits[i]);
            sum+=num;
        }
        System.out.println("Summary: "+sum);
    }

}