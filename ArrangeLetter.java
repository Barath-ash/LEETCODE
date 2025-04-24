public class ArrangeLetter {
    public static void main(String[] args) {
        String arr = "are you ready to join with hakunamatata";
        String [] sb = arr.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<sb.length;i++){
         String value = sb[i];
         int[] freq = new int[26];

         for(int j=0;j<value.length();j++){
            char c = value.charAt(j);
            freq[c-'a']++;
            
         }

         for(int k=0;k<26;k++){
            while (freq[k]-->0) {
                result.append((char)(k+'a'));
            }
         }
         if(i!=sb.length-1){
            result.append(" ");
         }
        

        }
        System.out.println(result.toString());
    }
}
