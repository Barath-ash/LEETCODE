import java.util.Arrays;

public class ReversedLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 4; // index up to which first reversal happens

        // Reverse from index 0 to d
        for (int i = 0; i <= d / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[d - i];
            arr[d - i] = temp;
        }

        // Reverse from index d+1 to end
        int start = d + 1;
        int end = arr.length - 1;

        for (int i = 0; i < (end - start + 1) / 2; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
