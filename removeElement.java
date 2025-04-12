import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        int i=0; 
        int res[] = {};

        for(int j=0;j<nums.length;j++){
             
                if(nums[j]!=val){
                   res[i++] = nums[j];
                }

            }
            System.out.println(Arrays.toString(res));
        }
    }

