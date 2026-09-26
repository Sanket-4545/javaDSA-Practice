

public class rangeSumUsingPrefixSum {

    // Method to create Prefix Sum array
    public static int[] prefixSum(int[] arr) {

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // Method to find range sum using Prefix Sum
    public static int rangeSumUsingPrefixSum(int[] arr, int left, int right) {

        int[] prefix = prefixSum(arr);

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 7, 4};

        // Create Prefix Sum
        int[] prefix = prefixSum(arr);

        System.out.print("Prefix Sum: ");

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        System.out.println();

        // Range 1 to 3
        int left = 1;
        int right = 3;

        int result = rangeSumUsingPrefixSum(arr, left, right);

        System.out.println(
            "Range Sum from index " + left + " to " + right + ": " + result
        );

        // Range 0 to 3
        left = 0;
        right = 3;

        result = rangeSumUsingPrefixSum(arr, left, right);

        System.out.println(
            "Range Sum from index " + left + " to " + right + ": " + result
        );
    }
}

