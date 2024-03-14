/* package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class SimpleSortTest {
    ArrayList<Integer> randomList() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        // Consider reducing the size for this test due to the very strict time limit
        int size = random.nextInt(1000);

        for (int j = 0; j < size; j++) {
            list.add(random.nextInt(10000));
        }

        return list;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.MICROSECONDS)
    public void RandomListsTest() {

        SimpleSort sorting = new SimpleSort();
        ArrayList<Integer> list = randomList();
        System.out.println(list);
        ArrayList<Integer> expected = new ArrayList<>(list);
        Collections.sort(expected);
        ArrayList<Integer> actual = sorting.insertionSort(list);
        assertEquals(expected, actual);
    }

   
    @Test
    @Timeout(value = 2, unit = TimeUnit.MICROSECONDS)
    void timeLimitTest() {

        SimpleSort sorting = new SimpleSort();
        ArrayList<Integer> list = randomList();
        System.out.println(list);
        ArrayList<Integer> expected = new ArrayList<>(list);
        Collections.sort(expected);
        ArrayList<Integer> actual = sorting.insertionSort(list);
        assertEquals(expected, actual);
    }

    @Test
   //@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void bestcaseInsertion() {
        SimpleSort sorting = new SimpleSort();
        ArrayList<Integer> list = randomList();
        ArrayList<Integer> expected = (ArrayList<Integer>) list.clone();
        Collections.sort(expected);
        ArrayList<Integer> actual = sorting.insertionSort(list);
        assertEquals(expected, actual);
}

}
 */