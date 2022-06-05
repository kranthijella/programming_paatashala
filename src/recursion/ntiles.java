package recursion;

import java.util.HashSet;
import java.util.Set;

public class ntiles {
    public static void main(String args[]){
        Solutiond s = new Solutiond();
       System.out.println( s.numTilePossibilities("AAABBC"));
    }
}
class Solutiond {
    Set<String> sets = new HashSet();
    boolean[] vis;
    public int numTilePossibilities(String tiles) {
        int n = tiles.length();
        vis = new boolean[n];
        dfs("", tiles);
        return sets.size()-1;
    }
    void dfs(String sb, String tiles){
        if(sb.length()>tiles.length()) return;
        sets.add(sb);
        for(int i=0;i<tiles.length();i++){
            if(vis[i]) continue;
            if( i > 0 && tiles.charAt(i) == tiles.charAt(i-1) && !vis[i-1]) continue;
            vis[i] = true;
            sb = sb + tiles.charAt(i);
            dfs(sb, tiles);
            sb = sb.substring(0,sb.length()-1);
            vis[i] = false;
        }
    }
}