package arrays;

public class prime {
    public static void main(String args[]){
        int ans = 0;
        for(int i = 2;i<=10;i++){
           int  count = 0;
            for(int j = 2;j*j <= i;j++){
                if( i% j == 0){
                    count = count + 1;
                }
            }
            if(count == 0){
                ans = ans + 1;
            }
        }
        System.out.println(ans);
    }
}
