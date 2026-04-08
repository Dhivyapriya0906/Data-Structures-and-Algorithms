public class Arr12 {
    public static void main(String[] args) {
        int[] arr = {-71 ,92, 0, 67, -8, 67, -78, -7};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int endst=-1;
        int end=-1;
        int st=0;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0) {
                  st = i;
            }
            sum += arr[i];
            if(max<sum){
                max=sum;
                endst=st;
                end=i;
            }
            else{
                max=0;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println("Start index: "+endst);
        System.out.println(" Max :" +max);
        System.out.println("End index: "+end);
        for(int i=endst;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
