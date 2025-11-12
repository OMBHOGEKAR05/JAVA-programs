public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {1,9,7,5,3,10};
        int max = arr[0];
        int i = 0;
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        System.out.println(max);
    }
}
