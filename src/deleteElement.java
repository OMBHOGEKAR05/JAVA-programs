import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

class deleteElement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,5,3,7,8,4};
        System.out.print("Enter the number you want to delete : ");
        int num = input.nextInt();
        int n = occurrence.occurrenceFinder(arr,num);
        int[] new_arr = new int[arr.length-n];
        int i  = 0,j = 0;
        while (i <= new_arr.length){
            if(arr[i] != num) {
                new_arr[j] = arr[i];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(new_arr));
    }
}