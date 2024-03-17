package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class EfficientSort {
    void printIntermediate(ArrayList<Integer> iteration) {
        System.out.print(Arrays.toString(iteration.toArray()));
    }

    boolean sortedTest(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) > arr.get(i)) {
                return false;
            }
        }
        return true;
    }

    ArrayList<Integer> MergeSort(ArrayList<Integer> array, boolean wantSteps) {
        int size = array.size();
        if (wantSteps) {
            System.out.print("Array: ");
            printIntermediate(array);
            System.out.println();
        }
        if (size < 2) {
            return array;
        }
        int mid = size / 2;
        ArrayList<Integer> left = new ArrayList<>(mid);
        ArrayList<Integer> right = new ArrayList<>(size - mid);
        // left initialization
        for (int i = 0; i < mid; i++) {
            left.add(array.get(i));
        }
        // right initialization
        for (int i = mid; i < size; i++) {
            right.add(array.get(i));
        }
        if (wantSteps) {
            System.out.print("Left: ");
            printIntermediate(left);
            System.out.print(" Right: ");
            printIntermediate(right);
            System.out.println();
        }
        left = MergeSort(left, wantSteps);
        right = MergeSort(right, wantSteps);

        return merge(left, right, wantSteps);

    }

    ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right, boolean wantSteps) {
        // Initial pointers of first and second subarrays
        int leftPointer = 0, rightPointer = 0;
        ArrayList<Integer> mergeIn = new ArrayList<>(left.size() + right.size());

        // Initial index of merged subarray array
        while (leftPointer < left.size() && rightPointer < right.size()) {
            if (left.get(leftPointer) <= right.get(rightPointer)) {
                mergeIn.add(left.get(leftPointer));
                leftPointer++;
            } else {
                mergeIn.add(right.get(rightPointer));
                rightPointer++;
            }
        }

        /* Copy remaining elements of left if any */
        while (leftPointer < left.size()) {
            mergeIn.add(left.get(leftPointer));
            leftPointer++;
        }

        /* Copy remaining elements of right if any */
        while (rightPointer < right.size()) {
            mergeIn.add(right.get(rightPointer));
            rightPointer++;
        }
        if (wantSteps) {
            System.out.print("Merged: ");
            printIntermediate(mergeIn);
            System.out.println();
        }
        return mergeIn;
    }

  

}