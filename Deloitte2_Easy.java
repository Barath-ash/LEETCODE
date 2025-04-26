public class Deloitte2_Easy {
    public static void main(String[] args) {
        int num[] = {10,45,6};
        int result =0;
        int length = num.length;
        if(length%2==0){
            result = -1;
        }else{
           result = num[length/2];
        }
        System.out.println(result);
    }
}
