package assignment1.src.main.java.com.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        SimpleSort sort = new SimpleSort();
        EfficientSort sort2 = new EfficientSort();
        ArrayList<Integer> list = new ArrayList<>();

         
        list.add(8);
        list.add(2);
        list.add(10);
        list.add(77);
        list.add(1);
        System.out.println("Unsorted List: " + list.toString());
        System.out.println("Merge Sort: "+ sort2.MergeSort(list,true));
        System.out.println(sort2.snapShots.toString());
        System.out.println("Insertion sort: "+ sort.insertionSort(list,false));
    }
}