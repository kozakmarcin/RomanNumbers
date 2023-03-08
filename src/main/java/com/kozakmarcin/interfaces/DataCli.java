package com.kozakmarcin.interfaces;

import com.kozakmarcin.domain.Inputable;

import java.util.List;

public class DataCli implements Inputable {
    private List<String> data;

    public DataCli(List<String> data) {
        this.data = data;
    }

    @Override
    public String getInput() {
        String rowToTranslate = "";
        if (!data.isEmpty()) {
            rowToTranslate = data.get(0).toUpperCase();
            data.remove(0);
        }
        return rowToTranslate;
    }
}
