class maxcount{
    public static void main(String[] args) {
        String [] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }
    static int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i=0;i<sentences.length;i++){
            String[] count = sentences[i].split("\\s+");
            int c = count.length;
            
            if(c>max){
                max = c;
            }
        }
        return max;
    }
}