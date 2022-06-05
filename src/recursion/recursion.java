package recursion;

public class recursion {
    public static void main(String args[]){
        recursionfun(0);
    }
    public static void recursionfun(int n){
            if(n == 5){
                return ;
            }
            recursionfun(n+1);
    }
}
