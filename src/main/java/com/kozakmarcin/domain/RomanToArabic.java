package com.kozakmarcin.domain;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RomanToArabic {

    private String[] romanValues;

    public RomanToArabic(){
        romanValues = null;
    }

    public RomanToArabic(String[] romanValues) {
        this.romanValues = romanValues;
    }


    public int translator (){
        int sum = 0;
        List<String> valuesToTranslate = Arrays.asList(this.romanValues);
        ListIterator<String> iterator =valuesToTranslate.listIterator();
        while (iterator.hasNext()){
            int actualValue = arabicValue(iterator.next());
            int nextValue =0;
            if (iterator.hasNext()){
                nextValue =  arabicValue(iterator.next());
                iterator.previous();
            }
            if (nextValue>actualValue){
                sum-=actualValue;

            }else{
                sum+= actualValue;
            }
        }

        return sum;
    }

    public int arabicValue(String romanValue){
        int value = 0;
        switch (romanValue){
            case "I" -> value = LetterAndValues.I.getValue();
            case "V" -> value = LetterAndValues.V.getValue();
            case "X" -> value = LetterAndValues.X.getValue();
            case "L" -> value = LetterAndValues.L.getValue();
            case "C" -> value = LetterAndValues.C.getValue();
            case "D" -> value = LetterAndValues.D.getValue();
            case "M" -> value = LetterAndValues.M.getValue();
        }
        return value;
    }

}
