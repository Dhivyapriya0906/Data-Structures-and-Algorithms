public class SW4 {
    public static void main(String[] args){
        int arr[]=new int[]{2,3,1,2,4,3};
        int t=7;
        int left=0;
        int cursum=0;
        int mini=Integer.MAX_VALUE;
        int wsize=0;
        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            wsize=i-left+1;
            while(cursum>=t){
                cursum-=arr[left];
                left++;
            }

            if(mini>wsize){
                mini=wsize;
            }
        }
        System.out.println("Minimum  size of Subarray sum: "+mini);
    }
}
