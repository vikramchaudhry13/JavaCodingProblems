package com.apnacollege;

import java.util.*;
public class factorsofno
{
    public static void main (String []args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER A NUMBER");
            int n=sc.nextInt();
            int i,sum=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                    sum=sum+i;
            }
            System.out.print("SUM = "+sum);
        }
    }
