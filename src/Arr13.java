public class Arr13 {
    public static void main(String[] args){
        //Stock Buy and Sell

//     Solution1 s=new Solution1();
//     int[] arr=new int[]{7,5,1};
//        System.out.print("Profit: "+ s.maxProfit(arr));
//    }
//}
//class Solution1 {
//    public int maxProfit(int[] prices) {
//      int profit=0;
//      int n= prices.length;
//      for(int i=n-1;i>=0;i--){
//          int min=prices[i-1];
//          for(int j=0;j<i;j++){
//              min=Math.min(min,prices[j]);
//              profit=prices[i]-min;
//              System.out.println("MIN :"+min);
//          }
//      }
//
//      System.out.println();
//      return profit;      0,1,2,3,4,5,6
        int[] arr=new int[]{7,5,1,8,2,6,5};
        int mini=arr[0], profit=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-mini;
            profit=Math.max(cost,profit);
            mini=Math.min(arr[i],mini);
        }
        System.out.print("Profit: "+profit);

        /*
        * mini=7    profit=0
        * i=1   cost=-2     profit=0    mini=5
        * i=2   cost=-3     profit=0    mini=1
        * i=3   cost=7      profit=7    mini=1
        * i=4   cost=1      profit=7    mini=1
        * i=5   cost=5      profit=7    mini=1
        * i=6   cost=4      profit=7    mini=1
        * */
    }
}