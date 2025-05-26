class validperumentation{
    public static void main(String[] args) {
        int[] n = {1,1,3,3,4,5};
        int len = 5; 
        int count =0;
        for(int i=0;i<len;i++){
            if(n[i]<i+1){
               count += (1+i-n[i]);
               n[i] = i+1;
            }
        }
        System.out.println(count);
    }
}