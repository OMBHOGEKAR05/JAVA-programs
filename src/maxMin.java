import java.util.Arrays;

class maxMin {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        if(arr.length == 0){
            System.out.println("Array length can't be zero while checking min and max!!!");
        }
        else{
            int max = maxInArr(arr);
            int min = minInArr(arr);
            System.out.println("Your arr is : " + Arrays.toString(arr));
            System.out.println("Maximum number from your array is : " + max);
            System.out.println("Minimum number from your array is : " + min);}
    }
    public static int maxInArr(int[] arr){
        int max = arr[0];
        int i = 1;
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static int minInArr(int[] arr){
        int min = arr[0];
        int i = 1;
        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
