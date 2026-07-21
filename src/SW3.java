public class SW3 {
    //Average of Subarray of Size K
    public static void main(String[] args){
        int arr[]=new int[]{2, 1, 5, 1, 3, 2};
        int k=3;
        int windowsum=0;

       double wavg=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        wavg=(double)windowsum/k;
        double max=wavg;
        int msum=windowsum;
        for(int i=k;i< arr.length;i++){
            windowsum=windowsum-arr[i-k]+arr[i];
            wavg=(double)windowsum/k;
            if(wavg>max){
                max=wavg;
            }
            if(msum<windowsum){
                msum=windowsum;
            }
        }
        System.out.println("Maximum sum of K subarray is :"+msum);
        System.out.println("Maximum avg of K subarray is "+max);
    }
}
