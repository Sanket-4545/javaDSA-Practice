public class zeroMove {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,4,7,0,12};
        int left = 0; 
        int right = arr.length - 1;
        while (left<right) {
            if(arr[left] == 0 || arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp ;
            }
            left ++;
            right --;
            
        }
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
