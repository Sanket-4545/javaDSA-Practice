
public class pairSum {
    
public static void main(String[] args) {
    int arr[]= {1,2,3,4,7};
    int target = 6;
    int left = 0;
    int right = arr.length-1;
    boolean found = false;
 
    while (left<right) {
       int sum = (arr[left] + arr[right]);
        if(sum == target){  
            System.out.print(sum);
            break;
        }
        else if(sum < target){
            left++;
        }
           else if(sum > target){
            right --;
        }
    }
}
}
