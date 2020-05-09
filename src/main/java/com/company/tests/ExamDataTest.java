package com.company.tests;

import com.company.model.ExamData;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExamDataTest {

    ExamData examData;
    ExamData examDolnoslaskieData;
    @Before
    public void initData(){
        examData = new ExamData("Polska", "took", "men", 2010, 160988 );
        examDolnoslaskieData = new ExamData("Dolnośląskie");
    }

    @Test
    public void examDataExists(){
        assertNotNull(examData);
    }

    @Test
    public void examDataTerritorryIsCorrect(){
        assertEquals("Polska", examData.getTerritory());
    }

    @Test
    public void examDolnoslaskieDataTerritorryIsCorrect(){
        assertEquals("Dolnośląskie", examDolnoslaskieData.getTerritory());
    }

    @Test
    public void examDataTypeIsCorrect(){
        assertEquals("took", examData.getType());
    }

    @Test
    public void examDataGenderIsCorrect(){
        assertEquals("men", examData.getGender());
    }

    @Test
    public void examDataYearIsCorrect(){
        assertEquals(2010, examData.getYear());
    }

    @Test
    public void examDataCountIsCorrect(){
        assertEquals(160988, examData.getCount());
    }

}
