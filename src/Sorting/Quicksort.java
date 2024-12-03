package Sorting;
import java.util.*;
public class Quicksort {

    public static void main(String []args){
        int[] arr = {2, 3, 4, 5, 8, 1, 6};
        int high = arr.length-1;
        int low =0;
        qSort(arr,low, high);
        System.out.println("Sorted array is "+Arrays.toString(arr));
    }

    private static void qSort(int[] arr, int low, int high) {
        if(low<high){
            int partitionIndex = Fun(arr,low,high);
            qSort(arr,low,partitionIndex-1);
            qSort(arr,partitionIndex+1,high);
        }
    }

    private static int Fun(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}

