import java.util.HashSet;
//union of 2 sorted array
public class Arr41 {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,3,4,5,5};
        int arr2[]=new int[]{2,3,5,8};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i< arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i< arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int i:set){
            System.out.print(i +" ");
        }
    }
}
