package com.company.utils;

import com.company.model.ExamData;

public class DataExamAdapter {

    public static ExamData getData(String line){
        //ctlr+alt+v
        String[] split = line.split("\t");
        if(split.length != 5) return new ExamData("NOT FOUND");

        return generateData(split);
    }

    private static ExamData generateData(String[] split){
        String territory = split[0];
        String type = split[1];
        String gender = split[2];
        int year = Integer.parseInt(split[3]);
        int count = Integer.parseInt(split[4]);
        return new ExamData(territory, type, gender, year, count);
    }
}