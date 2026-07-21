import java.util.Arrays;


public class Arr9 {
    //TWO SUM-OPTIMAL  but it used only check the sum of two sum is equal to target,here we don't return index
    public static void main(String[] args){
        int[] arr=new int[]{ 2,6,5,9,11};
        int target=14;
        int i=0,j= arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>target){
                j--;

            }
            else if (sum==target){
                System.out.println(i+" "+j);
                break;
            }
            else{
                i++;
            }
        }
    }
}




