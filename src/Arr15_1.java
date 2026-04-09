import java.util.ArrayList;

public class Arr15_1 {
    public static void main(String[] args){
        int[] arr=new int[]{7,5,-1,8,-2,-65};
        ArrayList<Integer> a=new ArrayList<>();
        int max=arr[arr.length-1];
        for(int i= arr.length-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                a.add(arr[i]);

            }
        }
        System.out.println(a);
    }
}
