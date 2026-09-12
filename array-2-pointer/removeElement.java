public class removeElement {
    public static int removeElement(int arr[],int target){
        int slow= 0;
        int fast = 0;
        while (fast<arr.length) {
            if (arr[fast] != target) {    
                arr[slow] = arr[fast];
                slow++;
               
            }
            fast++;
        }
        return slow;    
        }
        
    
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,2};
       int newLength =  removeElement(arr, 2);
       for(int i = 0; i<newLength;i++){
        System.out.print(arr[i] + " ");
       }

    
    }
}
