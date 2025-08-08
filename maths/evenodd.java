package maths;

public class evenodd {
    public static void main(String[] args) {
        int a=15;
        System.out.println(isOdd(a));
    }

    static boolean isOdd(int a){
        return (a&1)==1;
    }
}
