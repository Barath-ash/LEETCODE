public class forwardletter {
    public static void main(String[] args) {
        String arr = "Hi Hell";
        StringBuilder result = new StringBuilder();
        String[] str = arr.split("\\s+");
        for(int i=0;i<str.length;i++){
            String sb = str[i];
            int len = sb.length();
            for(int j=0;j<sb.length();j++){
                char ch = (char)(sb.charAt(j)+len);
                result.append(ch);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}
