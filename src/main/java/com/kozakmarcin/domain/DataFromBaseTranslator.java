package com.kozakmarcin.domain;

import com.kozakmarcin.interfaces.DataCli;

public class DataFromBaseTranslator {
    private DataBase dataBase = new DataBase();
    private DataCli dataCli;

    public DataFromBaseTranslator(DataBase dataBase) {
        this.dataCli = new DataCli(dataBase.getData());
    }

    public void dataTranslate(){
        for (int i = 0; i < dataBase.getData().size(); i++) {
            new Translator(dataCli).translate();
        }
    }
}
