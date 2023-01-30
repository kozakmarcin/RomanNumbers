package com.kozakmarcin.interfaces;

import com.kozakmarcin.domain.Inputable;

import java.util.Scanner;

public class Cli implements Inputable {
    private Scanner scanner;

    public Cli(){
        scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        System.out.println("Input a roman number: ");
        return scanner.next().toUpperCase();
    }
}
