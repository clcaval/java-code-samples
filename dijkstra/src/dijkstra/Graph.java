/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dijkstra;
/**
 *
 * @author caio
 */
public class Graph {

    private Node[] nodes;
    private Vertex[] vertex;

    public Graph(){

        this.nodes = new Node[6];
        this.vertex = new Vertex[9];

        Node a = new Node("a", false, Double.MAX_VALUE);
        Node b = new Node("b", false, Double.MAX_VALUE);
        Node c = new Node("c", false, Double.MAX_VALUE);
        Node d = new Node("d", false, Double.MAX_VALUE);
        Node e = new Node("e", false, Double.MAX_VALUE);
        Node f = new Node("f", false, Double.MAX_VALUE);

        this.nodes[0] = a;
        this.nodes[1] = b;
        this.nodes[2] = c;
        this.nodes[3] = d;
        this.nodes[4] = e;
        this.nodes[5] = f;

        this.vertex[0] = new Vertex(a,b,7);
        this.vertex[1] = new Vertex(a,c,9);
        this.vertex[2] = new Vertex(a,f,14);
        this.vertex[3] = new Vertex(b,c,10);
        this.vertex[4] = new Vertex(b,d,15);
        this.vertex[5] = new Vertex(c,d,11);
        this.vertex[6] = new Vertex(c,f,2);
        this.vertex[7] = new Vertex(d,e,6);
        this.vertex[8] = new Vertex(e,f,9);

    }

    public Node[] getNodes() {
        return nodes;
    }

    public Vertex[] getVertex() {
        return vertex;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }

    public void setVertex(Vertex[] vertex) {
        this.vertex = vertex;
    }
    
}
