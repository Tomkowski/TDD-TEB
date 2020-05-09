package com.company.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ExamDataRepo {
    private ArrayList<ExamData> records;

    public ExamDataRepo(){
        records = new ArrayList<>();
    }

    public void add(ExamData examData) {
        records.add(examData);
    }
}