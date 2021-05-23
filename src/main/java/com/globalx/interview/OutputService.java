package com.globalx.interview;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputService {

    private static String OUTPUT_FILE_NAME = "sorted-names.txt";

    public void writeToFile(File outputFile, List<String> list) {
        FileWriter writer;
        try {

            writer = new FileWriter(outputFile);
            for (String str: list) {
                writer.write(str);
                writer.write(System.lineSeparator());
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeOutputToCurrentDir(List<String> list) {
        String currentDir = System.getProperty("user.dir");
        File outputFile = new File(currentDir, OUTPUT_FILE_NAME);
        writeToFile(outputFile, list);
    }
}
