public class RepeatRear {
    public static void main(String[] args) {
        int[] input1 = { 1, 2, 8, 2, 4, 8, 1, 2, 8 };
        int input2 = input1.length;
        int result = 0, currentcount = 0;
        for (int i = input2 - 1; i > 0; i--) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (input1[i] == input1[j]) 
                    count++; }
             if (count > currentcount) {
                result = input1[i];
                currentcount = count;  }  }
              System.out.println(result);
    }}
