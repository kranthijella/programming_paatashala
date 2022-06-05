package basic;

public class Integer_overflows {
    public static void main(String args[]){
        int min = Integer.MIN_VALUE;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+Integer.MAX_VALUE);
        int  count  = 0;
        while (min != 0){
            count = count + 1;
            min = min + 1;
        }
        System.out.println(count+Integer.MAX_VALUE+1);
    }
}
