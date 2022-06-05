package arrays;
public class Stringpermutation {
    public static void main(String args[]){
        System.out.println(checkInclusion("ab","eidboaooo"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int count =0;
        for(int i = 0;i<k;i++){
            if(s1.contains(String.valueOf(s2.charAt(i)))){
                count = count + 1;
            }
        }
        if(count == s1.length()){
            return true;
        }
        for(int i = k;i<s2.length();i++){
            if(s1.contains(String.valueOf(s2.charAt(i)))){
                count = count + 1;
                if(count == s1.length()){
                    break;
                }
            }
            if(s1.contains(String.valueOf(s2.charAt(i-k)))){
                count = count - 1;
            }
        }
        if(count == s1.length()){
            return true;
        }else{
            return false;
        }
    }
}