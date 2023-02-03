package com.kozakmarcin;

import com.kozakmarcin.domain.Translator;
import com.kozakmarcin.interfaces.Cli;

public class Main {
    public static void main(String[] args) {
        Cli cli = new Cli();
        Translator translator = new Translator(cli);
        translator.translate();
    }
}