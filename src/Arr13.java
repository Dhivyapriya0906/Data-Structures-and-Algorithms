public class Arr13 {
    public static void main(String[] args){
     Solution1 s=new Solution1();
     int[] arr=new int[]{7,5,1};
        System.out.print("Profit: "+ s.maxProfit(arr));
    }
}
class Solution1 {
    public int maxProfit(int[] prices) {
      int profit=0;
      int n= prices.length;
      for(int i=n-1;i>=0;i--){
          int min=prices[i-1];
          for(int j=0;j<i;j++){
              min=Math.min(min,prices[j]);
              profit=prices[i]-min;
              System.out.println("MIN :"+min);
          }
      }

      System.out.println();
      return profit;
    }
}