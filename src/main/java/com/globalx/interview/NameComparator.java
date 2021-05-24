package com.globalx.interview;

import java.util.Comparator;

public class NameComparator implements Comparator<String> {
    public int compare(String b1, String b2) {

        String[] name1 = b1.split(" ");
        String[] name2 = b2.split(" ");
        int length1 = name1.length - 1 ;
        int length2 = name2.length - 1;

        //compare last name
        int compareResult = name1[length1].compareTo(name2[length2]);
        if (compareResult != 0) {
            return compareResult;
        }
        //last names are same. Compare rest of the names.
        length1 = 0;
        length2 = 0;
        while (compareResult == 0 && length1 < name1.length && length2 < name2.length) {
            compareResult = name1[length1].compareTo(name2[length2]);
            length1++;
            length2++;
        }
        return compareResult;


    }
}
