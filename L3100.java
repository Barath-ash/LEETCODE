class L3100{
    public static void main(String[] args) {
       String s = "hello";
       int sum =0;
       int prev=0;
       for(int i=0;i<s.length();i++){
          int curr= s.charAt(i);
           if(prev!=0) {
            int val =  (curr-prev);
            
           prev = curr;
            if(val<0){
           val *= -1;
             sum+=val;
          }
          else {
             sum+=val;
          }
          }else{
            prev = curr;
            continue;
          }
         
        
       }
       System.out.println(sum);
    }
}