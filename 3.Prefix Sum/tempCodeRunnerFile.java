
public class rangeSumUsingPrefixSum {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 7, 4 };
        int sum[] = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = arr[i - 1] + arr[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] +" ");
        }
        
    }

}