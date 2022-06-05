package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinations {
    public static void main(String args[]){
        List<String > l = letterCombinations("23");
        for(String m : l){
            System.out.println(m);
        }
    }
    public static List<String> letterCombinations(String digits) {
        List<String> string = new ArrayList<>();
        ArrayList<List<Character>> l = new ArrayList<List<Character>>();
        l.add(new ArrayList<Character>(Arrays.asList('a','b','c')));
        l.add(new ArrayList<Character>(Arrays.asList('d','e','f')));
        l.add(new ArrayList<Character>(Arrays.asList('g','h','i')));
        l.add(new ArrayList<Character>(Arrays.asList('j','k','l')));
        l.add(new ArrayList<Character>(Arrays.asList('m','n','o')));
        l.add(new ArrayList<Character>(Arrays.asList('p','q','r','s')));
        l.add(new ArrayList<Character>(Arrays.asList('t','u','v')));
        l.add(new ArrayList<Character>(Arrays.asList('w','x','y','z')));

        if(digits.length() == 0){
            return new ArrayList<>();
        }
        String tmp = "";
        letters(digits,l,0,string,tmp);
        return string;
    }
    public static void letters(String digits,ArrayList<List<Character>> list, int index,List<String> string ,String tmp ){

        if(index == digits.length()){
            string.add(tmp);
            return;
        }

        for(int i = 0;i<list.get(digits.charAt(index) - '2').size();i++){
            tmp = tmp + list.get(digits.charAt(index) - '2').get(i) ;
            letters(digits,list,index + 1, string ,tmp);
            tmp = tmp.substring(0,tmp.length()-1);
        }
    }
}
