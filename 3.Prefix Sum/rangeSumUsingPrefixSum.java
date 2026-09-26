
public class rangeSumUsingPrefixSum {
    public static int[] prefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int RangeSumUsingPrefixSum(int[] arr, int left, int right) {
    
    int prefix[] = prefixSum(arr);
    return prefix[right] - prefix[left - 1];
}
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 7, 4 };
        int sum[] = prefixSum(arr);

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] +" ");
        }
       
        int left = 1;   
        int right = 3;
        System.out.println();
        System.out.println("Range Sum from index " + left + " to " + right + ": " + RangeSumUsingPrefixSum(arr, left, right));  
    }

}