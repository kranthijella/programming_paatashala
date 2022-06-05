package recursion;
import java.util.*;
public class sequential {
    public static void main(String args[]){
        Solutions k = new Solutions();
        k.sequentialDigits(100,300);
    }
}
class Solutions {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 1;i<=9;i++){
            sequential(low,high, 0,i,l);
        }
        Collections.sort(l);
        return l;

    }
    public void sequential(int low,int high,int num,int zero,List<Integer> l){

        if(num >= low && num <= high){
            l.add(num);
        }
        if( num > high || zero > 9){
            return;
        }
        sequential(low,high,num*10+zero,zero+1,l);
    }
}