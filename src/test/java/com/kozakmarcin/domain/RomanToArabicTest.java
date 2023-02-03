package com.kozakmarcin.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToArabicTest {

    @Test
    void translator() {
        // Given
        String[] input = new String[]{"X", "L"};

        // When
        int romanToArabic = new RomanToArabic(input).translator();

        // Expected
        Assertions.assertEquals(40, romanToArabic);
    }

    @Test
    void arabicValue() {
        RomanToArabic arabicValueTest = new RomanToArabic();

        //Given
        String input = "V";

        //When
        int output = arabicValueTest.arabicValue(input);

        //Then
        Assertions.assertEquals(5, output);
    }
}