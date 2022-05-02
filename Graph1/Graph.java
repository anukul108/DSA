package Graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    LinkedList<GraphNode> nodeList = new LinkedList<>();

    public Graph(LinkedList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    // BFS internal
    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.println(currentNode.name + " ");
            for(GraphNode neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void bfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    // DFS internal
    void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.println(currentNode.name + " ");
            for(GraphNode neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;

                }
            }
        }
    }

    void dfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
}
