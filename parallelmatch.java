public class parallelmatch {
    public static void main(String[] args) {
        int ip1=6;
        int ip2=3;
        int arr[]= {1,4,6,1,4,6};
        
        
        int count =0;

        for(int i=0;i<arr.length;i++){
         int calc = (i+ip2)%ip1;
         if(calc<=arr.length-1&&   arr[calc]==arr[i]){
            count++;
        }
        }
        System.out.println(count);
    }
}
