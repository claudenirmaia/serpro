package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    
    Calculator c = new Calculator();

    @Test
    public void sum(){
        assertEquals(20, c.Soma(10, 10));
    }

}
