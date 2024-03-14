package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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

    @Test
    public void testSelectionSort() {

        SimpleSort sorting = new SimpleSort();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> expected = new ArrayList<>(list);
        Collections.sort(expected);
        assertEquals(expected, sorting.insertionSort(list));
    }
    
    @Test
    public void testWithRandomArrayLists() {
        Random random = new Random();
        SimpleSort sorting = new SimpleSort();
        
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = random.nextInt(100);
            
            for (int j = 0; j < size; j++) {
                list.add(random.nextInt(1000));    
            }

            ArrayList<Integer> expected = new ArrayList<>(list); 
            Collections.sort(expected); 
           
            ArrayList<Integer> actual =sorting.insertionSort(list); 
            assertEquals(expected, actual); 
        }
    }

}
