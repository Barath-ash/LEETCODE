public class MixedAddition {
    public static void main(String[] args) {
        String s = "E1nig9&er2i505g6";
        String num = "0123456789";
        String result = "";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);

            
            if (num.contains(String.valueOf(val))) {
                result += val;
            } else {
                
                if (!result.equals("")) {
                    sum += Integer.parseInt(result);
                    result = "";  
                }
            }
        }

      
        if (!result.equals("")) {
            sum += Integer.parseInt(result);
        }

        System.out.println("Total Sum: " + sum);
    }
}
