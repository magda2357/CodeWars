package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToStringTest {
    @Test
    public void tests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("123", NumberToString.numberToString2(123));
        assertEquals("999", NumberToString.numberToString3(999));
    }
}
