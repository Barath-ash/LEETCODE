public class xor {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 6, 7, 8 };
        System.out.println(subsetXORSum(nums));
    }

    static int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        if (nums.length > 2) {
            int curr = 0;
            for (int n : nums) {

                if (curr == 0) {
                    curr = n;
                } else {
                    curr ^= n;
                }

            }
            sum += curr;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int val = nums[i] ^ nums[j];
                sum += val;
            }
        }
        return sum;
    }
}
