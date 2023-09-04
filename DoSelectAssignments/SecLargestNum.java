package DoSelectAssignments;

import java.util.*;

public class SecLargestNum {

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void main(String[] args) {
        // int[] arr = {6,3,9,5,2,8};
    	int secLargestNum = 0;
        Random rand = new Random();
        int[] arr = new int[30];
        int n = arr.length;
        for (int i = 0; i < 20; i++) {
            arr[i] = rand.nextInt(50);
        }
        quickSort(arr, 0, n - 1);
        for (int i = n-1; i>=0 ; i--) {
            System.out.println(arr[i]);
            
        }
        for (int i = n-1; i>=0 ; i--) {
            if(arr[i] != arr[i-1]) {
            	secLargestNum = arr[i-1];
            	break;
            }
        }
        System.out.println("Secornd Largest Num is: "+ secLargestNum);
    }

}
