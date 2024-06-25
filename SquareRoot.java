package Array;

public class SquareRoot {

   static double check(int n){
    int ans=1;
    int low=1;
    int high=n/2;
    while(low<=high){
        int mid=low+(high-low)/2;

        double square=(double)mid*mid;  

        if(square<=n){
            ans=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return ans;
    
   }
    public static void main(String[] args) {
        int n=10;

        System.out.println(check(n));


    }
}
