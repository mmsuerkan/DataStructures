package arrays;

import java.util.Arrays;

public class RemoveEvenIntegers {


    public static int[] removeEven(int[] arr){
        return Arrays.stream(arr).filter(i -> i % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        int[] result = removeEven(new int[]{1, 2, 4, 5, 10, 6, 3});

        Arrays.stream(result).forEach(System.out::println);

    }
}
