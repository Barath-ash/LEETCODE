public class WordDiff {
    public static void main(String[] args) {
        String s1 = "something";
        String s2 = "else";
        StringBuilder result = new StringBuilder();

        for(char c : s1.toCharArray()){
            if(!s2.contains(c+"")){
              result.append(c);
            }
        }
        for(char c : s2.toCharArray()){
            if(!s1.contains(c+"")){
              result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
