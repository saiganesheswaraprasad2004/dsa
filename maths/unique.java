package maths;

public class unique {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4,3,2};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
