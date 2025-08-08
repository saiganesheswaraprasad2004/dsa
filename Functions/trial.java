package Functions;

public class trial {
    public static void main(String[] args) {
        String i="Hello";

        // System.out.println(i.charAt(0));
        // System.out.println(i.length());
        String h="";
        for(int n=i.length()-1; n>=0 ;n--){
            h=h+i.charAt(n);
        }
        System.out.println(h);
    }
}
