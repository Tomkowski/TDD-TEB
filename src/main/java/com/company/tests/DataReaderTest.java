package com.company.tests;

import com.company.utils.DataReader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataReaderTest {

    DataReader dataReader;

    @Before
    public void initDataReader(){
        dataReader = new DataReader("/data.txt");
    }

    @Test
    public void DataReaderExists(){
        assertNotNull(dataReader);
    }

    @Test
    public void returnedLineIsNotEmpty(){
        assertFalse(dataReader.readLine().isEmpty());
    }

    @Test
    public void isEndOfFile(){
        assertTrue(dataReader.hasNext());
    }

}
