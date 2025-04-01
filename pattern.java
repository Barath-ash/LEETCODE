class pattern{
    public static void main(String[] args) {
        int d =5;
        int value;
        for(int i=1;i<=d;i++){
            if(i%2==0){
                value=0;
            }else{
                value =1;
            }
            for(int j=0;j<i;j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}