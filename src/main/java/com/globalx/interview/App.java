package com.globalx.interview;

import java.io.File;
import java.util.List;


public class App 
{
    public static void main (String[] args)
    {
        try {
            //Read unsorted list from File
            InputService inputService = new InputService();
            List<String> inputList = inputService.readFileToList(args[0]);
            //Sort the inout list
            NamesSorter sorter = new NamesSorter();
            sorter.sort(inputList);
            // create output file
            OutputService outputService = new OutputService();
            //write the sorted list to output file
            outputService.writeOutputToCurrentDir(inputList);
        } catch (Exception e) {
            System.out.println("Error occured during processing: " + e.getMessage());
        }
    }
}
