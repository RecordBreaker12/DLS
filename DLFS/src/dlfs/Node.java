package dlfs;

import java.util.Stack;

public class Node {
    String nome;
    Stack<Node> adj = new Stack<>();
    
    public Node(String nome){
        this.nome = nome;
    }
}
