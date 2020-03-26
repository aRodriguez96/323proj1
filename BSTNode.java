/* BSTNode class for storing in BST */

public class BSTNode {
	// Smaller data is on left, bigger data on right, if parent is null it is the root of the BST
	protected BSTNode left, right;
	protected int data;
	// Used to keep track of duplicate values will increment data is already in the tree.
	protected int keyCount; 
	
	// Initialize BSTNode with parent and data, children will start as null
	public BSTNode(int d) {
		left = right = null;
		data = d;
		keyCount = 1;
	}
	
	// Getters
	public BSTNode getLeft() { return left; }
	public BSTNode getRight() { return right; }
	public int getData() { return data; }
	public int getKeyCount() { return keyCount; }
	
	// Setters
	public void setLeft(BSTNode n) { left = n; }
	public void setRight(BSTNode n) { right = n; }
	public void setData(int d) { data = d; }
	
	// Methods
	
	// Inserts a new node into either the left or right child
	public void insertChild(BSTNode n) {
		// If the number coming in is bigger than this nodes data, try inserting to right child
		if(data < n.data) {
			// If there is no node, insert the data
			if(right == null) { right = n; }
			// Otherwise, call insert on this nodes right child
			else { right.insertChild(n); }
		}
		
		// Else if the number coming in is smaller than this nodes data, try inserting to left child
		else if (data > n.data) {
			// If there is no node, insert the data
			if(left == null) { left = n; }
			// Otherwise, call insert on this nodes left child
			else { left.insertChild(n); }
		}
		
		// If it's the same number, don't expand the tree, increment key count instead
		else { keyCount++; }
	}
}