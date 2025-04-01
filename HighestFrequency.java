public class HighestFrequency {
    public static void main(String[] args) {
        int arr[]={30,100,20,110,200,40,50};
        int len = arr.length;
        int maxfreq=0,maxvalue=-1;
        boolean status = false;
        for(int i=0;i<len;i++){
            int count =0;
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]){
                    count++;
                }}
            if(count>maxfreq){
                maxfreq = count;
                maxvalue = arr[i];
                status = true;
            }else if(count==maxfreq&&arr[i]!=maxvalue){
                    status = false;
            }}
        if(status){
            System.out.println("THe highest Frequency Number is "+maxvalue);
        }else{
            System.out.println("-1");
        }
         
    } 
}
