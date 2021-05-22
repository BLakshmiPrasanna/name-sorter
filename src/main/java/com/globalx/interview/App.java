package com.globalx.interview;

import java.util.List;


public class App 
{
    public static void main (String[] args)
    {
        InputService inputService = new InputService();
        List<String> inputList = inputService.readFileToList(args[0]);
    }
}
