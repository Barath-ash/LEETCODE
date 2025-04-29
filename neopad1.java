import java.util.Arrays;

public class neopad1 {
    public static void main(String[] args) {
        String s = "Welcome1223tomy234country34";
        int max =0;
        s= s.toLowerCase();
        String[] arr = s.split("[a-z]+");
        for(int i=0;i<arr.length;i++){
             if(arr[i].length()!=0){
                int val = Integer.parseInt(arr[i]);
                if(max ==0){
                    max =  val;
                }
                else if(val>max){
                    max = val;
                }
                
             }
        }
        System.out.println(max);
    }
}
