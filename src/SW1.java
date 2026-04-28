//SLIDING_WINDOW
public class SW1 {
    public static void main(String[] args) {
                      //   0, 1, 2, 3, 4, 5
        int arr[]=new int[]{2, 1, 5, 1, 3, 2};
        int k=3;

        int ws=0;
        //FIND THE FIRST WINDOW
        for(int i=0;i<k;i++){
            ws+=arr[i];
        }
        int ms=ws;
        //SLIDE THE WINDOW
        for(int i=k;i< arr.length;i++){
            ws=ws-arr[i-k]+arr[i];
            ms=Math.max(ws,ms);
        }
System.out.println("Maximum Sum of subarray with k size :"+ms);
    }

}