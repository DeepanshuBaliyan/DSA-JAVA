package Array;

public class UniqueElement {

    public  static void Unique(int arr[], int low , int high){
        
        if (low > high){
        return;
        }
        if (low == high) {
        System.out.println(arr[low]);
        return;
    }
    int mid = (low + high) / 2;

    if (mid % 2 == 0) {
        if (arr[mid] == arr[mid + 1])
            Unique(arr, mid + 2, high);
        else
            Unique(arr, low, mid);
    }
    
    else if (mid % 2 == 1) {
        if (arr[mid] == arr[mid - 1])
            Unique(arr, mid + 1, high);
        else
            Unique(arr, low, mid - 1);
    }
        } 
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,8,8};
        // System.out.println(Unique(arr));
        Unique(arr, 0, arr.length-1);
    }

}
