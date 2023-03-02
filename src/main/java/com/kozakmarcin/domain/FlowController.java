package com.kozakmarcin.domain;

import com.kozakmarcin.interfaces.Cli;

public class FlowController {
    Cli cli = new Cli();

    Translator translator = new Translator(cli);


    public void translate(){
        translator.translate();
    }

    public void flow(){
        int options =0;

    }

}


