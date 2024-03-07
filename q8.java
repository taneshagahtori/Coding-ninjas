public class Solution {
    public static String commonPrefix(String []strs,int n){
        if (strs == null || n == 0) return "-1";
        String prefix=strs[0];
        for(String s:strs){
            while(s.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        if(prefix.equals("")){
            return "-1";
        }
                
        return prefix;
    }
}