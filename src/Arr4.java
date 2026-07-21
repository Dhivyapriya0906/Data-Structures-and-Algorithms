import java.util.ArrayList;
//union of 2 sorted array
public class Arr4 {
    public static void main(String[] args){
        int arr1[]=new int[]{1,2,3,3,4,5,8};
        int arr2[]=new int[]{2,5,5,9};
        int i=0;int j=0;
        ArrayList<Integer> n=new ArrayList<>();
        int n1=arr1.length ,n2=arr2.length;
        while(i<n1 && j<n2){
            if(arr1[i]>arr2[j] ) {
                if (n.size() == 0 || n.get(n.size()-1)!=arr2[j] ){
                    n.add(arr2[j]);
                }
                j++;
            }
            else if(arr1[i]<arr2[j] ) {
                if (n.isEmpty() || n.get(n.size()-1)!=arr1[i] ){
                    n.add(arr1[i]);
                }
                i++;
            }
            else{
                if (n.size() == 0 || n.get(n.size()-1)!=arr1[i]){
                    n.add(arr1[i]);
                }
                i++;
                j++;
            }

        }
        while(j<n2){

                if (n.size() == 0 || n.get(n.size()-1)!=arr2[j] ){
                    n.add(arr2[j]);
                }
                j++;

        }
        while(i<n1){
                if (n.isEmpty() ||n.get(n.size()-1)!=arr1[i] ){
                    n.add(arr1[i]);
                }
                i++;

        }
        for(int i1:n){
            System.out.print(i1 +" ");
        }
    }
}
