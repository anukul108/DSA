package Graph1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<GraphNode> nodeList = new LinkedList<>();
        nodeList.add(new GraphNode(0, "A"));
        nodeList.add(new GraphNode(1,"B"));
        nodeList.add(new GraphNode(2,"C"));
        nodeList.add(new GraphNode(3,"D"));
        nodeList.add(new GraphNode(4,"E"));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(3,4);

    }
}
