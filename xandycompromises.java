public class xandycompromises {
    public static void main(String[] args) {
        String s = "XYXXXYXXYY";
        s = s.toUpperCase();
        int count =0;
        char first = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(i==0){
               
                continue;
            }
            char sec = s.charAt(i);
            if(first==sec){
              count++;
            }

            first = sec;
        }
        System.out.println(count);
    }
}
