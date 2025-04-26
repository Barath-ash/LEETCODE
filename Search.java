class Search{
    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        int target = 0;
        int result =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result = i;
                break;
            } else{
                for(int j=0;j<nums.length;j++){
                    if(nums[j]>target){
                      result=j;
                      break;
                    }
                    
                }
            }
        }
       if(target==0){
        result = 0;
       }
       else if(result==0){
            result= nums.length;
        }
        System.out.println(result);
    }
}