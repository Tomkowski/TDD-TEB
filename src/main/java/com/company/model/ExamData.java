package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExamData {
    private String territory;
    private String type;
    private String gender;
    private int year;
    private int count;

    public ExamData(String territory) {
        this.territory = territory;
    }
}
