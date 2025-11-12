import java.util.Arrays;

class reverseAnArray{
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] reversed_Array = reverse(arr);
        System.out.println(Arrays.toString(reversed_Array));
    }
    public static int[] reverse(int[] arr){
        int[] reversed_arr = new int[arr.length];
        int i = arr.length-1;
        int j = 0;
        while(i >= 0){
            while (j < reversed_arr.length){
                reversed_arr[j] = arr[i];
                j++;
                i--;
            }
        }
        return reversed_arr;
    }
}
