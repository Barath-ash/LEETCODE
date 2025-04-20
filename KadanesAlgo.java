public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {1,2,-9,-7,9,7};

    int max =arr[0];
    int curr = arr[0];
    
      
    for(int i=1;i<arr.length;i++){
        curr = Math.max(arr[i], curr+arr[i]);
        max = Math.max(max, curr);
    }
    System.out.println(max);
    }
}
