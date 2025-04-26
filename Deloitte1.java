import java.util.Scanner;
class Deloitte1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int temp = num,result=0;
        int[] freq = new int [10];
        while(num!=0){
            int rem = num%10;
            freq[rem]++;
            num/=10;}
        while (temp!=0) {
            int rem = temp%10;
            if(freq[rem]==1){
                result = rem;
                break;}
            temp /=10; }
        System.out.println( result);}}