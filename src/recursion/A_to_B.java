package recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A_to_B {
   static ArrayList<Stack<Integer>> l = new ArrayList<>();
   static Stack<Integer> values = new Stack<>();
     static int c = 0;
     static int e = 0;
     static int b = 162;
    public static void main(String args[]){
        transform(2,b,1);
        values.add(2);
        if( c == b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        for(Stack<Integer> u : l){
            for(int n : u){
                System.out.println(n);
            }
        }
        System.out.println(e);
    }
    public static  void  transform(int a , int b,int d){
        if(a == b){
           c = a;
           e = d;
           values.add(b);
           Stack<Integer> h = new Stack<>();
            h.addAll(values);
            l.add(h);
            values.clear();
            //System.out.println("Yes");
            return;
        }
        if( a > b){
            //values.pop();
            return;
        }
        values.add(a);
        transform(2 * a,b,d + 1);
        values.pop();
        values.add(10 * a+1);
        transform(10 * a + 1, b,d+1);
        values.pop();
        //values.add(a);
    }
}
