
class maximumsubaray{
    public static void main(String[] args) {
        int arr[]= {-3,4,-2,5,3,-2,8,2,1,4};
        int n = arr.length;
        int k = 5;
        int sum =0;
        int max =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max = sum;

        for(int i=1;i<=n-k;i++){
            sum+=arr[i+k-1];
            sum-=arr[i-1];
            if(sum>max){
                max = sum;
            }
               
        }
        System.out.println(max);
    }
}