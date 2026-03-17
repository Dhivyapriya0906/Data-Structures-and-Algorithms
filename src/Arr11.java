public class Arr11 {
    public static void main(String[] args){
        int[] arr=new int[]{2,2,1,1,1,2,2};
        int n=arr.length;
        int el=0 , c=0;
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                el=arr[i];
            }
            else if(el==arr[i]){
                c++;
            }
            else {
                c--;
            }
        }
        int c1=0;
        for(int i=0;i<n;i++){
            if(el==arr[i]){
                c1++;
            }
        }
        if(c1>n/2){
            System.out.println("Majority element is "+el);
        }
        //System.out.println("Majority element is "+-1);
    }

}
