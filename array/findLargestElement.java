public class findLargestElement {
    public static int findLargest(int arr[]) {
        int max=Integer.MIN_VALUE;
     for(int i = 0; i<arr.length; i++){
        if (arr[i]>max) {
            max = arr[i];
        }
     }
     return max;
    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 5, 1};
        System.out.println(findLargest(arr));
       
    }
}
