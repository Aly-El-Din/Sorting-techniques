package com.example;

import java.util.LinkedList;

public class SimpleSort {

    public LinkedList<Integer> selectionSort(LinkedList<Integer> list) {

        for (int j = 0; j < list.size() - 1; j++) {
            // setting the smallest as the first element in sublist
            int smallest = list.get(j);
            for (int i = j + 1; i < list.size(); i++) {
                int current = list.get(i);
                
                if (smallest > current) {
                    smallest = current;
                    //swaping in case current smaller than the smallest element
                    int temp = current;
                    list.set(j, current);
                    list.set(i, temp);
                }
            }
        }
        return list;
    }

    public LinkedList<Integer> insertionSort(LinkedList<Integer> list) {
      
        
        for (int i = 1; i < list.size(); i++) {

            int temp = list.get(i);
            int j = 0;

            for (j = i - 1; j >= 0; j--) {
                if (list.get(j) > temp) {
                    list.set(j+1, list.get(j));
                } else
                    break;
            }
           list.set(j+1, temp);
        }
        return  list;

    }
}

