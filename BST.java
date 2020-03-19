/* Binary Search Tree class */

public class BST {
	private BSTNode root;
	
	public BST() { root = null; }
	
	// Getters
	public BSTNode getRoot() { return root; }
	
	// Setters
	public void setRoot(BSTNode n) { root = n; } 
	
	// Methods
	
	// In an empty tree inserts the root, otherwise inserts a child into the tree
	public void insert(BSTNode n) {
		if(root == null) { root = n; }
		
		else { root.insertChild(n); }
	}
	
	// Looks for a number in the tree, returns the node if found, null otherwise
	private BSTNode search(int i, BSTNode n) {
		if(n == null) { return null; }
		
		else if(i == n.getData() ) { return n; }
		
		else if(i > n.getData() ) { return search(i, n.getRight() ); }
		
		else { return search(i, n.getLeft() ); }
	}
	
	// In Order traversal of the tree, prints the value and its key count.
	private void inOrder(BSTNode n) {
		// If nothing to traverse, return
		if(n == null) { return; }
		
		else {
			// Print out left sub-tree, root, right sub-tree
			inOrder(n.getLeft() );
			System.out.print(n.getData() + "(" + n.getKeyCount() + ") " );
			inOrder(n.getRight() );
		}
	}
	
	// Function wrappers
	public BSTNode search(int i) { return search(i, root); }
	public void inOrder() { inOrder(root); }
}
