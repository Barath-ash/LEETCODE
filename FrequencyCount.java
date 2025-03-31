public class FrequencyCount {
    public static void main(String[] args) {
        int a[] = {50, 20, 150, 20, 50, 10, 30, 10, 10};
        int n = a.length;

        // Step 1: Sort the array manually (Using Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) { // Swap if the element is greater than the next element
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Step 2: Count frequency and print
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && a[i] == a[i + 1]) { // Count occurrences
                count++;
                i++;
            }
            System.out.println(a[i] + " -> " + count);
        }
    }
}
