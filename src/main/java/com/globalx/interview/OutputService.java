package com.globalx.interview;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputService {

    public void writeToFile(String outputFilePath, List<String> list) {
        FileWriter writer;
        try {

            writer = new FileWriter(outputFilePath);
            for (String str: list) {
                writer.write(str);
                writer.write(System.lineSeparator());
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
