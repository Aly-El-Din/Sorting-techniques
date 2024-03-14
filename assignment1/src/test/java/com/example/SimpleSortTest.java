package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class SimpleSortTest {

    @Test
    public void testInsertionSort() {

        SimpleSort sorting = new SimpleSort();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> expected = new ArrayList<>(list);
        Collections.sort(expected);
        assertEquals(expected, sorting.insertionSort(list));

    }

}
