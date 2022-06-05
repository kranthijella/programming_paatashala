package basic;

import java.util.Scanner;

public class isprime {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int b = s.nextInt();
        int count = 0;
        for(int i = 2 ;i<=b/2;i++){
            if((b%i) == 0){
                count = 1;
                break;
            }
        }
        if(count == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
