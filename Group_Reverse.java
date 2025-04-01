import java.util.Arrays;
public class Group_Reverse
{   public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 }, d=2;
        int left,right,temp;
        left = 0;
        right = d;
        while(left<right){
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        left = d+1;
        right = a.length-1;
        while(left<right){
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
     System.out.println("Reverse order: "+d);
     System.out.println(Arrays.toString(a));
    }
}
