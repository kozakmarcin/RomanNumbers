package com.kozakmarcin.interfaces;

import com.kozakmarcin.domain.Inputable;

import java.util.List;
import java.util.Stack;

public class DataCli implements Inputable {
    private Stack<String> stackedData;

    public DataCli(List<String> data) {
        stackedData = new Stack<>();
        stackedData.addAll(data);
    }

    @Override
    public String getInput() {
        String rowToTranslate = "";
        if (!stackedData.empty()) {
            rowToTranslate = stackedData.pop().toUpperCase();
        }
        return rowToTranslate;
    }
}
