package Array;

public class FirstAndLastOccurance {
    public static int firstOccurance(int arr[] , int target){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }

    public static int lastOccurance(int arr[] , int target){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

    public static int[] print(int arr[] , int target){
        int first=firstOccurance(arr, target);
        int last=lastOccurance(arr, target);
        return new int[]{first,last};
    }
    public static void main(String[] args) {
         int arr[] = {5,7,7,8,8,10};
         int target =8;

         int [] result=print(arr, target);
         System.out.println(result[0]);
         System.out.println(result[1]);
    }

}
