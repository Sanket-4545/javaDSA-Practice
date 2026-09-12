public class closestSum {

    public static void closestSum(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        int closestSum = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                //Math.abs (math absolute) is used to get the absolute value of the difference between the current sum and the target, and the closest sum and the target. This ensures that we are always comparing positive values, regardless of whether the current sum is greater than or less than the target.
                closestSum = sum;
                first = arr[left];
                second = arr[right];
            }

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                break;
            }
        }

        System.out.print(first + " " + second);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 7, 10};

        closestSum(arr, 8);
    }
}