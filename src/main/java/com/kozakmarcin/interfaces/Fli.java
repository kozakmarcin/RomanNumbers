package com.kozakmarcin.interfaces;

import com.kozakmarcin.domain.DataReadable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Fli implements DataReadable {

    @Override
    public List<String> getData() {
        Path locPath = Paths.get("D:/java/JavaCourse/RomanNumbers/src/roman_data.txt");
        List<String> romanExpressions = new ArrayList<>();
        try{
            romanExpressions = Files.readAllLines(locPath);
        } catch (IOException e){
            System.out.println("IOException :" + e.getMessage());
        }
        return romanExpressions;
    }
}
