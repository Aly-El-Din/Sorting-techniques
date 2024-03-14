import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<Integer>ls=new ArrayList<>(Arrays.asList(2,5,3,0,2,3,0,3));
        CountingSort sortTech=new CountingSort(ls);
        System.out.print("Do you want to return\n1.final sorted array\n2.Intermediate arrays\nchoice(1 or 2):");
        int flag=cin.nextInt();

        ArrayList<int []>intermediateArrays=new ArrayList<>();

        int []res;

        if(flag==1){
            res=sortTech.returnFinalSorted();

            for(int i=0;i<res.length;i++){
                System.out.print(res[i]+" ");
            }
        }
        else{
            intermediateArrays=sortTech.returnIntermediateArrays();
            for(int []a:intermediateArrays){
                for(int e:a){
                    System.out.print(e+" ");
                }
                System.out.println();
            }
        }



    }
}