package maths;

public class setBits {
    public static void main(String[] args) {
        int n=2345678;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(set(n));
    }

    static int set(int n){
        int count=0;

        // while(n>0){
        //     count++;
        //     n-=(n&-n);
        // }

        while(n>0){
            count++;
            n=n&(n-1);
        }

        return count;
    }
}
