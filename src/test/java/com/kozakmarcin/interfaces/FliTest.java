package com.kozakmarcin.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FliTest {

    @Test
    void getData() {
        Fli test = new Fli();
        String givenData = test.getData().toString();
        String expectedData = "[L, XXX, LX, II, XI]";
        assertEquals(expectedData,givenData);

    }
}