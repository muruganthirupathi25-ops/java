
package com.java;

import java.util.Scanner;

public class studentDeatils {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Class: ");
        String studentClass = sc.nextLine();

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;
        String grade;

        
        if (total > 0) {
            System.out.println("Total marks calculated.");
        }

        
        if (average >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        
        if (average >= 90) {
            grade = "O Grade";
        } else if (average >= 75) {
            grade = "A Grade";
        } else if (average >= 50) {
            grade = "B Grade";
        } else if (average >= 35) {
            grade = "C Grade";
        } else {
            grade = "Fail";
        }

       
        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            if (average >= 35) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        } else {
            System.out.println("Result: Fail");
        }

        
        switch (grade) {
            case "O Grade":
                System.out.println("Excellent");
                break;

            case "A Grade":
                System.out.println("Very Good");
                break;

            case "B Grade":
                System.out.println("Good");
                break;

            case "C Grade":
                System.out.println("Average");
                break;

            default:
                System.out.println("Need Improvement");
        }
        System.out.println();
        System.out.println("Student Details");
        System.out.println("Student Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Subject 1 Marks: " + m1);
        System.out.println("Subject 2 Marks: " + m2);
        System.out.println("Subject 3 Marks: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
