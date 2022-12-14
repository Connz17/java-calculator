package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Computations compute = new Computations();
        Scanner calculator = new Scanner(System.in);

        double number1, number2;
        double answer = 0;


        System.out.println("Please enter the operation you would like to execute (+, -, *, /, square, root(√))");
        char operation = calculator.nextLine().charAt(0);

        switch (operation){
            case '+':
                System.out.println("Enter the first number");
                number1 = calculator.nextDouble();
                System.out.println("Enter the second number");
                number2 = calculator.nextDouble();
                answer = compute.addition(number1, number2);
                System.out.println(answer);

                break;
            case '-':
                System.out.println("Enter the first number");
                number1 = calculator.nextDouble();
                System.out.println("Enter the second number");
                number2 = calculator.nextDouble();
                answer = compute.subtraction(number1, number2);
                System.out.println(answer);

                break;
            case '*':
                System.out.println("Enter the first number");
                number1 = calculator.nextDouble();
                System.out.println("Enter the second number");
                number2 = calculator.nextDouble();
                answer = compute.multiplication(number1, number2);
                System.out.println(answer);

                break;
            case '/':
                System.out.println("Enter the first number");
                number1 = calculator.nextDouble();
                System.out.println("Enter the second number");
                number2 = calculator.nextDouble();
                answer = compute.division(number1, number2);
                System.out.println(answer);

                break;
            case 's':
                System.out.println("Enter the first number");
                number1 = calculator.nextDouble();
                answer = compute.square(number1);
                System.out.println(answer);

                break;
            case 'r':
                System.out.println("Enter the first number");
                number1 = calculator.nextDouble();
                answer = compute.squareRoot(number1);
                System.out.println(answer);

                break;

            default:
                System.out.println("Wrong input entered");
                break;
        }

        boolean on = true;

        while (on){
            calculator.nextLine();
            System.out.println("Continue calculation: ('YES' / 'NO')");
            String power = calculator.nextLine();
        if (power.equalsIgnoreCase("no")){
            on = false;
        }

        if (power.equalsIgnoreCase("yes")){
            System.out.println("Please enter the operation you would like to execute (+, -, *, /, square, root(√))");
            operation = calculator.nextLine().charAt(0);
            switch (operation){
                case '+':
                    System.out.println("Enter the second number");
                    number2 = calculator.nextDouble();
                    answer = compute.addition(answer, number2);
                    System.out.println(answer);
                    break;
                case '-':
                    System.out.println("Enter the second number");
                    number2 = calculator.nextDouble();
                    answer = compute.subtraction(answer, number2);
                    System.out.println(answer);
                    break;
                case '*':
                    System.out.println("Enter the second number");
                    number2 = calculator.nextDouble();
                    answer = compute.multiplication(answer, number2);
                    System.out.println(answer);
                    break;
                case '/':
                    System.out.println("Enter the second number");
                    number2 = calculator.nextDouble();
                    answer = compute.division(answer, number2);
                    System.out.println(answer);
                    break;
                case 's':
                    answer = compute.square(answer);
                    System.out.println(answer);
                    break;
                case 'r':
                    answer = compute.squareRoot(answer);
                    System.out.println(answer);
                    break;
                default:
                    System.out.println("Wrong input entered");
                    break;
            }
        }

        }

    }
}