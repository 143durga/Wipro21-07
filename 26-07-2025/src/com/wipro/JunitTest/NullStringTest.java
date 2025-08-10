package com.wipro.JunitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NullStringTest {
	@Test
    public void testNullToUppercase_throwsException() {
        String str = null;
        assertThrows(NullPointerException.class, () -> {
            str.toUpperCase();
        });
    }
}
