package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class ReversedWordsTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReversedWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReversedWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReversedWords.reverseWords("The world is nice"));
    }
}