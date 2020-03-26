/* AVL Tree that balances based on the heights of the sub trees */
public class AVL extends BST {
	AVL() { super(); }
	
	// Gets the difference of the heights for the sub trees of the node
	private int balanceFactor(BSTNode n) {
		return (maxDepth(n.getLeft() ) - maxDepth(n.getRight() ));
	}
	
	// Works like BST but will balance the tree after insertion
	public void insertChild(AVLNode n) {
		
	}
}
