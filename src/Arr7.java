public class Arr7 {
    //Find the longest sub array with sum K [optimal]only for positive numbers
    public static void main(String[] args) {
                          //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11
        int[] arr = new int[]{10, 5, 2, 7, 1, 9};
        int k1 = 15;
        int n = arr.length;
        int len = 0, sum=0;
        int i=0,j=0;
        for( j=0;j<n;j++){
            sum+=arr[j];
            System.out.println("Sum "+sum);
            if(sum==k1){
                int len1=j-i+1;
                len=Math.max(len1,len);

            }

           while(sum>k1){
                sum-=arr[i];
                i++;
            }

            System.out.println("Length "+len);
            System.out.println("Sum after if "+sum);
        }
        System.out.println("Longest Sub array Length: "+len);
    }
}
