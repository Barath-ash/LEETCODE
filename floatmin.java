public class floatmin {
    public static void main(String[] args) {
        int arr[] = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(arr));
    }
    static double minimumAverage(int[] nums) {
        int sum=0;
        int i=0,j=nums.length;
        int len = nums.length;
        float result = Float.MAX_VALUE;

        for(int k=0;k<nums.length;k++){
            sum+=nums[k];
        }

        while(i<j){
            float calc = (float)sum/len;
            if(result==0){
                result = sum;
            }
            else if(calc<result){
                result = calc;
            }
            sum -= nums[i]+nums[j-1];
            len -=2;
            i++;
            j--;
          
        
        }



     return result;

    }
}
