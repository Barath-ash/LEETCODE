public class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1,2,9,-7,9,7};

        int max =Integer.MIN_VALUE;
        
        int sum=0;
        int st=0,end=0;

        for(int i=0;i<arr.length;i++){
              
            if(sum==0){
                st = i;
            }
            
            
            sum+=arr[i];


            if(sum>max){
                max = sum;
                end = i;
            }


            if(sum<1){
                sum =0;
            }
        
        }
        System.out.println("The start is "+st);
        System.out.println("The end is "+end);
        System.out.println(max);



    }
}
