package com.kozakmarcin.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanExpressionValidator {
    private static final String REGEX_PATTERN = "^[IVXLCDM]*$";

     public String validate(String possibleRomanianExpression){
         Pattern compiledRegexPattern = Pattern.compile(REGEX_PATTERN);
         Matcher matcher =compiledRegexPattern.matcher(possibleRomanianExpression);

         if (matcher.matches()){
             return possibleRomanianExpression;
         } else {
             throw new RuntimeException("'" + possibleRomanianExpression + "' is not a valid romanian number");
         }
     }

}
