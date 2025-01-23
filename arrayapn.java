package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class arrayapn {
    public static void main(String[] args) {
        int mark[]=new int[100];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter marks of phy:");
        mark[0]=sc.nextInt();
        System.out.println("enter marks of che:");
        mark[1]=sc.nextInt();
        System.out.println("enter marks of math:");
        mark[2]=sc.nextInt();

        System.out.println(Arrays.toString(mark));
        
    }
}
