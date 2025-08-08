package Functions;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String name=in.next();
        System.out.println(name);
        System.out.println(sum2(5,6));
        System.out.println(myGreet("Meow"));

    }

    static String myGreet(String name){
        String msg="Hello "+name;
        return msg;
    }

    static int sum2(int a, int b){
        int summ=a+b;
        return summ;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1=in.nextInt();
        System.out.print("Enter n2: ");
        int n2=in.nextInt();
        int sum = n1+n2;
        System.out.println("The sum = "+sum);
    }
}