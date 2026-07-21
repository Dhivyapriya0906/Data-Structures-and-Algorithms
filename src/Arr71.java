public class Arr71 {
    //Find the longest sub array with sum K [Brute ]
    public static void main(String[] args){
        int[] arr=new int[]{1,2,4,3,1,1,1,1,2,1,3,4};
        int k1=4;
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];

                }
                if(sum==k1){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
}
//// GFG.java
//import java.util.*;
//
//class Solution {
//
//    public int longestSubarray(int[] nums, int k) {
//        int n = nums.length;
//        int maxLength = 0;
//
//        // starting index
//        for (int startIndex = 0; startIndex < n; startIndex++) {
//            // ending index
//            for (int endIndex = startIndex; endIndex < n; endIndex++) {
//
//                /* add all the elements of
//                   subarray = nums[startIndex...endIndex] */
//                int currentSum = 0;
//                for (int i = startIndex; i <= endIndex; i++) {
//                    currentSum += nums[i];
//                }
//
//                if (currentSum == k) {
//                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
//                }
//            }
//        }
//        return maxLength;
//    }
//}
//
//public class Arr71 {
//    public static void main(String[] args) {
//        int[] a = { -1, 1, 1 };
//        int k = 3;
//
//        // Create an instance of the Solution class
//        Solution solution = new Solution();
//
//        // Function call to get the result
//        int len = solution.longestSubarray(a, k);
//
//        System.out.println("The length of the longest subarray is: " + len);
//    }
//}
//
