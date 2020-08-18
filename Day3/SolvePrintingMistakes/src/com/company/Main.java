package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string1;
        String string2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string (string must be at least 4 characters)");
        string1=sc.nextLine();
        System.out.println("Enter the secound string (string must be at least 4 characters)");
        string2=sc.nextLine();
        if(string1.length()<4||string2.length()<4) {
            System.err.println("String must be greather than 4 characters");
            return;
        }
       String Newstring1=string1.replace(string1.charAt(0),string2.charAt(string2.length()-2))
        .replace(string1.charAt(1),string2.charAt(string2.length()-1))
         .replace(string1.charAt(string1.length()-2),string2.charAt(0))
        .replace(string1.charAt(string1.length()-1),string2.charAt(1));

        String Newstring2=string2.replace(string2.charAt(0),string1.charAt(string1.length()-2))
                .replace(string2.charAt(1),string1.charAt(string1.length()-1))
                .replace(string2.charAt(string2.length()-2),string1.charAt(0))
                .replace(string2.charAt(string2.length()-1),string1.charAt(1));


        System.out.println("Output :");
        System.out.println("String 1:"+Newstring1);
        System.out.println("String 2:"+Newstring2);

    }
}
