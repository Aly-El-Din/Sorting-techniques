**LAB 1 – IMPLEMENTING SORTING TECHNIQUES** 

**Team Members  Date: 18/03/2024 ![](Aspose.Words.016111d7-26d6-4408-b277-3874381d54fd.001.png)**

- محمد شريف فتحى يوسف جليله   ID: 21011151 
- عبدالله عادل احمد محمد حسين   ID: 21010808 
- علي الدين محمد السيد أحمد   ID: 21010835 
- ابراهيم علاء الدين ابراهيم على حسن   ID: 21010017 
- امير رجائى سليمان عطا الله   ID: 21010300 
1. **Time and Space Analysis** 
1) **Simple Sort** 

For the simple sort, we implemented the Insertion Sort Algorithm, which iterates through an array from the second element to the last, comparing each element with the ones before it and inserting it into its correct position in the already sorted part of the array. 

**Time Complexity:** 

The best case scenario occurs when the array is already sorted, as each element only needs to be compared with its previous element once, resulting in O( ) comparisons and O(1) swaps. 

The worst case scenario occurs when the array is sorted in reverse order, as each element needs to be compared and possibly swapped with every element before it, resulting in O( 2) comparisons and swaps. 

**Space Complexity:** 

Insertion sort is an in-place sorting algorithm, meaning it sorts the array without requiring additional space proportional to the size of the input. Therefore, its space complexity is O(1), indicating that it uses constant extra space for temporary variables during the sorting process. 

2) **Efficient Sort** 

For the efficient sort, we implemented the Merge Sort Algorithm, which is a recursive sorting algorithm that follows the divide-and-conquer strategy to sort an array. 

**Time Complexity:** 

Merge sort has a time complexity of  ( log ) for all cases. This efficiency is achieved through its divide-and-conquer strategy, where the array is repeatedly divided into halves until each subarray contains only one element, resulting in a recurrence equation of  ( ) = 2 ( ⁄2) + ( ). 

**Space Complexity:** 

Merge sort has a space complexity of O( ) due to its need for additional memory to store temporary arrays during the merging process. 

During the merge step, temporary arrays are used to store the sorted elements before merging them back into the original array. The size of these temporary arrays is proportional to the size of the input array. 

3) **Non-Comparison Sort** 

For the non-comparison sort, we implemented the Counting Sort Algorithm, which operates by counting the occurrences of each unique element in the input array and using this information to determine the position of each element in the sorted output array. 

**Time Complexity:** 

Counting sort has a time complexity of O( + ), where n is the number of elements in the input array and k is the range of input values (the difference between the maximum and minimum values in the input array). 

Counting occurrences takes O( ) time, as it involves iterating through the input array once to count the occurrences of each element, while building the sorted array takes O( + ) time, as it involves iterating through the input array once to place each element in the correct position based on the counts. 

**Space Complexity:** 

Counting sort has a space complexity of O( + ), where n is the number of elements in the input array and k is the range of input values. 

The algorithm requires additional space for the count array, which has a size equal to the range of input values. Additionally, it requires space for the output array to store the sorted elements. 

Despite its linear time complexity, counting sort's space complexity can be a limiting factor, especially when dealing with large datasets or a wide range of input values. 

2. **Comparison** 

   To begin with, Insertion sort is best suited for situations where the dataset is small or nearly sorted, Merge sort is best suited for situations where stability, predictable performance, and efficient use of memory are important considerations, and Counting sort is best suited for specific scenarios where the range of input values is relatively small compared to the number of elements in the input array. 
