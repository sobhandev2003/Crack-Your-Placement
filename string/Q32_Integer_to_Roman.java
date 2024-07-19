package string;

import java.util.HashMap;

public class Q32_Integer_to_Roman {
    class Solution {
     HashMap<Integer,String> numerals;
     int []list={1000,500,100,50,10,5,1};
     public Solution(){
        numerals=new HashMap<>();
        numerals.put(1,"I");
        numerals.put(5,"V"); 
        numerals.put(10,"X");
        numerals.put(50,"L");
        numerals.put(100,"C");
        numerals.put(500,"D");
        numerals.put(1000,"M");
        numerals.put(4,"IV");
        numerals.put(9,"IX");
        numerals.put(40,"XL");
        numerals.put(90,"XC");
        numerals.put(400,"CD");
        numerals.put(900,"CM"); 
     }
    public String intToRoman(int num) {
       
        int temp=num;
        int x=1;
        String str="";

        while(temp>0){
            int rem=temp%10;
            str=roman(rem*x)+str;
            temp/=10;
            x*=10;
        }
        return str;
    }

    private String roman(int num){
        if(num==0)return "";
        if(numerals.get(num)!=null)return numerals.get(num);
        String str="";
        for(int x:list){
            if(num>=x){
                int t=num/x;
                while(t>0){
                    str+=numerals.get(x);
                    t--;
                }
                str+=roman(num%x);
                break;
            }
        }
numerals.put(num,str);
        return str;

    }
}

}
