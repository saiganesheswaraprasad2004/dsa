package Functions;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // int t=a;
        // a=b;
        // b=t;

        // a=a+b;
        // b=a-b;
        // a=a-b;

        int[] result = swap(10, 20);
        a = result[0];
        b = result[1];
        System.out.println(a);
        System.out.println(b);
    }

    static int[] swap (int a, int b){
        int temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }
}


// python
// a=10
// b=100

// def swap(a,b):
//     temp=a
//     a=b
//     b=temp
//     return (a,b)
    
// print(swap(a,b))

// # print(c ,d)