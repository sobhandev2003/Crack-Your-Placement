package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q36_BFS_Of_Graph {

    class Solution {
        // Function to return Breadth First Traversal of given graph.
        public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            ArrayList<Integer> list = new ArrayList<>();
            Queue<Integer> qu = new LinkedList<>();

            boolean[] vis = new boolean[v];
            qu.add(0);
            // vis[0]=true

            while (!qu.isEmpty()) {
                int current = qu.poll();

                if (!vis[current]) {

                    list.add(current);
                    ArrayList<Integer> temp = adj.get(current);

                    for (int i = 0; i < temp.size(); i++) {
                        int x = temp.get(i);
                        qu.add(x);
                    }

                    vis[current] = true;
                }
            }

            return list;
        }
    }
}
