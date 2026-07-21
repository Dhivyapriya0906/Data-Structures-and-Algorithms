import java.util.ArrayList;
//move zero to the end [Brute force]
public class Arr31 {
    public static void main(String[] args){
        int arr[]=new int[]{1,0,3,1,3,5};           //Time:O(2n)
        ArrayList<Integer> temp=new ArrayList<>();    //Space:O(n)
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]= temp.get(i);
        }
        for(int i=temp.size();i<n;i++){
            arr[i]=0;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
