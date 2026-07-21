import java.util.ArrayList;

public class Arr14_1 {
    public static void main(String[] args){
        int[] arr=new int[]{7,5,-1,8,-2,-65,6,4,-2,41};
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        if(pos.size()>neg.size()){
            for(int i=0;i< neg.size();i++){
                arr[i*2]=pos.get(i);
                arr[i*2+1]= neg.get(i);
            }
            int index= neg.size()*2;
            for(int i= neg.size();i< pos.size();i++) {
                arr[i] = pos.get(i);
                index++;
            }
        }
        else{
            for(int i=0;i< pos.size();i++){
                arr[i*2]=neg.get(i);
                arr[i*2+1]= pos.get(i);
            }
            int index= pos.size()*2;
            for(int i= pos.size();i< neg.size();i++) {
                arr[i] = neg.get(i);
                index++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
