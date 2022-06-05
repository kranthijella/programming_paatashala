package arrays;

public class NumbersAtmos {
    public static void main(String args[]){
        int n = 4;
        String digits[] = new String[]{"3","4","5"};
        String number = String.valueOf(n);
        int count = number.length();
        int ans = 0;
        for(int i = 1;i<count;i++){
            ans = ans + (int) Math.pow(digits.length,i);
        }
        for(int i = 0;i<count;i++){
            boolean start = false;
            for(String e : digits){
                int b = Integer.parseInt(e);
                if( b < number.charAt(i) -'0'){
                    ans = ans + (int)Math.pow(digits.length,count-1-i);
                }
                else if(b == number.charAt(i)-'0'){
                    start = true;
                }
            }
            if(!start){
                System.out.println(ans);
            }
        }
        System.out.println(ans+1);
    }
}
