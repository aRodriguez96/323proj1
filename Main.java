import java.util.Random;

public class Main {
	public static void main(String args[]) {
		BST bst = new BST();
		
		for(int i = 0; i < 50; i++) {
			Random r = new Random();
			int n = r.nextInt(100);
			
			BSTNode node = new BSTNode(n);
			bst.insert(node);
		}
		
		bst.inOrder();
		System.out.println();
		System.out.println(bst.search(26) );
	}
}
