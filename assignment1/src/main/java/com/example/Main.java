package com.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        SimpleSort sort = new SimpleSort();

         ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(2);
        list.add(10);
        list.add(77);
        list.add(1);
        System.out.println("Unsorted List: " + list.toString());
        System.out.println("Selection sort: "+ sort.selectionSort(list));
        System.out.println("Insertion sort: "+sort.insertionSort(list));

       
    }
}