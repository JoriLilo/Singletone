package org.example;

public class ush {
    public static void main(String[] args){
        System.out.println(pjestimiNr(4,2));
    }
    public static int pjestimiNr(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }
}




