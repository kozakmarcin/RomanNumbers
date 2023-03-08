package com.kozakmarcin.domain;

import com.kozakmarcin.interfaces.DataCli;
import com.kozakmarcin.interfaces.Fli;

public class DataFromFileTranslator {
    private Fli loadedFile = new Fli();
    private DataCli dataCli;

    public DataFromFileTranslator(Fli loadedFile) {
        this.dataCli = new DataCli(loadedFile.getData());
    }

    public void dataTranslate(){
        for (int i = 0; i < loadedFile.getData().size(); i++) {
            new Translator(dataCli).translate();
        }
    }
}
