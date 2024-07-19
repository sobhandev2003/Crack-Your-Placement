package string;

import java.util.ArrayList;
import java.util.List;

public class Q33_Generate_Parentheses {
    class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(n,list,"",0,0);
        return list;
    }

    private void helper(int n,List<String> list,String p,int o,int c){
      
      if((n*2)==p.length() ){
        list.add(p);
        return;
      }
      if(o<n){
        helper(n,list,p+'(',o+1,c);
      }
      if(c<o){
        helper(n,list,p+')',o,c+1);
      }
    }

    // private boolean isValid(StringBuilder str){
    //     int n=str.length();
    //     Stack<Character> stk=new Stack<>();
    //     for(int i=0;i<n;i++){
    //             if(str.charAt(i)=='(' ||str.charAt(i)=='['||str.charAt(i)=='{'){
    //                 stk.push(str.charAt(i));
    //             }
    //             else {
    //                 if(stk.isEmpty()){
    //                     return false;
    //                 }
    //                 stk.pop();
    //             }
    //     }
    //     return stk.isEmpty();
    // }
}
}
