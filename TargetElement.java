package Array;

public class TargetElement {
    public static int check(int arr[] , int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        int target =3;
        int result=check(arr, target);
        System.out.println(result);
    }
}
