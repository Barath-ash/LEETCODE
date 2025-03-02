import java.lang.Math;





class primeNumber {
    public static void main(String[] args) {
        int num = 1500000;
        System.out.println(countPrimes(num));
    }
    static int countPrimes(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(isprime(i)){
             count++;
            }
        }
        return count;

    }
    static boolean isprime(int num){
       if(num==2){
        return true;
         
       }else if(num%2==0){
        return false;
       }
       if(num<2){
        return false;
       }
       
       for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0)
        return false;
       }

return true;
    }
    
}