package com.week1;
// import java.util.Scanner;

public class ps3 {
    public static void main(String[] args) {
        // Problem1
        String s = "Hello World";
        s = s.toLowerCase();
        System.out.println(s+"\n");

        // Problem2
        String text = "To My Friend";
        text = text.replace(" ","_");
        System.out.println(text+"\n");

        // Problem3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Khushboo Ma'am");
        System.out.println(letter+"\n");

        // Problem4
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   ")+"\n");

        // Problem5
        String myLetter = "Dear Khushboo Ma'am,\n\tThis Internship is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}