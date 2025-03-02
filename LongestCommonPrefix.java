import java.util.ArrayList;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        ArrayList result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                boolean status = strs[i].charAt(j)==strs[i+1].charAt(j);
                if(status){
                    result.add(strs[i].charAt(j));
                }
                
            }
            
        }
        return result.toString();
    }
}