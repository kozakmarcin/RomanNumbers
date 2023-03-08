package com.kozakmarcin.interfaces;

import org.junit.jupiter.api.Test;

class FliTest {

    @Test
    void getData() {
        Fli test = new Fli();
        test.getData().forEach(System.out::println);

    }
}