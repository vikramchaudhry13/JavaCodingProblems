package com.apnacollege;
import java.util.*;
public class NthTerm {
    public static void main(String []args){
        System.out.println("This program calculates Nth term of the series 1,3,6,10.....");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the value of N");
        int n=sc.nextInt();
        int x=n*(n+1)/2;
        System.out.println("The Nth term you entered is :"+ n +" answer is "+x );
    }
}
