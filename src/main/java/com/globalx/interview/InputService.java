package com.globalx.interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputService {

    public ArrayList<String> readFileToList(String inputFilePath) {
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
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND Please enter correct file path");
        } catch (IOException e) {

            e.printStackTrace();
        }
        return list;

    }
}
