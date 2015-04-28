
public class Tree {
	
    private Tree left, right;
    private char info;
	
    public Tree getLeft() {
		return left;
	}
	public void setLeft(Tree left) {
		this.left = left;
	}
	public Tree getRight() {
		return right;
	}
	public void setRight(Tree right) {
		this.right = right;
	}
	public char getInfo() {
		return info;
	}
	public void setInfo(char info) {
		this.info = info;
	}
	
	public Tree(char info)
	{
		this(null, null, info);
	}
	
	public Tree(Tree left, Tree right, char info) {
		super();
		this.left = left;
		this.right = right;
		this.info = info;
	}

	public int treeHeight(Tree t){
        if (t == null)
            return 0;
        else{
            int h1 = this.treeHeight(t.getLeft());
            int h2 = this.treeHeight(t.getRight());
            if (h1 >= h2)
                return h1 + 1;
            else
                return h2 + 1;
            }
    }
    
}
