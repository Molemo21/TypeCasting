package com.opps.demo;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
      
        
        double result;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        
        scanner.close();
    }
}