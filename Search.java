import java.util.Arrays;

class Search{
    public static void main(String[] args) {
    //     int []nums = {1001};
    //     int target = 5;
    //     int result =0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==target){
    //             result = i;
    //             break;
    //         } else{
    //             for(int j=0;j<nums.length;j++){
    //                 if(nums[j]>target){
    //                   result=j;
    //                   break;
    //                 }
                    
    //             }
    //         }
    //     }
    //    if(target==0){
    //     result = 0;
    //    }
    //    else if(nums[0]>target){
    //     result =0
    //    }else if(result==0){
    //         result= nums.length;
    //     }
    //     System.out.println(result);
    int nums[]={1001};
    int target=5;
    int i=0,j=nums.length-1;
    int res=binaryser(nums,i,j,target);
    if(res==-1){
        int newarr[]=new int[nums.length+1];
        int ind=0;
        for(int s:nums){
           newarr[ind++]=s;

        }
        newarr[newarr.length-1]=target;
        Arrays.sort(newarr);
        
    }
    System.out.println(res);
    }
    public static int binaryser(int nums[],int a,int b,int target){
    int mid=(a+b)/2;
    if(nums[mid]==target){
        return mid;
    }  
    else if(nums[mid]<target){
        binaryser(nums, a, mid-1, target);
    }
    else if(nums[mid]>target){
        binaryser(nums, mid+1, b, target);
    }
    return -1;
    }
}