public class findMaxDiff {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1,10,3,5};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length-2;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[j] - arr[i] > max){
                    max = arr[j] - arr[i];
                }
            }
        }
         System.out.println(max);
    }
}
