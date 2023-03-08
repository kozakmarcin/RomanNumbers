package com.kozakmarcin.interfaces;

import com.kozakmarcin.domain.Inputable;

import java.util.Scanner;

public class Cli implements Inputable {
    private Scanner scanner;

    public Cli() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        return scanner.next().toUpperCase();
    }
}
