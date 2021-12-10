package com.apnacollege;

public class distributingmoney {
    public static int distributingmoney1(long x, long y, long z, long K){
        //Enter your code here
        if(x>y){
            y++;
        }
        if(x>z){
            z++;
        }
        if(y>x){
            x++;
        }
        if(y>z){
            z++;
        }
        if(z>x){
            x++;
        }
        if(z>y){
            y++;
        }
        if(x==y && x==z){
            return 1;
        }
        return 0;
    }
    public static void main(String []args){
        distributingmoney1(1,2,3,3);
    }
}
