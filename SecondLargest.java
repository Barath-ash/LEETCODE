public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {8, 8, 7, 6, 5};
        int larg = arr[0];
        int scnLarg = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>larg){
                scnLarg = larg;
                larg = arr[i];
                
            }else if(arr[i]>scnLarg&&arr[i]!=larg){
                scnLarg = arr[i];
            }
        }
        System.out.println(larg);
        System.out.println(scnLarg);
    }
}
