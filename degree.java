class degree {
    public static void main(String[] args) {
        String  s = "abc";
        
        System.out.println(reverseDegree(s));
    }

    static int reverseDegree(String s) {
        int sum =0;
        int deg;
        for(int i=0;i<s.length();i++){
            deg= s.charAt(i)-96;
            sum+=(27-deg)*(i+1);
        }
        return sum;
    }
}