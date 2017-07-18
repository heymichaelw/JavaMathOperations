package com.corrections;

import java.util.Scanner;

public class Main {

    public static void showResults(double sum, double difference, double division, double multiplication, double remainder){
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + multiplication);
        System.out.println("The quotient is: " + division);
        System.out.println("After division, the remainder is: " + remainder);
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner( System.in );
       double operand1;
       double operand2;

       System.out.println("Give me a number");
       operand1 = Double.parseDouble(scanner.nextLine());
       System.out.println("Give me another number");
       operand2 = Double.parseDouble(scanner.nextLine());

       double sum = operand1 + operand2;
       double difference = operand1 - operand2;
       double division = operand1 / operand2;
       double multiplication = operand1 * operand2;
       double remainder = operand1 % operand2;

       showResults(sum, difference, division, multiplication, remainder);

    }
}
