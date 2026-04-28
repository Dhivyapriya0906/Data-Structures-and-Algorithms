//variable WINDOW
public class SW2 {
    public static void main(String[] args){
        int[] arr = {3, 1, 2, 1, 1, 4};
        int k = 5;
        System.out.println("Longest Subarray Length = " + longestSubarray(arr, k));
    }
    public static int longestSubarray(int[] arr,int k){
        int left=0;
        int maxLen=0;
        int windowSize =0;
        int curSum=0;
        for(int right =0;right<arr.length;right++){
            curSum+=arr[right];
            if(curSum>k){
                curSum-=arr[left];
                left++;
            }
            windowSize =right-left+1;
            maxLen=Math.max(windowSize,maxLen);
        }
        return maxLen;
    }
}
