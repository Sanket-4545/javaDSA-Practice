public class maxMinDifference{
    public static void main(String[] args){
        int arr[] = {4,3,7,9,12,6,5};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
        }
        if (arr[i]<min) {
            min = arr[i];
        }
    }
    System.out.print("difference is :"+ (max - min));

} 
}
