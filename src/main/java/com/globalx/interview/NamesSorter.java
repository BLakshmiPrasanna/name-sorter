package com.globalx.interview;


import java.util.Collections;
import java.util.List;


public class NamesSorter {

   public void sortWithLastName (List<String>  unsortedList){

       Collections.sort(unsortedList, new NameComparator());

   }



}
