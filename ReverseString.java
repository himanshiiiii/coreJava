import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        int sindex=4;
        int lindex=9;
        String s;
        String rev;
        System.out.println("enter your string::");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        StringBuffer buffer=new StringBuffer();
        buffer.append(s);
        buffer.reverse();
        System.out.println("reversed string is:: "+buffer);

        System.out.print("remove indexes from reversed string::");
        buffer.replace(sindex,lindex,"");
        System.out.println(buffer);
    }
}
