package com.globalx.interview;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NameSorterTest {
    List<String> unSortedInputList1 = Arrays.asList(
            "Janet Parsons",
            "Vaughn Lewis",
            "Adonis Julius Archer",
            "Shelby Nathan Yoder",
            "Marin Alvarez",
            "London Lindsey",
            "Beau Tristan Bentley",
            "Leo Gardner",
            "Hunter Uriah Mathew Clarke",
            "Mikayla Lopez",
            "Frankie Conner Ritter");
    List<String> expectedSortedList1 = Arrays.asList(
            "Marin Alvarez",
            "Adonis Julius Archer",
            "Beau Tristan Bentley",
            "Hunter Uriah Mathew Clarke",
            "Leo Gardner",
            "Vaughn Lewis",
            "London Lindsey",
            "Mikayla Lopez",
            "Janet Parsons",
            "Frankie Conner Ritter",
            "Shelby Nathan Yoder");
    @Test
    public void sortWithLastNameTest(){
        NamesSorter sorter = new NamesSorter();
        sorter.sortWithLastName(unSortedInputList1);
        Assert.assertArrayEquals(expectedSortedList1.toArray(), unSortedInputList1.toArray());

    }

    List<String> unSortedInputList2 = Arrays.asList(
            "Janet",
            "Apple",
            "Frankie Conner Ritter",
            "Adonis Julius Archer",
            "Vaughn Lewis"
            );

    List<String> expectedSortedList2 = Arrays.asList(
            "Apple",
            "Adonis Julius Archer",
            "Janet",
            "Vaughn Lewis",
            "Frankie Conner Ritter"
            );
    @Test
    public void sortWithoutLastNameTest(){
        NamesSorter sorter = new NamesSorter();
        sorter.sortWithLastName(unSortedInputList2);
        Assert.assertArrayEquals(expectedSortedList2.toArray(), unSortedInputList2.toArray());

    }



    List<String> unSortedInputList3 = Arrays.asList(
            "Janet",
            "Banana Janet",
            "Apple Janet",
            "Vaughn Lewis",
            "Frankie Conner Archer",
            "Adonis Julius Archer"
            );

    List<String> expectedSortedList3 = Arrays.asList(

            "Adonis Julius Archer",
            "Frankie Conner Archer",
            "Apple Janet",
            "Banana Janet",
            "Janet",
            "Vaughn Lewis"
    );
    @Test
    public void sortWithSameLastNameTest(){
        NamesSorter sorter = new NamesSorter();
        sorter.sortWithLastName(unSortedInputList3);
        Assert.assertArrayEquals(expectedSortedList3.toArray(), unSortedInputList3.toArray());
    }

    List<String> unSortedInputList4= Arrays.asList(

            "Apple",
            "Vaughn Lewis",
            "adonis Julius Archer",
            "adonis Ionner Archer");

    List<String> expectedSortedList4= Arrays.asList(

            "Apple",
            "adonis Ionner Archer",
            "adonis Julius Archer",
            "Vaughn Lewis"
    );
    @Test
    public void sortWithSameLastNameAndFirstNameTest(){
        NamesSorter sorter = new NamesSorter();
        sorter.sortWithLastName(unSortedInputList4);
        Assert.assertArrayEquals(expectedSortedList4.toArray(), unSortedInputList4.toArray());

    }

    List<String> unSortedInputList5= Arrays.asList(
            "Apple",
            "Vaughn Lewis",
            "adonis Marry Julius Archer",
            "adonis Guava Julius Archer"
            );

    List<String> expectedSortedList5= Arrays.asList(
            "Apple",
            "adonis Guava Julius Archer",
            "adonis Marry Julius Archer",
            "Vaughn Lewis"
    );
    @Test
    public void sortWithSameLastNameAndLastGivenNameAndFirstNameTest(){
        NamesSorter sorter = new NamesSorter();
        sorter.sortWithLastName(unSortedInputList5);
        Assert.assertArrayEquals(expectedSortedList5.toArray(), unSortedInputList5.toArray());

    }
}
