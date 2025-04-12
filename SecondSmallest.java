public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = { 8, 8, 7, 6, 5 };
        int sm = arr[0];
        int Ssm = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<sm){
                Ssm = sm;
                sm = arr[i];
            }
            else if(arr[i]!=sm&&arr[i]<Ssm){
                Ssm = arr[i];
            }
        }
        System.out.println(sm);
        System.out.println(Ssm);
    }
}
