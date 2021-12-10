package com.apnacollege;


//Given an integer n, denoting the number of cuts that can be made on a pancake, find the maximum number of pieces that can be formed by making n cuts.
//        NOTE: Cuts can't be horizontal.

class TheLazyCatererProblem {
    public int maximum_Cuts(int n)
    {
        int x;
        x=(n*(n+1))/2 + 1;// code here
        return x;
    }
}
