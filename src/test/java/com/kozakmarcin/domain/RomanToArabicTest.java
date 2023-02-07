package com.kozakmarcin.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RomanToArabicTest {


    @ParameterizedTest
    @MethodSource("testCasesData")
    void arabicValue(String[] given, int expected) {
        RomanToArabic arabicValueTest = new RomanToArabic(given);

        int actual = arabicValueTest.translator();

        assertEquals(expected,actual);
    }
    static Stream<Arguments> testCasesData(){
        return Stream.of(
                arguments(new String[] {"I"},1),
                arguments(new String[] {"I","I"},2),
                arguments(new String[] {"I","I","I"},3),
                arguments(new String[] {"I","V"},4),
                arguments(new String[] {"V"},5),
                arguments(new String[] {"V","I"},6),
                arguments(new String[] {"V","I","I"},7),
                arguments(new String[] {"V","I","I","I"},8),
                arguments(new String[] {"I","X"},9),
                arguments(new String[] {"X"},10),
                arguments(new String[] {"X", "I"},11),
                arguments(new String[] {"M", "I"},1001)
        );
    }


}