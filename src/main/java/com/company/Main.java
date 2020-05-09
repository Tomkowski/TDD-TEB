package com.company;

import com.company.model.ExamData;
import com.company.model.ExamDataRepo;
import com.company.utils.DataExamAdapter;
import com.company.utils.DataReader;

public class Main {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader("/data.txt");
        ExamDataRepo dataRepo = new ExamDataRepo();
        dataReader.readLine();
        while(dataReader.hasNext()){
            dataRepo.add(DataExamAdapter.getData(dataReader.readLine()));
          }

        for(ExamData data: dataRepo.getRecords()){
            System.out.println(data);
        }
        System.out.println(dataRepo.getRecords().size());
    }
}
