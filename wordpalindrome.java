public class wordpalindrome {
    public static void main(String[] args) {
        String s = "In India Malayalam is best with dad and mom";
        
        String[] words = s.split("\\s+");
        StringBuilder str  = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(palindrome(words[i].toLowerCase())){
               continue; 

            }
            else{
                str.append(words[i]);
            }
            if(i!=words.length-1){
                str.append(" ");
            }
        }
        System.out.println(str.toString());
    }


    static boolean palindrome(String s){
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
            
           }
        }
        return true;
    }
}
