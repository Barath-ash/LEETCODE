import java.util.Arrays;

public class halfsum {
   public static void main(String[] args) {
    int []arr= {1,2,300,10,20,30};
    int sum1=0; 
    int sum2=0;
    
    
    for(int i=0;i<arr.length/2;i++){
        sum1+=arr[i];
    }
    for(int i=arr.length/2;i<arr.length;i++){
        sum2+=arr[i];
    }


    if(sum1<sum2){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    } 
    System.out.println(Arrays.toString(arr));
   }
}
