package Arrays;
import java.util.*;
public class arralterswap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        alt(arr);

    }
    static void alt(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                int temp= arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        System.err.println(Arrays.toString(arr));
    }
    
}
