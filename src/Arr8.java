    import java.util.*;

    // core logic holder
    class Solution {
        // compute length of the longest subarray with sum 0
        public int maxLen(int[] arr, int k) {
                HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0, -1);
                int n=arr.length;
                int maxi=0,sum=0;
                for(int i=0;i<n;i++){
                    sum+=arr[i];
//                    if(sum==k){
//                        maxi=i+1;
//                    }

                        if (map.containsKey(sum-k)) {

                            maxi = Math.max(maxi, i - map.get(sum-k));
                        }
                         if(!map.containsKey(sum)){
                            map.put(sum,i);
                        }

                }



            return maxi;
        }
    }


    // separate main class
    public class Arr8 {
        // program entry
        public static void main(String[] args) {
            // sample input
            int[] arr = new int[]{9, -3, 3, -1, 6, -5};
            // compute size
            int k = 0;
            // compute result
            int ans = new Solution().maxLen(arr, k);
            // print result
            System.out.println(ans);
        }
    }


