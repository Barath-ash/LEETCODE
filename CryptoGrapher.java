public class CryptoGrapher {
    public static void main(String[] args) {
        String s = "bcd";
         StringBuilder output = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = (char)(s.charAt(i)-1);
             if(ch<'a'){
                ch+=26;
            }  
            output.append(ch);
        }
        s= output.toString();
        System.out.println(s);
    }
}
