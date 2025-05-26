class Aasci_odd_sum{
    public static void main(String[] args) {
        String s = "JAMES";
        int sum=0;
        for(int i=0;i<s.length();i++){
            int index = i+1;
            int asci = (int) s.charAt(i);
            if(index%2==1|| asci%2==1){
                sum+=(asci*index);
            }
        }
        System.out.println(sum);
    }
}