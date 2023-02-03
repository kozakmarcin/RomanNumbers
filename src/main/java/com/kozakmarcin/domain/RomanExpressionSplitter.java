package com.kozakmarcin.domain;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class RomanExpressionSplitter {
    private static final String REGEX_PATTERN = "[IVXLCDM]";

    public String[] split(String romanExpression) {
        return Pattern.compile(REGEX_PATTERN)
                .matcher(romanExpression)
                .results()
                .map(MatchResult::group)
                .toArray(String[]::new);
    }
}
