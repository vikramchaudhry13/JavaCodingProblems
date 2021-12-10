package com.apnacollege;
import java.util.Scanner ;
public class palindromeExample {
        public static void main(String args[]){
            int r,sum=0,temp;
            Scanner s=new Scanner(System .in);
            System.out.println("enter no. which is to be checked");
            int n=s.nextInt() ;//It is the number variable to be checked for palindrome
            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;//adding remainder
                n=n/10;//removing last digit of given number
            }
            if(temp==sum) {
                System.out.println("palindrome number ");
            }
            else{
                System.out.println("not palindrome");
        }
    }
}
