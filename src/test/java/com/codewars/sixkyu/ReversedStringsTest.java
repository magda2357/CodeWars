package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
        assertEquals("dlrow", ReversedStrings.solution2("world"));
        assertEquals("dlrow", ReversedStrings.solution3("world"));
    }
}