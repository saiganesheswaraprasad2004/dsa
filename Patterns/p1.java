package Patterns;

public class p1 {
    public static void main(String[] args) {
        pat1(4);
    }

    static void pat1(int n)
{
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    
}}
