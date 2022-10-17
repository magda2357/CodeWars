package com.codewars.sixkyu;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ColorStringHTMLTest {
    @Test
    public void symbolTest() throws Exception {
        assertEquals("#", ColorStringHTML.generateColor(new Random()).substring(0, 1));
    }
}