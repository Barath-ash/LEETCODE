public class PrimeChar {
    public static void main(String[] args) {
        String s = "Fia88201Ot";
        int sum =0;
        for(int i=0;i<s.length();i++){
           int val = s.charAt(i);
           if(prime(val)){
            sum+= val;
           }
           else{
            continue;
           }
        }
        System.out.println(sum);
    }

    static boolean prime(int num){

       if(num<2){
        return false;
       }

       if(num==2){
        return true;
       }

       for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            return false;
        }
       }


        return true;
    }
}
