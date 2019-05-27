package com.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgrammingTest {

    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('A', Programming.getFirstNonRepeatedChar("Accenture"));
        assertEquals('h', Programming.getFirstNonRepeatedChar("hello"));
        assertEquals('R', Programming.getFirstNonRepeatedChar("Ramjeet"));
        assertEquals('J', Programming.getFirstNonRepeatedChar("Java"));
        assertEquals('i', Programming.getFirstNonRepeatedChar("simplest"));
    }
}
