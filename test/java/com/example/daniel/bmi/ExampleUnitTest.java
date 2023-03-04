package com.example.daniel.bmi;

import android.service.autofill.FieldClassification;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void getBMITest() {
        double w, h;
        System.out.println("Testing BMI.getBMI");

        w = 90;
        h = 1.8;
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w, h));

    }

    @Test
    public void Test2() {
        int k = 2;
        int [] a = {7,35,4,11,53};
        try{
            switch (a[k]%5){
                case 0:
                    throw new IllegalArgumentException();
                case 1:
                    throw new IllegalArgumentException();
                case 2:
                    throw new ArithmeticException();
                case 3:
                    throw new NullPointerException();
                default:
                    throw new Exception();
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(20);
        }
        catch(NullPointerException e){
            System.out.println(10);
        }
        catch(ArithmeticException e){
            System.out.println(15);
        }
        catch(Exception e){
            System.out.println(5);
        }

    }




}







