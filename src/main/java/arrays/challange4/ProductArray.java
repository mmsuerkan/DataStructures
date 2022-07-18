package arrays.challange4;

public class ProductArray {


    public static int[] findProduct(int[] arr){

        int [] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    continue;
                }
                product *= arr[j];
            }
            result[i] = product;
        }


        return result;
    }

    public static void main(String[] args) {

       int[] arr = {1,2,3,4};

        int[] resultArray = findProduct(arr);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }

    }
}
