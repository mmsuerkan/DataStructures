package arrays.challange2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {


    public static int[] mergeArrays(int[] arr1, int[] arr2){

        List<Integer> mergeList = new ArrayList<>();

        Arrays.stream(arr1).forEach(mergeList::add);
        Arrays.stream(arr2).forEach(mergeList::add);

        return mergeList.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] result = mergeArrays(new int[]{1, 3, 4, 5},new int[]{2, 6, 7, 8});

        Arrays.stream(result).forEach(System.out::println);

    }
}
