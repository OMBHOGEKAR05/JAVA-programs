import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        // Taking two arrays as input from user
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        // Checking whether the arrays taken from user are sorted or not
        if(sortedArray.isSorted(arr1) && sortedArray.isSorted(arr2)) {
            // Defining new array with length = arr1.length + arr2.length
            int size = arr1.length + arr2.length;
            int[] arr3 = new int[size];

            //Loops
            int k = 0, i = 0, j = 0;
            //Keep iterating till either i or j's length is not finished
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    arr3[k++] = arr1[i++];
                } else {
                    arr3[k++] = arr2[j++];
                }
            }

            //As soon as any one of the array is finished then rest of the elements of the left-over array
            // gets shifted to new array
            while (i < arr1.length) {
                arr3[k++] = arr1[i++];
            }
            while (j < arr2.length) {
                arr3[k++] = arr2[j++];
            }
            System.out.println(Arrays.toString(arr3));
        }
        else {
            System.out.println("Please enter pre sorted arrays");
        }
    }
}
