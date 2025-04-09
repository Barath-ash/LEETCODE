import java.util.Arrays;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int arr[] = { -1, -2, -4, -1, -2, 8q };
        int len = 6;
        int result = 0, lastdigit = 0;
        boolean found = false, ispositive = false;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] <= 0)
                continue;
            ispositive = true;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                    found = true;
                    break;
                }
            }
            if (found)
                break;
            if (lastdigit == 0)
                lastdigit = arr[i];
        }
        if (!ispositive) {
            result = 0;
        } else if (!found) {
            result = lastdigit;
        }
        System.out.print("Current Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("The value is : "+result);
    }
}
