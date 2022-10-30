package com_bridgelabz_linecomparison;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Line l1 = new Line();
        l1.p1 = new Point();

        l1.p1.x = 10;
        l1.p1.y = 20;

        l1.p2 = new Point();

        l1.p2.x = 80;
        l1.p2.y = 100;

        Line l2 = new Line();

        l2.p1 = new Point();

        l2.p1.x = 10;
        l2.p1.y = 20;

        l2.p2 = new Point();

        l2.p2.x = 80;
        l2.p2.y = 75;

        Float length1 = l1.getLength();  //object
        System.out.println(length1);

        Float length2 = l2.getLength();
        System.out.println(length2);

        if (length1.equals(length2)) {
            System.out.println("Both lines are equal");

        } else {
            System.out.println("lines are not equal");
        }


        Float Value1 = new Float(length1);
        Float Value2 = new Float(length2);


        //compares two Float objects numerically
        int compare = Value1.compareTo(Value2);
        if (compare > 0) {
            int sub = (int) (Value1 - Value2);
            System.out.println(Value1 + " is greater. \nAnswer after subtraction is= " + sub);
        } else if (compare < 0) {
            int sub = (int) (Value2 - Value1);
            System.out.println(Value2 + " is greater. \nAnswer after subtraction is= " + sub);
        } else {
            int sub = (int) (Value1 - Value2);
            System.out.println(" Both are equal! \nAnswer after subtraction is= " + sub);
        }

    }
}


