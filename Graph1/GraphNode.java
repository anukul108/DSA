package Graph1;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphNode {
    int index;
    String name;
    boolean isVisited  = false;

    public LinkedList<GraphNode> neighbors = new LinkedList<>();

    public GraphNode(int index, String name){
        this.name = name;
        this.index = index;
    }
}
