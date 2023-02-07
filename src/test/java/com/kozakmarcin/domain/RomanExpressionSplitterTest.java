package com.kozakmarcin.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanExpressionSplitterTest {

    private RomanExpressionSplitter splitter = new RomanExpressionSplitter();


    @Test
    void splitProperRomanExpression() {
        // Given
        String input = "XXXCDM";

        // When
        String[] split = splitter.split(input);

        // Then
        Assertions.assertEquals("X", split[0]);
        Assertions.assertEquals("X", split[1]);
        Assertions.assertEquals("X", split[2]);
        Assertions.assertEquals("C", split[3]);
        Assertions.assertEquals("D", split[4]);
        Assertions.assertEquals("M", split[5]);
    }

    @Test
    void splitExpressionWithIncorectLetters(){
        // Given
        String input = "ABEF";

        // When
        String[] split = splitter.split(input);

        // Then
        Assertions.assertEquals(0 ,split.length);
    }


}