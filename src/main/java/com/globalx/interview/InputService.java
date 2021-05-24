package com.globalx.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputService {

    public String validateArguments(String[] args)  {
        String inputFilePath = "";
        if (args.length == 1){
            inputFilePath = args[0];
        }
        else {
            throw new IllegalArgumentException("Invalid arguments passed. Only one filename is accepted as argument");
        }
        return inputFilePath;
    }

    public ArrayList<String> readFileToList(String inputFilePath) throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error reading from file" + inputFilePath + ": " + e.getMessage());
            throw e;
        }
        return list;
    }
}
