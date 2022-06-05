package arrays;

public class commondivisors {
    public static void main(String args[]){
        int a = 747794 , b = 238336;
        int count = 0;
        for(int i = 1;i<=Math.min(a,b);i++){
            if(a % i == 0  && b % i ==0 ){
                count = count +1;
            }
        }
        System.out.println(count);
    }
}
