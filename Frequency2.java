import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Frequency2 {
     public static void main(String[] args) {
        int arr[]={40,20,10,50,20,10,30,40};
         Set<Integer> seen = new HashSet<>();
         Map<Integer,Integer> AscenOrder = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count =0;
            if(seen.contains(arr[i])) continue;
            else
                for(int j=i;j<arr.length;j++)
                    if(arr[i]==arr[j]) count++;
                seen.add(arr[i]);
                AscenOrder.put(count, arr[i]); 
        }
        System.out.println(AscenOrder.get(AscenOrder));
}

}
