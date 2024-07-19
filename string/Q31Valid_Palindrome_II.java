package string;

public class Q31Valid_Palindrome_II {
    class Solution {
        public boolean validPalindrome(String s) {
            int skip=0;
            int j=s.length()-1;
            int i=0;
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                        return helper(s,i+1,j)||helper(s,i,j-1);
                }
                  i++;
                 j--;
             
            }
            return true;
            
        }
    
        private boolean helper(String s,int i,int j){
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                  i++;
                 j--;
             
            }
            return true;
        }
    }
}
