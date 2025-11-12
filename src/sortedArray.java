import java.util.Arrays;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.println(Arrays.toString(arr));
        boolean isSorted = isSorted(arr);
        if(isSorted){
            System.out.println("Your array is sorted");
        }
        else {
            System.out.println("Your array is not sorted");
        }
    }
    public static boolean isSorted(int[] arr){
        int i = 0;
        while(i < arr.length-1){
            if(arr[i] >= arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
