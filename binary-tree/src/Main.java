
/**
 *
 * @author Caio
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	// some testing
    Tree t = new BinaryTree('a');
	Tree l = new BinaryTree('b');
	Tree r = new BinaryTree('c');
		
	t.setRight(r);
	t.setLeft(l);
		
	System.out.println(t.treeHeight(t));

      // todo: more methods, more kinds of trees, etc
	
    }


}
