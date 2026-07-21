

public class Arr12_1 {

    //Kadane's Algorithm | Maximum Subarray Sum | Finding and Printing
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, 7};
        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j< arr.length;j++){
//                int sum=0;
//                for(int k=i;k<=j;k++){
//                    sum+=arr[k];
//
//                }
//
//                max=Math.max(sum,max);
//            }
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j< arr.length;j++) {


                sum += arr[j];

                max = Math.max(sum, max);
            }
        }
            System.out.println(max);
    }
}
