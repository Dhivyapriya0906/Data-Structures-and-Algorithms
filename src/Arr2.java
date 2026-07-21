import java.util.Scanner;
//rotate the element by k places
public class Arr2 {
    public static void main(String[] args){
        int arr[]=new int[]{-1,-100,3,99};

        Scanner scan = new Scanner(System.in);
        int d=scan.nextInt();
    int k=d%arr.length;
        Reverse(arr,0,k);
        Reverse(arr,k+1, arr.length-1);
        Reverse(arr,0, arr.length-1);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
    public static int[] Reverse(int arr[], int start, int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    return arr;
    }
}
