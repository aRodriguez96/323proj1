/* Binary Search Tree class */
import java.util.LinkedList;
import java.util.Queue;

public class BST {
	protected BSTNode root;
	
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
	
	// Calculate the height of the tree with a given node
	protected int maxDepth(BSTNode n) {
		if (n == null) { return 0; }
		
		else {
			int maxLeft = maxDepth(n.getLeft() );
			int maxRight = maxDepth(n.getRight() );
			
			int maxDepth = Math.max(maxLeft, maxRight) + 1;
			
			return maxDepth;
		}
	}
	
	// Looks for a number in the tree, returns the node if found, null otherwise
	private BSTNode search(int i, BSTNode n) {
		if(n == null) { return null; }
		
		else if(i == n.getData() ) { return n; }
		
		else if(i > n.getData() ) { return search(i, n.getRight() ); }
		
		else { return search(i, n.getLeft() ); }
	}
	
	// Level order traversal of the tree, prints node values and its key count
	private void levelOrder(BSTNode n) {
		if(n == null) { return; }
		
		Queue<BSTNode> q = new LinkedList<BSTNode>();
		
		q.add(n);
		
		while(true) {
			int nodeCount = q.size();
			
			if(nodeCount == 0) { break; }
			
			while(nodeCount > 0) {
				BSTNode node = q.peek();
				System.out.print(node.getData() + "(" + node.getKeyCount() + ") ");
				q.remove();
				
				if(node.getLeft() != null) { q.add(node.getLeft() ); }
				if(node.getRight() != null) { q.add(node.getRight() ); }
				
				nodeCount--;
			}
			System.out.println();
		}
	}
	
	// In Order traversal of the tree, prints node values and its key count.
	private void inOrder(BSTNode n) {
		// If nothing to traverse, return
		if(n == null) { return; }
		
		else {
			// Print out left sub-tree, root, right sub-tree
			inOrder(n.getLeft() );
			System.out.print(n.getData() + "(" + n.getKeyCount() + ") ");
			inOrder(n.getRight() );
		}
	}
	
	// Post Order traversal of the tree, prints node values and its key count.
	private void postOrder(BSTNode n) {
		// If nothing to traverse, return
		if(n == null) { return; }
		
		else {
			// Print out left sub-tree, right sub-tree, root
			postOrder(n.getLeft() );
			postOrder(n.getRight() );
			System.out.print(n.getData() + "(" + n.getKeyCount() + ") ");
		}
	}
	
	// Pre Order traversal of the tree, prints node values and its key count.
	private void preOrder(BSTNode n) {
		// If nothing to traverse, return
		if(n == null) { return; }
		
		else {
			// Print out root, left sub-tree, right sub-tree
			System.out.print(n.getData() + "(" + n.getKeyCount() + ") ");
			preOrder(n.getLeft() );
			preOrder(n.getRight() );
		}
	}
	
	// Reverse Order traversal of the tree, prints node values and its key count.
	private void reverseOrder(BSTNode n) {
		// If nothing to traverse, return
		if(n == null) { return; }
		
		else {
			// Print out right sub-tree, root, left sub-tree
			reverseOrder(n.getRight() );
			System.out.print(n.getData() + "(" + n.getKeyCount() + ") ");
			reverseOrder(n.getLeft() );
		}
	}
	
	// Function wrappers
	public BSTNode search(int i) { return search(i, root); }
	public int maxDepth() { return maxDepth(root); }
	public void inOrder() { inOrder(root); }
	public void postOrder() { postOrder(root); }
	public void preOrder() { preOrder(root); }
	public void reverseOrder() { reverseOrder(root); }
	public void levelOrder() { levelOrder(root); }
}