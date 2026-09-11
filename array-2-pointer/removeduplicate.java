public class removeduplicate {
    public static int removeDup(int arr[]){
        int slow = 0;
        int fast = 1;
        while (fast<arr.length) {
            if (arr[slow] != arr[fast]) {
                slow ++;
                arr[slow]=arr[fast];
            }
            fast ++;
        }

        return  slow+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,5};
        int newLength = removeDup(arr);
        for(int i = 0 ; i<newLength;i++){
            System.out.print(arr[i]);
        }
    }
}