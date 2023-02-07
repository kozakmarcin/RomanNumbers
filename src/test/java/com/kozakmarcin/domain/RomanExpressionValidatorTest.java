package com.kozakmarcin.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanExpressionValidatorTest {
    private final RomanExpressionValidator validator = new RomanExpressionValidator();

    @Test
    public void checkIfRomanianLetters() {
        validator.validate("MDCLXVI");
    }

    @Test
    public void checkNonRomanianLetters(){
        String expression = "abc";

        RuntimeException exception = Assertions.assertThrows(
                RuntimeException.class,
                () -> validator.validate(expression)
        );
    }

    @Test
    public void checkProperRomanianExpression(){
        validator.validate("MMXXIII");
    }

    @Test
    public void checkFourProperSign(){
        String expression = "XXXX";

        RuntimeException exception = Assertions.assertThrows(
                RuntimeException.class,
                () -> validator.validate(expression)
        );
    }

    @Test
    public void checkTwoLowerSignBeforeBigger(){
        String expression = "XXC";

        RuntimeException exception = Assertions.assertThrows(
                RuntimeException.class,
                () -> validator.validate(expression)
        );
    }
}