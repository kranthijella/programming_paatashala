package basic;

import java.util.Scanner;

public class String_contains {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        if(a.length() != b.length()){
            System.out.println("No");
        }

        String c = a+a;
        if(c.contains(b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
