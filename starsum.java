public class starsum {
    public static void main(String[] args) {
        int n = 112;
        int count=0;
        for(int M=1;M<=n;M++){
            if(starssum(M)>n){
               
                count++;
            }
        }
        System.out.println(count);
    }

    static int starssum(int num){
        int sum=0;
        String s = String.valueOf(num);
        for(int i=1;i<=s.length();i++){
            String prefix = s.substring(0,i);
            int value= Integer.parseInt(prefix);
            sum+=value;
        }
        return sum;
    }
}
