package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class FelineParameterizedTest {

    private final int input;
    private final int expected;
    Feline feline;


    public FelineParameterizedTest(int kittenIn, int kittenOut) {
        this.input = kittenIn;
        this.expected = kittenOut;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {10, 10},
                {100, 100}
        };
    }

    @Test
    public void getKittensAllInputReturnsTheSameNumber() {
        feline = new Feline();
        assertEquals("Возвращаемое значение не равно ожидаемому", expected, feline.getKittens(input));
    }
}