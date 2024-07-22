package Graph;

import java.util.ArrayList;

public class Q37_DFS_Of_Graph {
    

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        boolean []vis=new boolean[v];
        // for(int i=0;i<v;i++){
            
        // }
        helper(adj,vis,0,list);
        
        return list;
        
    }
    
    private void helper( ArrayList<ArrayList<Integer>>adj,boolean []vis, int current,ArrayList<Integer> list){
        
        list.add(current);
        vis[current]=true;
        
        for(int i=0;i<adj.get(current).size();i++){
            
            int x=adj.get(current).get(i);
            // System.out.println(x);
            if(!vis[x]){
                helper(adj,vis,x,list);
            }
        }
        
        
    }
}
}
