public class PatternBased {
    public static void main(String[] args) {
        pattern4(5);
    }


    static void pattern4(int n){
        
        for(int i=5;i>=1;i--){

            
            for(int j=0;j<=n;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
    static void pattern3(int n){
        
        for(int i=0;i<2*n;i++){

            int col = i > n  ? 2*n-i:i ;
            for(int j=0;j<col;j++){
                System.out.print(" *");
            }
            if(i!=0)
            System.out.println();
        }
    }


        static void pattern2(int n){
           for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
           }
        }


    static void pattern1(int n){
        
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
