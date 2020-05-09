package com.company.tests;

import com.company.model.ExamData;
import com.company.model.ExamDataRepo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExamDataRepoTest {

    ExamDataRepo dataRepo;
    ExamData examData;
    @Before
    public void initRepo(){
        dataRepo = new ExamDataRepo();
        examData = new ExamData("Polska");
    }


    @Test
    public void ExamDataRepoExists(){
        assertNotNull(dataRepo);
    }

    @Test
    public void ExamDataRepoListIsEmpty(){
        assertEquals(0, dataRepo.getRecords().size());
    }

    @Test
    public void ExamDataRepoListSizeIncreasesAfterAddingElement(){
        dataRepo.add(examData);
        assertEquals(1, dataRepo.getRecords().size());
    }

}
