package com.kozakmarcin.domain;

import org.junit.jupiter.api.Test;

class DataBaseTest {

    @Test
    void getData() {
        DataBase dataBase = new DataBase();
        dataBase.getData().forEach(System.out::println);
    }
}