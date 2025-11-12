import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,4,2,6,10,4,7,6,8,1,13,4,6,1};
        System.out.print("Enter the number whose occurrence you want to find : ");
        int num = input.nextInt();
        boolean b = isPresent(arr,num);
        if (b){
            System.out.println("Your element is present in the array");
            int n = occurrenceFinder(arr,num);
            System.out.println("The number of times "+num+" occurred in your array is "+n);
        }else {
            System.out.println("Sorry, the number you are trying to find is not present in the array");
        }
    }
    public static boolean isPresent(int[] arr,int num){
        int i = 0;
        while(i< arr.length){
            if(arr[i] == num){
                return true;
            }
            i++;
        }
        return false;
    }
    public static int occurrenceFinder(int[] arr,int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if (arr[i] == num) {
                count++;
            }
            i++;
        }
        return count;
    }
}
