import java.util.Arrays;
import java.util.Scanner;

public class ArraysAverage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            int i = 0;
            int sum = 0;
            while (i < arr.length){
                System.out.print("Enter the array's "+i+" element : ");
                int num = input.nextInt();
                arr[i] = num;
                sum += arr[i];
                i++;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Sum = "+sum);
            System.out.println("Average = "+sum/arr.length);
        }
    }

