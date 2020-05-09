package com.company.utils;

import java.util.Scanner;

public class DataReader {

    Scanner scanner;

    public DataReader(String path) {
        scanner = new Scanner(DataReader.class.getResourceAsStream(path));
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public boolean hasNext() {
        return scanner.hasNextLine();
    }
}
