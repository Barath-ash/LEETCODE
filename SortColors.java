import java.util.Arrays;

class sortColors{
    public static void main(String[] args) {
        int[]  nums = {2,0,1};
        int c0=0,c1=0,c2=0;
        // sort the value based on the sorting order with duplicate
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c0++;

            }
            else if(nums[i]==2){
                c1++;
            }
            else{
                c2++;
            }
        }

        for(int i=0;i<c0;i++){
            nums[i] =0;
        }
        for(int i=0;i<c1;i++){
            nums[i+c0] =1;
        }
        for(int i=0;i<c2;i++){
            nums[i+c1+c0] =2;
        }
        System.out.println(Arrays.toString(nums));
    }
}