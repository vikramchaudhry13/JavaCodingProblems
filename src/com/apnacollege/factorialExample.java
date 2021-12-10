package com.apnacollege;
import java.util.Scanner ;
public class factorialExample {
    public static void main(String []args){
        int fact=1;
        Scanner s=new Scanner(System .in);
        System.out.println("enter a no for factorial calculation");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of " +n+ " is: "+fact);
    }
}
