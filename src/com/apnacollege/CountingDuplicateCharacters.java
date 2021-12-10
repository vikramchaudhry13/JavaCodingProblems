package com.apnacollege;
import java.util.* ;
public class CountingDuplicateCharacters {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for (int i=0;i<s.length();i++ ){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                    System.out.print(s.charAt(i));
                }
            }
        }
        System.out.println("");
        System.out.println(c);
    }
}
