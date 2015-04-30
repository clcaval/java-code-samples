/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dijkstra;

/**
 *
 * @author caio
 */
public class Node {

    private String Id;
    private boolean visited;
    private double distance;

    public String getId() {
        return Id;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isVisited() {
        return visited;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    Node(String id, boolean visited, double distance){
        this.Id = id;
        this.visited = visited;
        this.distance = distance;
    }

}
