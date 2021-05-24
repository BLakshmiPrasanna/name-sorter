package com.globalx.interview;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class App 
{
    public static void main (String[] args) throws IOException {
       try {
            //Read unsorted list from File
            InputService inputService = new InputService();
           String filePath = inputService.validateArguments(args);
            List<String> inputList = inputService.readFileToList(filePath);
            //Sort the inout list
            NamesSorter sorter = new NamesSorter();
            sorter.sortWithLastName(inputList);
            // create output file
            OutputService outputService = new OutputService();
            //write the sorted list to output file
            outputService.writeOutputToCurrentDir(inputList);
            outputService.displayOutputList(inputList);
        } catch (Exception e) {
           System.out.println("Error occurred during processing: " + e.getMessage());
        }
    }
}
