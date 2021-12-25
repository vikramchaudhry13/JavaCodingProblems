package com.apnacollege;
import  java.util.* ;
import  java.io.* ;
public class compoundInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System .in)  ;
        int principle =s.nextInt();
        int time =s.nextInt();
        int rate =s.nextInt();
        double var1=Math.pow((100+rate),time ) ;
        double var2=Math.pow(100,time ) ;
        double var3=var1 / var2  ;
        double ci=(principle *var3)-principle ;
        System.out.format("%.2f",ci ) ;
    }
}
