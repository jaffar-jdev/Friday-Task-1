package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Question 6
        int n = 5;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("\n\n"+"Question 7");
        //Question 7
        for (int i=1;i<n;i++){
            for (int k=(n-(i+2));k>=0;k--) {
                System.out.print(" ");
         }
            for (int j=1;j<=i;j++) {
                System.out.print(j);

         }
            System.out.println();
        }

        System.out.println("\n\n"+"Question 8");
        //Question 8
        
    }
}
