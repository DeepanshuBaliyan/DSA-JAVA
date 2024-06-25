package Array;

public class DublicateNumber {
    public static int check(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count=arr[i];

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};

        int Result=check(arr);
        System.out.println(Result);

    }
}
