public class count_valid_subString {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,2,4,2};
        int len = 8;
        int count =0;
        for(int i=0;i<len-2;i++){
               int ip1= arr[i];
               int ip2= arr[i+1];
               int ip3= arr[i+2];
               if(ip1+ip3==ip2){
                   count++;
               }
               
        }

        System.out.println(count);
    }
}
