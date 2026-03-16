public class Main {
    public static void main(String[] args) {

        System.out.print("Index: " + lowerBoundIndex(new int[]{1, 3, 3, 5, 7}, 4));
    }

        public static int lowerBoundIndex ( int[] arr, int target){
            int r = arr.length;

            for (int i = 0; i < r; i++) {
                if (arr[i] >= target) {
                    return i;
                }
            }
            return r;


    }
}