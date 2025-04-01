class pattern2{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++){
                    if(i==0||i==n-1){
                        System.out.print("1");
                    }
                    else if(j==0){
                        System.out.print(i+1);
                     }
                    else if(j==4){
                        System.out.print("5");
                    }
                    else{
                        System.out.print(" ");
                    }
             }
            System.out.println();
            
        }
    }
}