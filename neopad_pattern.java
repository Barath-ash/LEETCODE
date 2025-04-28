class neopad_pattern {
    public static void main(String[] args) {
        int n = 11;
        
        // Upper half
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n; j++) {
                if (j >= i) {
                    System.out.print(j);
                   
                } else {
                    System.out.print(" "); // empty space (three spaces)
                }
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= i) {
                    System.out.print(j);
                    if (j > 10) {
                        System.out.print(" ");
                    }  
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
