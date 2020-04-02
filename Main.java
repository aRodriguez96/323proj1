import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		/////////ADAM////////////
		AVLTree tree = new AVLTree();
		
		for(int i = 0; i < 50; i++) {
			Random r = new Random();
			int n = r.nextInt(100);
			tree.root = tree.insert(tree.root, n);
			
		}
	     
	     tree.levelOrder();
		
		/////////////////////////
		
		/////////ALBERT//////////
	
		//Input keys (use only 'a' through 'z' and lower case) 
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
		
		////////////////////////
		
		////////RAYHAN/////////
		int num = 0;
		Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size hash table");
        int sizeholder =scan.nextInt();
        System.out.println("Enter size of inputs");
        int sizeholder_for_inputs =scan.nextInt();
        /* Make object of HashTable */
        HashTable ht = new HashTable(sizeholder );

        char ch;
        /*  Perform HashTable operations  */
        do    
        {
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. get");            
            System.out.println("4. clear");
            System.out.println("5. size");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter value");
                num = scan.nextInt();
            

                	   ht.insert(num); 
              
                break;                          
            case 2 :                 
                System.out.println("Enter key");
                ht.remove( scan.nextInt() ); 
                break;                        
            case 3 : 
                System.out.println("Enter the value");
                System.out.println("Value = "+ ht.get( scan.nextInt() )); 
                break;                                   
            case 4 : 
                ht.makeEmpty();
                System.out.println("Hash Table Cleared\n"); 
                break;
            case 5 : 
                System.out.println("Size = "+ ht.getSize() );
                break;         
            default : 
                System.out.println("Wrong Entry \n ");
            break;   
            }
        /* Display hash table */
            ht.printHashTable();  

        System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');
		
		
		
		///////////////////////
		
	}
}