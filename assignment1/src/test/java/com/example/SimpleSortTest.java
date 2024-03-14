package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class SimpleSortTest {
 
    @Test
    public void RandomListsTest() {
        Random random = new Random();
        SimpleSort sorting = new SimpleSort();
        
            ArrayList<Integer> list = new ArrayList<>();
            int size = random.nextInt(100);
            
            for (int j = 0; j < size; j++) {
                list.add(random.nextInt(1000));
            }

            System.out.println(list);
            ArrayList<Integer> expected = new ArrayList<>(list); 
            Collections.sort(expected); 
            ArrayList<Integer> actual =sorting.insertionSort(list); 
            assertEquals(expected, actual); 
        
    }

}
