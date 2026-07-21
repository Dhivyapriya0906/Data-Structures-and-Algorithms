public class Arr10_1 {
    public static void main(String[] args){
        //Sorting an array f elements 0's,1's and 2's  -Better
        int arr[]=new int[]{0,1,2,0,1,2,1,2,0,0,0,1};
        int c1=0,c0=0,c2=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(c0==arr[i]){
                c0++;

            }
           else if(c1==arr[i]){
                c1++;

            }
            else{
                c2++;

            }

        }
        for(int i=0;i< arr.length;i++){
            if(i<c0){
                arr[i]=0;
            }
            else if(i>=n-c2){
                arr[i]=2;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println(c0+" "+c1+" "+c2);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
