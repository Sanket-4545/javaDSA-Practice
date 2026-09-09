public class findSum {
    public static int findsum(int arr[]) {
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,7,9,12,6,5};
        System.out.print(findsum(arr));
    }
}
