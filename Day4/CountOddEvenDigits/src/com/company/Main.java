package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numberOfOdds=0;
        int numberOfEvens=0;
        String InputNumber;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        InputNumber=sc.nextLine();
        int lengthOfStringNumber=InputNumber.length();
        for (int i=0;i<lengthOfStringNumber;i++){
            String character=""+InputNumber.charAt(i);
           if(!isNumeric(character))
               continue;
            if(Integer.parseInt(character)%2==0){
                ++numberOfEvens;
            }else{
                ++numberOfOdds;
            }
        }
        System.out.println("Output :");
        System.out.println("Odd digit :"+numberOfOdds);
        System.out.println("Even digit:"+numberOfEvens);
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
