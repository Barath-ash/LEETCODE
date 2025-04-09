
class MaximumNumber {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 82, 27, 666, 12, 78, 13, 71, 86 };
        int len = 10;
        int max = arr[0];
        int index = 0;
        for (int i = 1; i <= len - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
    
        }}
        System.out.println(max);
        System.out.println(index);

    }
}