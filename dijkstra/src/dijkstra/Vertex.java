/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dijkstra;

/**
 *
 * @author caio
 */
public class Vertex {

    private Node n1;
    private Node n2;
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Node getN1() {
        return n1;
    }

    public Node getN2() {
        return n2;
    }

    public void setN1(Node n1) {
        this.n1 = n1;
    }

    public void setN2(Node n2) {
        this.n2 = n2;
    }

    Vertex(Node n1, Node n2, double distance){
        this.n1 = n1;
        this.n2 = n2;
        this.distance = distance;
    }

    
}
