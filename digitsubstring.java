public class digitsubstring {
    public static void main(String[] args) {
        String s = "123a45b67c";
         int i=0;
         int count =0;
         int n= s.length();
         while(i<n){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int start = i;

                while (Character.isDigit(s.charAt(i) )) {
                    i++;
                }
                int end = i-1;

                if(end<n-1 && start>=0 && Character.isLowerCase(s.charAt(start-1))&& Character.isLowerCase(s.charAt(end+1))){
                    count++;
                }


            }
            else{
                i++;
            }
         }
         System.out.println(count);
    }
}
