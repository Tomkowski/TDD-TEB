package com.company.tests;

import com.company.model.ExamData;
import com.company.utils.DataExamAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DataExamAdapterTest {


    DataExamAdapter examAdapter;
    String line;
    String line1;
    ExamData examData;
    ExamData examData1;
    @Before
    public void initAdapter(){
        examAdapter = new DataExamAdapter();
        line = "Polska\ttook\tmen\t2010\t160988";
        line1 = "Dolnośląskie\ttook\tmen\t2016\t7481";
        examData = DataExamAdapter.getData(line);
        examData1 = DataExamAdapter.getData(line1);
    }

    @Test
    public void dataExamAdapterExists(){
        assertNotNull(examAdapter);
    }

    @Test
    public void dataExamAdapterReturnsNotNull(){
        assertNotNull(DataExamAdapter.getData(line));
    }

   @Test public void dataExamAdapterTerritoryIsCorrect(){
        assertEquals("Polska", examData.getTerritory());
    }

    @Test public void dataExam1AdapterTerritoryIsCorrect(){
        assertEquals("Dolnośląskie", examData1.getTerritory());
    }
    @Test public void dataExamAdapterTypeIsCorrect(){
        assertEquals("took", examData.getType());
    }

    @Test public void dataExamAdapterGenderIsCorrect(){
        assertEquals("men", examData.getGender());
    }

    @Test public void dataExamAdapterYearIsCorrect(){
        assertEquals(2010, examData.getYear());
    }

    @Test public void dataExamAdapterCountIsCorrect(){
        assertEquals(160988, examData.getCount());
    }


}
