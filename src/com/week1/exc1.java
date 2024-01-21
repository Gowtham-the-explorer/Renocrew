//saveas exc1.java
package com.week1;
// import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        //Question1
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //Question2
        int n = 0, sum = 0;
        while(n<4){
            sum += 2*n;
            n++;
        }
        System.out.println("\nThe sum of first 4 natural numbers is: " + sum + "\n");
        
        //Question3
        int num = 5;
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = " + num*i );
        }
        System.out.println('\n');
        
        //Question4
        // int num = 5;
        for(int i=10; i>0; i--){
            System.out.println(num+" x "+i+" = " + num*i );
        }
        
        //Question5
        int f = 1;
        for(int i=2; i<=10; i++){
            f *= i;
        }
        System.out.println("\nFactorial of 10 is: " + f );
        
        //Question6
        int i = 10;
        f = 1;
        while(i>0){
            f *= i;
            i--;
        }
        System.out.println("\nFactorial of 10 is: " + f );
        
        //Question7
        int num1 = 4, num2 = 1;
        while(num1>0){
            num2 = num1;
            while(num2>0){
                System.out.print("* ");
                num2--;
            }
            System.out.println();
            num1--;
        }
        System.out.println('\n');
        
        // Question8
        // False because the condition is checked at
        // the end of the loop for do-while loop whereas for
        // while and for loops the condition is checked before.
        // But while and for Loops can be applied instead of do-while loop
        // for that you can add few other conditions
        // Check below examples
        i = 1;
        f = 0;
        do{
            System.out.println("Do-While Loop");
            i++;
        }while(i<1);
        while(i<1 || f == 0){
            System.out.println("While Loop");
            i++;
            f++;
        }
        f=0;
        for(i=1; f == 0 || i<1; i++){
            System.out.println("For Loop");
            f++;
        }
        System.out.println('\n');
        
        //Question9
        n = 8;
        sum = 0;
        for(i=1; i<11; i++){
            sum += n*i;
        }
        System.out.println("Sum of first 10 multiples of 8 is: " + sum + '\n');

        // Question10
        int itr = 1; n=10;
        // atlest once
        do{
            System.out.println("It is " + itr + "-iteration");
            itr++;
        }while(itr<n);
        
        // atleast twice
        itr = 1;
        do{
            do{
                System.out.println("It is " + itr + "-iteration");
                itr++;
            }while(itr<n);
        } while(itr<n);
        // atmost once
        itr = 1;
        do{
            System.out.println("It is " + itr + "-iteration");
        }while(false);
        System.out.println('\n');

        // Question11        
        n = 4;
        sum = 0;
        for(i=0; i<n; i++){
            sum += 2*i;
        }
        System.out.println("\nThe sum of first 4 natural numbers is: " + sum + "\n");
    }
}