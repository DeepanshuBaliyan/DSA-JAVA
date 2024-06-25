package Array;

public class ReverseArray {
    public static void  check(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(arr[low]<arr[high]){
            int temp = arr[low];
             arr[low]=arr[high];
             arr[high]=temp;

             low++;
             high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        check(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
