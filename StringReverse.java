import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String newstring="";
        for(int i=A.length()-1;i>=0;i--){
            char ch=A.charAt(i);
            newstring=newstring+ch;
        }
        System.out.println(newstring);
        if(A.equals(newstring)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
