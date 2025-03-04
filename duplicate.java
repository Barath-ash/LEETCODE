import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[] n = {1,1,2};
        System.out.println(Arrays.toString(removeDuplicates(n)));
    }
    static int[] removeDuplicates(int[] nums) {
         int i=0;
         
         for (int j=1;j<nums.length;i++) {
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];

            }
            
         }
         return nums;




        
    }
}
