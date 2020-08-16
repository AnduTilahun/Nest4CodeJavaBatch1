package com.company;

public class Main {



    static private final int oneFoot=12;
    static private final float OneInch=2.54f;
    static private final float OneKg=2.2f;



    public static void main(String[] args) {
        System.out.print("Height In Cm ");
        System.out.printf("%.2f", HeightConvertor(5,11));
        System.out.println();
        System.out.print("Weight In Pounds ");
        System.out.printf("%.2f", WeightConvertor(60));
        System.out.println();
        System.out.print("Height In Cm ");
        System.out.printf("%.1f", HeightConvertor(5,0));
        System.out.println();
        System.out.print("Weight In Pounds ");
        System.out.printf("%.1f", WeightConvertor(101));
    }
    static float HeightConvertor(int heightFeetPart,int heightInchPart){
        return ((heightFeetPart*oneFoot)*OneInch)+(heightInchPart*OneInch);
    }
    static float WeightConvertor(int weight){
        return weight*OneKg;
    }
}
