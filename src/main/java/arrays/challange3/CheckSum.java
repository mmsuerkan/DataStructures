package arrays.challange3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckSum {


    public static int[] findSumBetter(int[] arr, int n)
    {
        Arrays.sort(arr);

        int Pointer1 = 0;    //Pointer 1 -> At Start
        int Pointer2 = arr.length - 1;   //Pointer 2 -> At End

        int[] result = new int[2];
        int sum = 0;

        while (Pointer1 != Pointer2) {

            sum = arr[Pointer1] + arr[Pointer2];  //Calulate Sum of Pointer 1 and 2

            if (sum < n)
                Pointer1++;  //if sum is less than given value => Move Pointer 1 to Right
            else if (sum > n)
                Pointer2--;
            else {
                result[0] = arr[Pointer1];
                result[1] = arr[Pointer2];
                return result; // containing 2 number
            }
        }


        return arr;
    }

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

       int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};

        int[] resultArray = findSumBetter(arr, 27);

        System.out.println(resultArray[0]);
        System.out.println(resultArray[1]);

    }
}
