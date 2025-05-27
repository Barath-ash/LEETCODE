public class fivecharacter_traingle {
    public static void main(String[] args) {
        String s = "abcbaacdbaca";
        int count =0;

        for(int i=0;i<s.length()-4;i++){
            if(isvalid(s.substring(i,i+5))){
               count++;
               i=i+4;
            }
        }
        System.out.println(count);
    }

    static boolean isvalid(String str){

      char a = str.charAt(0);
      char b = str.charAt(1);
      char c = str.charAt(2);
      char d = str.charAt(3);
      char e = str.charAt(4);
        if(a<b&&b<c&&c>d&&d>e){
          return true;
        }

        return false;

    }
}
