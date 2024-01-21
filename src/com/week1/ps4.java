package com.week1;

import java.util.Scanner;
public class ps4 {
    public static void main(String[] args) {
        //Question1
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }    
        else{
            System.out.println("I am not 11");
        }

        //Question2
        byte m1, m2, m3;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your marks in Physics: ");
            m1 = sc.nextByte();
            System.out.println("Enter your marks in Chemistry: ");
            m2 = sc.nextByte();
            System.out.println("Enter your marks in Mathematics: ");
            m3 = sc.nextByte();
        }
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your average marks are: "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratualtions! You have passed the exam");
        }
        else{
            System.out.println("Sorry! You have failed the exam. Better luck next time");
        }

        //Question3
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your income: ");
            float income = sc.nextFloat(), tax = 0;
            if(income<=2.5f){
                tax = tax + 0;
            }
            else if(income<=5.0f){
                tax = tax + 0.05f * (income - 2.5f);
            }
            else if(income<=10.0f){
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.2f * (income - 5.0f);
            }
            else{
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.2f * (10.0f - 5.0f);
                tax = tax + 0.3f * (income - 10.0f);
            }
            System.out.println("The total tax paid by the employee is: "+ tax);
        }
        
        //Question4
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the day number: ");
            int day = sc.nextInt();
            switch(day){
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid day number");
            }
        }

        //Question5
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the year: ");
            int yr = sc.nextInt();
            System.out.println("It's a "+(yr%4==0?"leap":"non-leap")+" year");
        }

        //Question6
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the website: ");
            String website = sc.nextLine();
            if(website.endsWith(".com")){
                System.out.println("Commercial website");
            }
            else if(website.endsWith(".org")){
                System.out.println("Organisation website");
            }
            else if(website.endsWith(".in")){
                System.out.println("Indian website");
            }
        }
    }
}