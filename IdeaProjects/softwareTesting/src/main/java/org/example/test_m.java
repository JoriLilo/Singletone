package org.example;

public class test_m {
    public static void main(String [] args){
                System.out.println(test("hello",5));
                System.out.println(test("hello",7));
            }
            public static String test(String a, int b){
                if(b<0)
                    return "negative";

                if(b==0)
                    return "zero";

                if(b>0)
                    return "pozitive";
                return " ";


            }

    }
