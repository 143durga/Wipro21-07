package com.wipro.JunitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringLowerTest {
	    @ParameterizedTest
	    @ValueSource(strings = { "hello", "world", "java"})
	    void test(String input) {
	        assertTrue(input.equals(input.toLowerCase()));

	}

}
