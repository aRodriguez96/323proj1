import java.util.Random;

public class Main {
	public static void main(String args[]) {
		BST bst = new BST();
		
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			int n = r.nextInt(100);
			
			BSTNode node = new BSTNode(n);
			bst.insert(node);
		}
		
		bst.inOrder();
		System.out.println();
		
		/*bst.postOrder();
		System.out.println();
		
		bst.preOrder();
		System.out.println();
		
		bst.reverseOrder();
		System.out.println();*/
		
		bst.levelOrder();
		
		System.out.println(bst.search(26) );
	}
}
