public class primesum {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (!isprime(i))
                sum += num[i];
        } System.out.println(sum); }
        
    static boolean isprime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
                return false;
        }return true;}}
