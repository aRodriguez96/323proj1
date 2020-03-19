/* Binary Search Tree class */

public class BST {
	private BSTNode root;
	
	public BST() { root = null; }
	
	// Getters
	public BSTNode getRoot() { return root; }
	
	// Setters
	public void setRoot(BSTNode n) { root = n; } 
	
	// Methods
	public void insert(BSTNode n) {
		if(root == null) { root = n; }
		
		else { root.insertChild(n); }
	}
	
	// In Order traversal of the tree, prints the value and its key count.
	public void inOrder(BSTNode n) {
		// If nothing to traverse, return
		if(n == null) { return; }
		
		else {
			// Print out left sub-tree, root, right sub-tree
			inOrder(n.getLeft() );
			System.out.print(n.getData() + "(" + n.getKeyCount() + ") " );
			inOrder(n.getRight() );
		}
	}
	
	// Function wrapper
	public void inOrder() { inOrder(root); }
}
