package string;

public class Q30_Longest_Common_Prefix {
    //LINK - https://leetcode.com/problems/longest-common-prefix/description/
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String prefix="";
            char temp;
            int x=0,j=0;
            int n=1000;
            for(String str:strs){
                if(str.length()<n){
                    n=str.length();
                }
            }
            for(int i=0;i<n;i++){
                    j=0;
                temp=strs[j].charAt(i);
                while(j<strs.length){
                    if(temp!=strs[j].charAt(i)){
                        x=1;
                        break;
                    }
                    j++;
                }
                if(x==1){
                    break;
                }
                else{
                    prefix=prefix+temp;
                }
                
            }
            return prefix;
        }
    }
}
