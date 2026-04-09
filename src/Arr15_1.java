import java.util.ArrayList;
import java.util.Collections;

public class Arr15_1 {
    public static void main(String[] args){
        int[] arr=new int[]{16, 17, 4, 3 ,5 ,2};
        ArrayList<Integer> a=new ArrayList<>();
        int max=arr[arr.length-1];
        a.add(max);
        for(int i= arr.length-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                a.add(arr[i]);

            }
        }
        Collections.reverse(a);
        System.out.println(a);
    }
}
