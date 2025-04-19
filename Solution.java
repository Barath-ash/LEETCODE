import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
       
        System.out.println(Arrays.toString(nums));

    }

    static int[] rotator(int arr[], int start, int end) {
          while (start<end) {
            
          
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;

    }

}