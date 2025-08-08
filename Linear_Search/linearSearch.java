package Linear_Search;
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 2, 7, 8, 9};
        System.out.println(linearSearch1(num, 9));
    }

    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
//return index
        // for (int index = 0; index < arr.length; index++) { 
        
        //     if (arr[index] == target) {
        //         return index;
        //     }
        // }
// return no
        for(int element : arr){
            if (element==target){
                return element;
            }
        }

        return -1; // If target not found
    }
}
