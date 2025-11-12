import java.util.Arrays;

public class palindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] reversed_Array =  reverseAnArray.reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversed_Array));
        boolean isPalindrome = palindrome_checker02(arr,reversed_Array);//Using array's built-in function
        if(isPalindrome){
            System.out.println("Your array is palindrome");
        }else {
            System.out.println("Your array is not Palindrome");
        }
    }
    public static boolean palindrome_Checker(int[] arr, int[]reversed_Array){
        int i = 0;
        while (i< arr.length){
            if(arr[i] != reversed_Array[i]){
                    return false;
            }
            i++;
        }
        return true;
    }
    //OR
    public static boolean palindrome_checker02(int[] arr, int[]reversed_Array){
        return Arrays.equals(arr,reversed_Array);
    }
}
