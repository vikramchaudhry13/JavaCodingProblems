package com.apnacollege;
import java.util.*;
import java.io.*;

public class armstrong2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int add=0;
        while(n>0){
            int digit=n%10;
            add +=digit*digit*digit;
            n=n/10;
        }
        if(add==num){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        //your code here
    }
}
