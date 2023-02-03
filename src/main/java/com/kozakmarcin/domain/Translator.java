package com.kozakmarcin.domain;

public class Translator {
    private final RomanExpressionValidator validator = new RomanExpressionValidator();
    private final RomanExpressionSplitter splitter = new RomanExpressionSplitter();
    private final Inputable inputable;


    public Translator(Inputable inputable) {
        this.inputable = inputable;
    }

    public void translate() {
        String possibleRomanExpression = inputable.getInput();
        String romanExpression = validator.validate(possibleRomanExpression);
        String[] romanExpressionComponents = splitter.split(romanExpression);
        int arabicValue = calculate(romanExpressionComponents);
        System.out.println("Wartość wyrażenia: " + possibleRomanExpression + " wynosi: " + arabicValue);

    }

    private int calculate(String[] expresion) {
        RomanToArabic arabicValue = new RomanToArabic(expresion);
        return arabicValue.translator();
    }
}

