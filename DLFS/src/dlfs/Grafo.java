package dlfs;

import java.util.ArrayList;
import java.util.Stack;

public class Grafo extends AbsSearch {
    int depth = 0;
    int limit = 3;

    public Grafo(Node start, Node goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    @Override
    public boolean execute(){
        Stack<Node> nodeStack = new Stack<>();
        ArrayList<Node> visitedNodes = new ArrayList<>();
        nodeStack.add(startNode);

        depth = 0;

        while(!nodeStack.isEmpty()){
            if(depth <= limit) {
                Node current = nodeStack.pop();
                if (current.equals(goalNode)) {
                    System.out.println("Goal node found");
                    return true;
                } 
                else {
                    visitedNodes.add(current);
                    for(Node check : current.adj){
                        if(!visitedNodes.contains(check)){
                            nodeStack.add(check);
                        }
                    }
                    depth++;

                }
            } 
            else {
                System.out.println("Goal Node not found within depth limit");
                return false;
            }
        }
        System.out.println("Goal Node not found within depth limit");
        return false;
    }
}