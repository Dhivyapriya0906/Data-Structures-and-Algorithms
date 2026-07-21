public class Arr61 {
    //Find the number that appears once, and other numbers twice.
    public static void main(String[] args){
        int arr[]=new int[]{4,1,2,1,2,4,9};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        System.out.println(ans+" Number is appeard once");
    }
}
