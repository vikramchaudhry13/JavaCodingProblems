package com.apnacollege;
import java.util.* ;
public class ticTacToe {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        char b=s.next().charAt(0);
        if(a=='R'){
            System.out.println("R");
        }else if(b=='R'){
            System.out.println("R");
        }else if(a=='J'){
            System.out.println(b);
        }else if(b=='J'){
            System.out.println(a);
        }else{
            System.out.println("D");
        }              // Your code here
    }
}
