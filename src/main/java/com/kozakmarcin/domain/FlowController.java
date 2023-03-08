package com.kozakmarcin.domain;

import com.kozakmarcin.interfaces.Cli;
import com.kozakmarcin.interfaces.Fli;

public class FlowController {
    Cli cli = new Cli();
    Fli fli = new Fli();


    public void flow(){
        showOptions();
        String input = cli.getInput();
        while (!input.equals("0")) {
            switch (input) {
                case "1" -> {
                    System.out.println("Podaj liczbę rzymską:");
                    new Translator(cli).translate();
                    showOptions();
                    input = cli.getInput();
                }
                case "2" ->{
                    System.out.println("Wartości z pliku:");
                    new DataFromFileTranslator(fli).dataTranslate();
                    showOptions();
                    input = cli.getInput();
                }
                default -> {
                    System.out.println("Podałeś nieprawidłową opcję. Spróbuj ponownie.");
                    showOptions();
                    input = cli.getInput();
                }
            }
        }

    }

    private void showOptions(){
        System.out.println("Witam. Wybierz jedną z opcji:");
        System.out.println("1. Wpisz liczbę w systemie rzymskim");
        System.out.println("2. Pobierz libczby rzymskie z pliku txt");
        System.out.println("3. Pobierz liczby rzymskie z bazy danych");
        System.out.println("4. Zapisz wyniki do pliku");
        System.out.println("5. Zapisz wyniki do bazy danych");
        System.out.println("0. Zakończ działanie programu");
    }


}


