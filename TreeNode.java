
public class TreeNode {

	    private TreeNode left;
	    private TreeNode right;
	    private TreeNode parent;
	    byte[] item;
	    

	    public TreeNode (TreeNode left, TreeNode right, TreeNode parent, byte[] item) {
	        this.left = left;
	        this.right = right;
	        this.parent = parent;
	        this.item = item;
	    }

	    public byte[] getItem() {
	        return item;
	    }

	    public void setItem(byte[] item) {
	        this.item = item;
	    }

	    public TreeNode getLeft() {
	        return left;
	    }

	    public void setLeft(TreeNode left) {
	        this.left = left;
	    }

	    public TreeNode getRight() {
	        return right;
	    }

	    public void setRight(TreeNode right) {
	        this.right = right;
	    }

	    public TreeNode getParent() {
	        return parent;
	    }

	    public void setParent(TreeNode parent) {
	        this.parent = parent;
	    }
	    
	    public TreeNode getRoot(TreeNode anynode)
	    {
	    	while(!(anynode.parent.getItem() == null))
	    	{
	    		anynode = anynode.parent;
	    	}
	    	return anynode;
	    }
	}




