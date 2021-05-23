package com.globalx.interview;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputServiceTest {
    List<String> expectedList = Arrays.asList("Janet Parsons",
            "Vaughn Lewis",
            "Adonis Julius Archer",
            "Shelby Nathan Yoder",
            "Marin Alvarez",
            "London Lindsey",
            "Beau Tristan Bentley",
            "Leo Gardner",
            "Hunter Uriah Mathew Clarke",
            "Mikayla Lopez",
            "Frankie Conner Ritte");
    String path = "src/test/resources/unsorted-names-list.txt";
    InputService inputService = new InputService();
    @Test
    public void inputFileReadToListTest() throws IOException {

        ArrayList<String> actualList = inputService.readFileToList(path);
        Assert.assertEquals(expectedList.size(), (actualList).size());
        Assert.assertArrayEquals(expectedList.toArray(), actualList.toArray());
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void throwsErrorWhenTargetFileExists() throws IOException {
        expectedEx.expect(IOException.class);
        inputService.readFileToList("./testFilePath");
    }

}
