package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ComputationsTest {

    Computations computations;

    @BeforeEach
    public void init(){computations = new Computations();}

    @org.junit.jupiter.api.Test
    void addition_ValidAdditionOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.addition(5, 5);

        assertEquals(answer, 10);
    }

    @org.junit.jupiter.api.Test
    void addition_InvalidAdditionOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.addition(15, 67);

        assertNotEquals(answer, 10);
    }

    @org.junit.jupiter.api.Test
    void subtraction_ValidSubtractionOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.subtraction(5, 5);

        assertEquals(answer, 0);
    }

    @org.junit.jupiter.api.Test
    void subtraction_InvalidSubtractionOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.subtraction(15, 7);

        assertNotEquals(answer, 3);
    }

    @org.junit.jupiter.api.Test
    void multiplication_ValidMultiplicationOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.multiplication(5, 2);

        assertEquals(answer, 10);
    }

    @org.junit.jupiter.api.Test
    void multiplication_InvalidMultiplicationOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.multiplication(15, 7);

        assertNotEquals(answer, 2);
    }

    @org.junit.jupiter.api.Test
    void division_ValidDivisionOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.division(10, 2);

        assertEquals(answer, 5);
    }

    @org.junit.jupiter.api.Test
    void division_InvalidDivisionOfTwoNumbers_ReturnsSum() {
        double  answer;

        answer = computations.division(50, 2);

        assertNotEquals(answer, 2);
    }

    @org.junit.jupiter.api.Test
    void square_ValidSquaringOfANumber_ReturnsSum() {
        double  answer;

        answer = computations.square(10);

        assertEquals(answer, 100);
    }

    @org.junit.jupiter.api.Test
    void square_InvalidSquaringOfANumber_ReturnsSum() {
        double  answer;

        answer = computations.square(5);

        assertNotEquals(answer, 15);
    }

    @org.junit.jupiter.api.Test
    void squareRoot_ValidSquareRootOfANumber_ReturnsSum() {
        double  answer;

        answer = computations.squareRoot(100);

        assertEquals(answer, 10);
    }

    @org.junit.jupiter.api.Test
    void squareRoot_InvalidSquareRootOfANumber_ReturnsSum() {
        double  answer;

        answer = computations.squareRoot(25);

        assertNotEquals(answer, 15);
    }
}