class carryforward{
    // AG FORMAT PRINTER
    public static void main(String[] args) {
        char arr[]= {'b','c','a','g','g','a','a','g'};
        int a_count=0;
        int sum=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                a_count++;
            }else if(arr[i]=='g'){
                sum+=a_count;
            }

        }
        System.out.println(sum);
    }
}