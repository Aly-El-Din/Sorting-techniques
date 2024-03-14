import java.util.ArrayList;
import java.util.Random;
public class Test {
    public static ArrayList<Integer> generateRandomIntegers(int size, int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            arrayList.add(randomNumber);
        }

        return arrayList;
    }
    public static void main(String[] args) {
        System.out.println(2);
        ArrayList<Integer> lis = generateRandomIntegers(7,0,100);

        EfficientSort e = new EfficientSort();
        ArrayList<Integer> sorted = e.MergeSort(lis,true);
        System.out.println(sorted);
        System.out.print("Is Sorted? "+e.sortedTest(sorted));


    }
}
