import java.util.ArrayList;
import java.util.Arrays;

public class EfficientSort {
    void printIntermediate(ArrayList<Integer> iteration) {
        System.out.println(Arrays.toString(iteration.toArray()));
    }

    public ArrayList<Integer> MergeSort(ArrayList<Integer> array, boolean wantSteps){
        if(wantSteps) {
            printIntermediate(array);
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(2);
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        lis.add(5);
        lis.add(2);
        EfficientSort e = new EfficientSort();
        System.out.print(e.MergeSort(lis,false));


    }
}
