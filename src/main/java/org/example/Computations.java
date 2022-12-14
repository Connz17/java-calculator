package org.example;

public class Computations {

    public Computations() {
    }

    public double addition( double num1, double num2){
        double ans = num1 + num2;
        return ans;
    }

    public double subtraction( double num1, double num2){
        double ans = num1 - num2;
        return ans;
    }

    public double multiplication( double num1, double num2){
        double ans = num1 * num2;
        return ans;
    }

    public double division( double num1, double num2){
        double ans = num1 / num2;
        return ans;
    }

    public double square( double num){
        double ans = Math.pow(num, 2);
        return ans;
    }

    public double squareRoot( double num){
        double ans = Math.sqrt(num);
        return ans;
    }
}
