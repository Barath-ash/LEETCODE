public class happy {
     public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
     }
        static boolean isHappy(int n) {
            int rem,sum=0;
            while(n!=1&&n!=4){
              while(n>0){
                  
                       rem = n%10;
                   sum+=(rem*rem);
                   
                   
   
                   n/=10;
                   
                      
                   
               }
                n = sum;
                       sum=0;
            }
              
               return n==1;
        }
    
}
