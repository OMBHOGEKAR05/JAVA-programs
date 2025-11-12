import java.util.Arrays;
import java.util.Scanner;

class ArrayUtility {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inputArray()));
    }
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
