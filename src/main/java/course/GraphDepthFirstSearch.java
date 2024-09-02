package course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GraphDepthFirstSearch {
    static class Graph {
        HashMap<Integer, ArrayList<Integer>> adjList;

        Graph() {
            this.adjList = new HashMap<>();
        }

        Graph(HashMap<Integer, ArrayList<Integer>> adjList) {
            this.adjList = adjList;
        }
    }

    public void dfs(Graph graph, int root){
        Set<Integer> set = new HashSet<>();
        dfs(graph, root, set);
    }

    private void dfs(Graph graph, int root, Set<Integer> set) {
        if(set.contains(root))
            return;
        System.out.println(root);
        set.add(root);
        for(int i : graph.adjList.get(root)){
            dfs(graph, i, set);
        }
    }

}
