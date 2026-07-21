public class Arr14 {
public static void main(String[] args){
    //positive == negative
    int[] arr=new int[]{7,5,-1,8,-2,-65};
    int neg=1 , pos=0;
    int[] ans=new int[arr.length];
    for(int i=0;i< arr.length;i++){
        if(arr[i]<0){
            ans[neg]=arr[i];
            neg+=2;
        }
        else{
            ans[pos]=arr[i];
            pos+=2;
        }
    }
    for(int x: ans){
        System.out.print(x+" ");
    }
}
}
