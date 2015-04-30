/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dijkstra;

/**
 *
 * @author caio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        Graph g = new Graph();
        Main.Dijkstra(g, g.getNodes()[0] , g.getNodes()[5]);
        
    }

    public static void Dijkstra(Graph g, Node sourceNode, Node destNode){

        double min = Double.MAX_VALUE;

        Node currentNode = sourceNode;
        Vertex currentVertex = null;
        Vertex minVertex = null;

        currentNode.setDistance(0);

        for(int i = 0; i < g.getVertex().length; i++){
        	
            currentVertex = g.getVertex()[i];
            
            if (currentVertex.getN1()==currentNode){
               
            	if(currentVertex.getN2().isVisited()){
                    currentVertex.getN2().setDistance(currentVertex.getDistance());
                  
                    if(min > currentVertex.getDistance()){
                        min = currentVertex.getDistance();
                        minVertex = currentVertex;                    
                    }
                    else {
                        System.out.println("qwe");
                    }
                }
            	
            currentNode = minVertex.getN2();

            }
        
        }
    }

}
