import java.util.HashMap;
import java.util.Map;

public class Arr11_1 {
public static void main(String[] args){
    int[] arr=new int[]{2,2,1,1,1,2,2};
    int n=arr.length;
    HashMap<Integer,Integer> mpp=new HashMap<>();
    for(int i=0;i<n;i++){
        mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);

    }
    for(Map.Entry<Integer,Integer> e:mpp.entrySet()){
        if(e.getValue()>n/2){
            System.out.println("Majority element is "+e.getKey());
        }
    }

}
}
