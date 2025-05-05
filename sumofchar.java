class sumofchar{
    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(getLucky(s, k));
    }

    static int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             int val = c-'a'+1;
              str.append(val);
        }
        for(int i=0;i<k;i++){
            for(char c: str.toString().toCharArray()){
               sum+= c-'0';
            }
            str = new StringBuilder(String.valueOf(sum));
        }
         
             
    
        

        return sum;
    }
}