package com.apnacollege;
import java.math.*;
public class icecream {
    public static int icecream1(int N, int D) {
        for (int i=0;i<D;i++) {
           N =Math.floorDiv(N,2);
           N = N * 3;
        }
        System.out.println(N);
        return N;
    }
    public static void main(String []args){
        icecream1(2,4);
    }
}
