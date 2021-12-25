package com.apnacollege;
import java.util.* ;
import java.io.* ;
public class spdEmergency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p1=s.nextInt();
        int p2=s.nextInt();
        int p3=s.nextInt();
        int p4=s.nextInt();
        int p5=s.nextInt();
        if(p1<p2+p3+p4+p5 && p2<p1+p3+p4+p5 && p3<p1+p2+p4+p5 && p4<p1+p2+p3+p5 && p5<p1+p2+p3+p4){
            System.out.println("Stable");
        }else{
            System.out.println("SPD Emergency");
        }        // Your code here
    }
}
