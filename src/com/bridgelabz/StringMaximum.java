package com.bridgelabz;

import java.util.Scanner;

public class StringMaximum {
    private static String snum1, snum2, snum3, stringMaximumNumber;

	public static void stringNumberMax(){
        Scanner scanstringobj = new Scanner(System.in);
        System.out.println(" enter the String  s1 : ");
        snum1 = scanstringobj.next();
        System.out.println(" enter the String s2 : ");
        snum2 = scanstringobj.next();
        System.out.println(" enter the String s3 : ");
        snum3 = scanstringobj.next();
        int c11 = snum1.compareTo(snum2);
        int c12 = snum1.compareTo(snum3);
        int c21 = snum2.compareTo(snum3);


        if( c11 > 0 && c12 > 0){
            stringMaximumNumber = snum1;
            System.out.println( "Maximum String at 1st Position :" + snum1);
        } else if(c11 < 0 && c21 > 0){
            stringMaximumNumber = snum2;
            System.out.println("Maximum String at 2nd Position : " + snum2);
        } else {
            stringMaximumNumber = snum3;
            System.out.println("Maximum number in 3rd Position : " + snum3);
        }

    }
    public static void main(String[] args) {
        stringNumberMax();
    }

}
