package recursion;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public static void main(String args[]) {
        int n  = 3;
        ArrayList<String> arraylist = new ArrayList<String>();
        String temp = "";
        int l_count = 0;
        int r_count = 0;
        int index = 0;
        generateParenthesis(arraylist,temp,l_count,r_count,0, n);
        for(String kranthi: arraylist){
            System.out.println(kranthi);
        }
    }

    public static void generateParenthesis(ArrayList<String> arraylist , String temp, int left , int right , int index,int n ){
        if(temp.length() == 2 * n){
            arraylist.add(temp);
            return;
        }
        if(left == right){
            temp = temp + "(";
            generateParenthesis(arraylist,temp,left+1,right,index,n);
        }else if( left > right){
            if(left == n){
                temp = temp + ")";
                generateParenthesis(arraylist,temp,left,right+1,index,n);
            }else{
                temp = temp + "(";
                generateParenthesis(arraylist,temp,left+1,right,index+1,n);
                temp = temp.substring(0,temp.length()-1);
                temp = temp + ")";
                generateParenthesis(arraylist,temp,left,right+1,index+1,n);
               // temp = temp.substring(0,temp.length()-1);
            }
        }

    }
}