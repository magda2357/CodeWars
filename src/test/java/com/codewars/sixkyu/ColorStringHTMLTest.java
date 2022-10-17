package com.codewars.sixkyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class ColorStringHTMLTest {
    @Test
    public void symbolTest() throws Exception {
        assertEquals("#", ColorStringHTML.generateColor( new Random() ).substring(0,1) );
    }
}