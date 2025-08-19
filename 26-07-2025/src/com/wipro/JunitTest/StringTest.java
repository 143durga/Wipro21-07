package com.wipro.JunitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    public void testIsUpperCase() {
        String input = "HELLO";
        assertTrue(input.equals(input.toUpperCase()));
    }
}
