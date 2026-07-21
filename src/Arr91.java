import java.util.HashMap;

public class Arr91 {
    //TWO SUM
    public static void main(String[] args){
        int[] arr=new int[]{ 2,6,5,8,11};
        int target=14;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int b=target-a;
            if(mpp.containsKey(b)){
                System.out.println(mpp.get(b) + " " + i);
            }
            mpp.put(arr[i],i);
        }
    }
}
