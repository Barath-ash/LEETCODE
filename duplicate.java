public class duplicate {
    public static void main(String[] args) {
        int[] n = {1,1,2};
        System.out.println(removeDuplicates(n));
    }
    static int removeDuplicates(int[] nums) {
         int i=0;
         
         for (int j : nums) {
            if(j!=nums[i]){
                i++;
                nums[i] = j;

            }
            
         }
         return i+1;




        
    }
}
