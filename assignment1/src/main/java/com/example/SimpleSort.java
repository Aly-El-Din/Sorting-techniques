package com.example;
import java.util.*;
public class SimpleSort {

    public ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        for (int j = 0; j < list.size() - 1; j++) {
            // setting the smallest as the first element in sublist
            int smallestIndex = j;
            for (int i = j + 1; i < list.size(); i++) {
                int currentIndex = i;
                if (list.get(smallestIndex) > list.get(currentIndex)) {
                    smallestIndex = currentIndex;
                }
            }
            // swaping in case current smaller than the smallest element
            if (smallestIndex != j) {
                int temp = list.get(j);
                list.set(j, list.get(smallestIndex));
                list.set(smallestIndex, temp);
            }
        }
        return list;
    }
    
    public ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
       for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (list.get(j) > temp) {
                    list.set(j+1, list.get(j));
                } else
                    break;
            }
            list.set(j + 1, temp);     
        }
        return list;
    }
}

