package com.apnacollege;
import java.io.* ;
import java.util.* ;
public class doctorStrange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        for (int i=1 ; i<=100 ; i++){
            if(A==i){
                if(B>=i && B<=i*6){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
