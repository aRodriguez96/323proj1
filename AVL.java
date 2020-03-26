/* AVL Tree that balances based on the heights of the sub trees */
public class AVL extends BST {
	AVL() { super(); }
	
	private int balanceFactor(BSTNode n) {
		return (maxDepth(n.getLeft() ) - maxDepth(n.getRight() ));
	}
	
	public void insertChild(AVLNode n) {
		super.insert(n);
	}
}
