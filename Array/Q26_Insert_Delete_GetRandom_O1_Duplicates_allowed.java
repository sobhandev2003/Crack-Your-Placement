import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Q26_Insert_Delete_GetRandom_O1_Duplicates_allowed
 */
public class Q26_Insert_Delete_GetRandom_O1_Duplicates_allowed {
//LINK - https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
    class RandomizedCollection {
HashMap<Integer,Set<Integer>> indexMap;
List<Integer> list;
Random rand;
    public RandomizedCollection() {
        indexMap=new HashMap<>();
        list=new ArrayList<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        boolean res=!indexMap.containsKey(val);
        if(res){
            indexMap.put(val,new HashSet<>());
        }
        indexMap.get(val).add(list.size());
        list.add(val);
        return res;
    }
    
    public boolean remove(int val) {
        if(!indexMap.containsKey(val))return false;
        Set<Integer> index=indexMap.get(val);
        int i=index.iterator().next();
        if(index.size()==1){
            indexMap.remove(val);
        }
        else{
            index.remove(i);
        }
        int lastIndex=list.size()-1;
        if(lastIndex!=i){
            int lasVal=list.get(lastIndex);
            indexMap.get(lasVal).remove(lastIndex);
             indexMap.get(lasVal).add(i);
             list.set(i,lasVal);
        }
        list.remove(lastIndex);
        return true;

    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
