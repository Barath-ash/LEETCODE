public class WordLength {
    public static void main(String[] args) {
        String input1 = "internationalization";
        int sum = input1.length()-2;
        if(sum<10){
            System.out.println(input1);
        }
        else{
            StringBuilder result = new StringBuilder();
            result.append(input1.charAt(0));
            result.append(sum);
            result.append(input1.charAt(input1.length()-1));
            System.out.println(result.toString());
        }
    }
}
