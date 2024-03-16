 package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class SortTest {
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
    //@Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    public void RandomListsTest() {

        SimpleSort sorting = new SimpleSort();
        ArrayList<Integer> list = randomList();
        System.out.println(list);
        ArrayList<Integer> expected = new ArrayList<>(list);
        Collections.sort(expected);
        ArrayList<Integer> actual = sorting.insertionSort(list).get(list.size() - 1);
        assertEquals(expected, actual);
    }

   
    @Test
   //@Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
    void timeLimitTest() {

        SimpleSort sorting = new SimpleSort();
        ArrayList<Integer> list = randomList();
        System.out.println(list);
        ArrayList<Integer> expected = new ArrayList<>(list);
        Collections.sort(expected);
        ArrayList<Integer> actual = sorting.insertionSort(list).get(list.size() - 1);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
   void bestcaseInsertion() {
       SimpleSort sorting = new SimpleSort();
       ArrayList<Integer> list = randomList();
       ArrayList<Integer> expected = sorting.copy(list);
       Collections.sort(expected);
       ArrayList<Integer> actual = sorting.insertionSort(list).get(list.size() - 1);
       assertEquals(expected, actual);
   }
    
  @Test 
  void CountingSortTest() {
      ReadTestCases cases = new ReadTestCases(
              "C:\\Users\\bo2dy\\OneDrive\\Documents\\GitHub\\Sorting-techniques\\test.txt");
      ArrayList<Integer> list = new ArrayList<>();
      try {
          list = cases.read().get(2);
      } catch (IOException e) {

          e.printStackTrace();
      }
      SimpleSort sorting = new SimpleSort();

      CountingSort countingSort = new CountingSort(list);
      ArrayList<Integer> expected = sorting.copy(list);

      int[] res = countingSort.returnFinalSorted();

      ArrayList<Integer> actual = new ArrayList<>();
      for (int i : res) {
          actual.add(i);
      }

      Collections.sort(expected);
      assertEquals(expected, actual);

  }

}
 