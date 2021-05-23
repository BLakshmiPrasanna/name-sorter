package com.globalx.interview;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OutputServiceTest {
    List<String> expectedSortedList = Arrays.asList( "Marin Alvarez",
            "Adonis Julius Archer",
            "Beau Tristan Bentley",
            "Hunter Uriah Mathew Clarke",
            "Leo Gardner",
            "Vaughn Lewis",
            "London Lindsey",
            "Mikayla Lopez",
            "Janet Parsons",
            "Frankie Conner Ritter",
            "Shelby Nathan Yoder");
    OutputService outputService = new OutputService();
    String currentDir = System.getProperty("user.dir");
    File outputFile = new File(currentDir, "sorted-names.txt");

    @Test
    public void writeOutputToListTest() throws IOException {

        outputService.writeToFile(outputFile, expectedSortedList);
        BufferedReader reader = new BufferedReader(new FileReader(outputFile.getPath()));
        ArrayList<String> actualList = new ArrayList<String>();
        String line = reader.readLine();
        while (line != null) {
            actualList.add(line);
            line = reader.readLine();
        }
        reader.close();

        Assert.assertEquals(expectedSortedList.size(), (actualList).size());
        Assert.assertArrayEquals(expectedSortedList.toArray(), actualList.toArray());
    }
}
