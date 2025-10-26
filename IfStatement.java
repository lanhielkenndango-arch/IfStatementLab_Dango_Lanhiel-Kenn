/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifstatement;

import java.util.Scanner;

/**
 *
 * @author shadow
 */
public class IfStatement {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Lab Activity 1: Using If Statements, Integer & Double Data Types, and Scanner");
        System.out.println();

        System.out.println("Problem 1: Age Category Checker");
        System.out.print("Enter Age: ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
        System.out.println();

        System.out.println("Problem 2: Temmperature Evaluation");
        System.out.print("Enter Temperature: ");
        double temp = input.nextInt();

        if (temp < 0) {
            System.out.println("Freezing point.");
        } else if (temp <= 25) {
            System.out.println("Normal weather.");
        } else {
            System.out.println("Hot weather.");
        }
        System.out.println();

        System.out.println("Problem 3: Simple Grade Evaluation");
        System.out.print("Enter a number: ");
        int grade = input.nextInt();

        if (grade < 0 || grade > 100) {               //gi limit nako daan kay out of 100 lng mn and dili practical ang below zero na score
            System.out.println("Invalid");
        } else if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        System.out.println();
        
        System.out.println("Problem 4: Circle Calculator");
        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        if (radius <= 0) {
            System.out.println("Invalid radius");
        } else {
            System.out.println("The area is " + area + " and the circumference is " + circumference + ".");
        }
        System.out.println();
        
        System.out.println("Problem 5: Even or Odd Number");
        System.out.print("Enter a Integer: ");
        
            int number = input.nextInt();
            
            if (number % 2 == 0) {                   // nag gamit ko og modulo operator para ma determined nako kung odd or even. ang modulo kay mag hatag og remainder after running the program and ang remainder ang basis if it odd or even 
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        
    
        


    }
}
