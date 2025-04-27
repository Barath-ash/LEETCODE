import java.util.Arrays;

public class L1929 {
    public static void main(String[] args) {
                int nums[] = {1,2,1};

                int len = nums.length;
                int ans[] = new int [len*2];
                 
                for(int i=0;i<len;i++){
                    ans[i] = nums[i];
                    ans[len+i] = nums[i];
                     
                }
               System.out.println(Arrays.toString(ans));
            
        
    }
}
