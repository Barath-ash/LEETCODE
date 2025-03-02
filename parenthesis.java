import java.util.Stack;

class parenthesis {

    public static void main(String[] args) {
        String s = "()";
        boolean status = false;
        
       Stack <Character> value = new Stack<>();
       for(char str: s.toCharArray()){
        if(str=='('||str=='['||str=='{'){
            value.push(str);
        }else{
            if(value.isEmpty()){
                return false;
            }
            char pop = value.pop();
           
            if (str==')'&&pop!='(' ||
            str=='}'&&pop!='{' ||
            str==']'&&pop!='[' ) {
                return false;
            
                
            
           }
        }
        
        return value.isEmpty();
         

          
       }
       System.out.println(status);
                
           
           
           
            }
           
    
}