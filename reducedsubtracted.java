public class reducedsubtracted {
    public static void main(String[] args) {
        int num = 6928;
        String s = num+"";
        int sum=0;
        int a = s.charAt(0);
        for(int i=1;i<s.length();i++){
           int b =(int) s.charAt(i);
           System.out.println(b);
          int c = a-b;
          System.out.println(c);
          sum = sum*10+c;
          System.out.println(sum);
          a = b;
        }


        System.out.println(sum);
    }
}
