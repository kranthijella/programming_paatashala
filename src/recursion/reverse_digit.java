package recursion;

public class reverse_digit {

    public static void main(String args[]){
        String n = "123";
        int k = 3;
        StringBuilder p = new StringBuilder();
        for(int i = 0;i<k;i++){
            p.append(n);
        }
       Long num =  Long.parseLong(String.valueOf(p));
        System.out.println(reverese(num));
    }
    public static Long reverese(Long num){
        Long nums = num;
        Long sum = 0L;
        while ( nums != 0){
            int value = (int) (nums % 10);
            sum = sum + value;
            nums = nums/10;
        }
        if(sum/10 == 0){
            return sum;
        }
        return reverese(sum);
    }
}
