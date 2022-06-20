package arrays.challange3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckSum {


    public static int[] findSum(int[] arr, int target)
    {
        int[] result = new int[2];
        // write your code here

        for (int i = 0; i < arr.length; i++) {
            int pivot = arr[i];
            for (int j = 0; j < arr.length; j++) {
                   if(arr[j] == (target - pivot)){
                       result[0] = pivot;
                       result[1] = arr[j];
                   }
            }
        }

        if(result[0] == 0 && result[1] == 0 ){
            return arr;
        }

        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void main(String[] args) {

       int[] arr = {9, 4, 7, 2, 6};

        int[] resultArray = findSum(arr, 17);

        System.out.println(resultArray[0]);
        System.out.println(resultArray[1]);

    }
}
