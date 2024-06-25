package Array;

public class SortColor {
    public static void check(int arr[]){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low, mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                    swap(arr,mid, high);
                    high--;
            }
        }
    }

    private static void swap(int arr[] , int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,0,1,0,2};
        check(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
