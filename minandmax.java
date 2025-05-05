class minandmax{
    public static void main(String[] args) {
        int []nums = {2,4,25};
        System.out.println(findNonMinOrMax(nums));
    }


  
        static int findNonMinOrMax(int[] nums) {
            int max=nums[0],min=nums[0],mid=nums[0];

            if(nums.length<=2){
                return -1;
            }
            for(int i=0;i<nums.length;i++){
                int digit = nums[i];
               if(digit>max){
                max = digit;
               }
               else if (digit<min){
                min = digit;
               }
               else if(digit> min && digit<max){
                mid = digit;
               }
            }
           System.out.println(min);
           
           System.out.println(max);
           return mid; 
        
    }
}