package com.java;

import java.util.Scanner;

class Employee {

    int empId;
    String empName;
    double basicSalary;

    void getDetails(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {

    String department;

    void getManagerDetails(Scanner sc) {
        getDetails(sc);

        sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayManager() {
        System.out.println("\n--- Manager Details ---");
        display();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    void getDeveloperDetails(Scanner sc) {
        getDetails(sc);

        sc.nextLine();
        System.out.print("Enter Programming Language: ");
        programmingLanguage = sc.nextLine();
    }

    void displayDeveloper() {
        System.out.println("\n--- Developer Details ---");
        display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {

    double stipend;

    void getInternDetails(Scanner sc) {
        getDetails(sc);

        System.out.print("Enter Monthly Stipend: ");
        stipend = sc.nextDouble();
    }

    void displayIntern() {
        System.out.println("\n--- Intern Details ---");
        display();
        System.out.println("Monthly Stipend: " + stipend);
    }
}

public class oppEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.println("--- Enter Manager Details ---");
        m.getManagerDetails(sc);

        Developer d = new Developer();

        System.out.println("\n--- Enter Developer Details ---");
        d.getDeveloperDetails(sc);

        Intern i = new Intern();

        System.out.println("\n--- Enter Intern Details ---");
        i.getInternDetails(sc);

        System.out.println("\n========== Employee Details ==========");

        m.displayManager();
        d.displayDeveloper();
        i.displayIntern();

        sc.close();
    }
}