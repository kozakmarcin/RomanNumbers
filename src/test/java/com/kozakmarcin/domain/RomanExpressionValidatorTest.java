package com.kozakmarcin.domain;

import org.junit.jupiter.api.Test;

class RomanExpressionValidatorTest {
    private final RomanExpressionValidator validator = new RomanExpressionValidator();

    @Test
    public void checkIfRomanianLetters() {
        validator.validate("IVMDa");
    }
}