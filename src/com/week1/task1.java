package com.week1;
import java.util.Scanner;

public class task1 {
    static public void main(String[] args){
        int[] m = new int[5];
        System.out.println("Enter the marks of 5 subjects: ");
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<5;i++){
                m[i] = sc.nextInt();
            }
        }
        float sum = 0;
        for(int i=0;i<5;i++){
            sum += m[i];
        }
        float avg = sum/5;
        System.out.println("The average marks are: " + avg);
    }
}
