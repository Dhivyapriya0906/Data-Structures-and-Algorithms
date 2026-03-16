public class Arr6 {
    //Find the missing number in the array which contains 1 to n elements
    public static void main(String[] args){
        int arr[]=new int[]{2,4,6,1,3};
        int n=arr.length+1;
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        int d=(n*(n+1)/2);

        int diff=(int)d-sum;
        System.out.println("Missing number is "+diff);
    }
}
