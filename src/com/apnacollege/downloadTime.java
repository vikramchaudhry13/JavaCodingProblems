package com.apnacollege;
import java.io.* ;
import java.util.* ;
public class downloadTime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int file=s.nextInt();
        int speed=s.nextInt();
        double convert= 0.125*speed;
        int seconds= (int) (file / convert) ;
        System.out.println(seconds);
    }
}
