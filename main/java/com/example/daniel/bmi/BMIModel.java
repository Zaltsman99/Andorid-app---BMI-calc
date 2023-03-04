package com.example.daniel.bmi;


public class BMIModel {
    public static double toDouble(String S){
        return Double.parseDouble(S);
    }

    public static double getBMI(double weight, double height){
        double result = weight / (height * height);
        return result;
    }

    public static String formatBMI(double bmi){
        return String.format("%.1f", bmi);
    }





}
