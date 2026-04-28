public class Barr2 {
    public static void main(String[] args){
        int arr[]= new int[]{-2,0,3,-5,2,-1};
        int ps[]=new int[arr.length];
        ps[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        int L=0 ,R=2;
        if(L==0){
            System.out.println(ps[R]);
        }
        else{
            int sum=ps[R]-ps[L-1];
            System.out.print(" Sum of the value index from "+L +" to "+R+" is "+sum);
        }
    }
}
