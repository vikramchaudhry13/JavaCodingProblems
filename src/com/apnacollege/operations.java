package com.apnacollege;

public class operations {
    public static int operations1(int N) {
        int count=1;
        while (N >= 0) {
            N = N - 2;
            count++;
        }
        System.out.println(count);
        return N;
    }
    public static void main(String []args){
       operations1(5);
       }
}