package string;

import java.util.*;

/**
 * Q29_ Find_the_Index_of_the_First_Occurrence_in_a_String
 */
public class Q29_Find_the_Index_of_the_First_Occurrence_in_a_String {

    class Solution {
        public int strStr(String haystack, String needle) {
            List<Integer> list=new ArrayList<>();
            int n=haystack.length();
            int m=needle.length();
            for(int i=0;i<n;i++){
                if(haystack.charAt(i)==needle.charAt(0) && (i+m)<=n && haystack.substring(i,i+m).equals(needle)){
                   return i;
                }
            }
          
            return -1;
        }
    }
}