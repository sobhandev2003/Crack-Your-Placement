package string;

import java.util.Stack;

/**
 * Q28_Valid_Parentheses
 */
public class Q28_Valid_Parentheses {
class Solution {
    public boolean isValid(String s) {
     
       int n=s.length();
        if(n<=1){
            return false;
        }
          Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
         if(s.charAt(i)=='(' ||s.charAt(i)=='{' || s.charAt(i)=='[' ){
                 stack.push(s.charAt(i));
        }
          else{
              if(stack.isEmpty())return false;
                  switch(s.charAt(i)){
                      case ')':
                      if(stack.peek()=='('){
                          stack.pop();
                          break;
                      }
                      else{
                          return false;
                      }
                     case '}':
                        if(stack.peek()=='{'){
                          stack.pop();
                          break;
                      }
                      else{
                          return false;
                      }
                      case ']':
                        if(stack.peek()=='['){
                          stack.pop();
                          break;
                      }
                      else{
                          return false;
                      }
                  }
              
          }
        }

return stack.isEmpty();

    }
}
    
}