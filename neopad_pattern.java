class neopad_pattern{
    public static void main(String[] args) {
        int n =11;
        for(int i =n;i>=0;i--){
            for(int j=0;j<=n;j++){
                if(j>=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i =1;i<n+1;i++){
            for(int j=0;j<=n;j++){
                if(j>=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}