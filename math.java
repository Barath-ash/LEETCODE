import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class math {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,8,9};
        int[] arr2 = {1,7,5,8,8};
         Set<Integer> unionvalue = new LinkedHashSet<>();
        for(int a:arr){
             
            unionvalue.add(a);    
        }
        for(int a:arr2){
             
            unionvalue.add(a);
            
        }   
        System.out.println("Union value : "+unionvalue);

        List<Integer> except = new ArrayList<>();
        for(int a:arr){   
                if (a%2==0) {
                    except.add(a);
                }  
        }
        for(int a:arr2){   
                if (a%2!=0) {
                    except.add(a);
                }  
        }
        System.out.println("Expect value : "+except);


        Set<Integer> id = new HashSet<>();
        for(int a:arr){
            id.add(a);
        }
        Set<Integer> intersect = new LinkedHashSet<>();
        for(int a:arr2){
            if(id.contains(a)){
                    intersect.add(a);
            }
        }

       
        
    
        System.out.println("Intersect value :"+intersect);
    }

     
}
