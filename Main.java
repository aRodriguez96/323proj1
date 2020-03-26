import java.util.Random;

public class Main {
	public static void main(String args[]) {
		
		/////////ADAM////////////
		
		AVL avl = new AVL();
		
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			int n = r.nextInt(100);
			
			BSTNode node = new BSTNode(n);
			avl.insert(node);
		}
		
		/////////////////////////
		
		/////////ALBERT//////////
		
		/* Input keys (use only 'a' through 'z' and lower case) 
		String keys[] = {"the", "a", "there", "answer", "any", 
				 "by", "bye", "their"}; 

		String output[] = {"Not present in trie", "Present in trie"}; 


		TrieNode root = new TrieNode(); 

		// Construct trie 
		int i; 
		for (i = 0; i < keys.length ; i++) 
		    root.insert(keys[i]); 

		// Search for different keys 
		if(root.search("the") == true) 
		    System.out.println("the --- " + output[1]); 
		else System.out.println("the --- " + output[0]); 

		if(root.search("these") == true) 
		    System.out.println("these --- " + output[1]); 
		else System.out.println("these --- " + output[0]); 

		if(root.search("their") == true) 
		    System.out.println("their --- " + output[1]); 
		else System.out.println("their --- " + output[0]); 

		if(root.search("thaw") == true) 
		    System.out.println("thaw --- " + output[1]); 
		else System.out.println("thaw --- " + output[0]); 
		
		////////////////////////*/
		
	}
}