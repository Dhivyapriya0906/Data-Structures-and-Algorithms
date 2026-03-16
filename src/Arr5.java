import java.util.ArrayList;

public class Arr5 {
    //Intersection of 2 arrays
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,3,4,5,8};
        int arr2[]=new int[]{2,3,3,9};
        int a[]=new int[arr2.length];

        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(a[j]==0 && arr1[i]==arr2[j]){
                    arr.add(arr1[i]);
                    a[j]=1;
                    break;
                }
            }
        }
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
