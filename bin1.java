import java.io.*;
import java.util.*;

public class bin1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        String a=in.nextLine();
        int count1=0, count2=0;
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)=='('){
                count1++;
            }
        }
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)==')'){
                count2++;
            }
        }

        if(count1==count2){
            System.out.println(count1);
        } else if(count1<count2){
            System.out.println(count1);
        } else {
            System.out.println(count2);
        }
        
        
    }
}