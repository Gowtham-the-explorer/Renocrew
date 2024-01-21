package com.week1;
// import java.util.Scanner;
public class ps2_pb2 {
    static public void main(String[] args){
        
        //Question2
        char grd = 'B';
        grd = (char)(grd + 8);
        System.out.println("Encrypted grade: "+ grd);

        // Decrypting the grade
        grd = (char)(grd - 8);
        System.out.println("Decrypted grade: "+ grd);
    }
}
