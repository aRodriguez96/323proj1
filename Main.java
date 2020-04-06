import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) throws FileNotFoundException {
		long startTime;
		 long stopTime;
	     long elapsedTime;
	     int bestc = 100000;
	     int worstc = 1;
	     double avgc = 0;
	     long bestt = 0;
	     long worstt = 0;
	     long totalt = 0;
	     int temp = 0;
	     
		BST bst10 = new BST();
		AVLTree avl10 = new AVLTree();
		BST bst100 = new BST();
		AVLTree avl100 = new AVLTree();
		BST bst1000 = new BST();
		AVLTree avl1000 = new AVLTree();
		BST bst10000 = new BST();
		AVLTree avl10000 = new AVLTree();
	
	/////~~~~~BST~~~~~~//////
	
	///////10//////
		Scanner scanner10 = new Scanner(new File("source10.txt"));
		temp = 0;
		while(scanner10.hasNextInt())
		{
			temp = scanner10.nextInt();
		     BSTNode node = new BSTNode(temp);
		     bst10.insert(node);
		     avl10.root = avl10.insert(avl10.root, temp);
		     //System.out.println(temp);
		}
		
		for(int i = 1; i <= 10;i++) {
			startTime = System.currentTimeMillis();
			if(bst10.search(i) != null) {}
			
			stopTime = System.currentTimeMillis();
			if(global.operations < bestc) bestc = global.operations;
			if(global.operations > worstc) worstc = global.operations;
			avgc += global.operations;
			global.operations = 0;
	    	elapsedTime = stopTime - startTime;
	    	totalt += elapsedTime;
	    	if(elapsedTime < bestt) bestt = elapsedTime;
	    	if(elapsedTime > worstt) worstt = elapsedTime;
	    	
			global.operations = 0;
		}
		
		System.out.println("~~~~~~~~~BST WITH 10 RANDOM NUMBERS~~~~~~~~~");
		System.out.println("Max Depth: "+bst10.maxDepth());
		System.out.println("Best comparisons: "+bestc);
		System.out.println("Worst comparisons: "+worstc);
		System.out.println("Average comparisons: "+avgc/10);
		System.out.println();
		System.out.println("Best time: "+bestt);
		System.out.println("Worst time: "+worstt);
		System.out.println("Average time: "+totalt/10);
		System.out.println("Total time: "+totalt);
	//////////////////
	
	///////100/////////
		
		  bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		   global.operations = 0;
		Scanner scanner100 = new Scanner(new File("source100.txt"));
		temp = 0;
		while(scanner100.hasNextInt())
		{
			temp = scanner100.nextInt();
		     BSTNode node = new BSTNode(temp);
		     bst100.insert(node);
		     avl100.root = avl100.insert(avl100.root, temp);
		     //System.out.println(temp);
		}
		
		for(int i = 1; i <= 100;i++) {
			startTime = System.currentTimeMillis();
			if(bst100.search(i) != null) {}
			
			stopTime = System.currentTimeMillis();
			if(global.operations < bestc) bestc = global.operations;
			if(global.operations > worstc) worstc = global.operations;
			avgc += global.operations;
			global.operations = 0;
	    	elapsedTime = stopTime - startTime;
	    	totalt += elapsedTime;
	    	if(elapsedTime < bestt) bestt = elapsedTime;
	    	if(elapsedTime > worstt) worstt = elapsedTime;
	    	
			global.operations = 0;
		}
		System.out.println();
		System.out.println("~~~~~~~~~BST WITH 100 RANDOM NUMBERS~~~~~~~~~");
		System.out.println("Max Depth: "+bst100.maxDepth());
		System.out.println("Best comparisons: "+bestc);
		System.out.println("Worst comparisons: "+worstc);
		System.out.println("Average comparisons: "+avgc/100);
		System.out.println();
		System.out.println("Best time: "+bestt);
		System.out.println("Worst time: "+worstt);
		System.out.println("Average time: "+totalt/100);
		System.out.println("Total time: "+totalt);
	/////////
		
	//////1000/////////
		  bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		  global.operations = 0;
		Scanner scanner1000 = new Scanner(new File("source1000.txt"));
		temp = 0;
		while(scanner1000.hasNextInt())
		{
			temp = scanner1000.nextInt();
		     BSTNode node = new BSTNode(temp);
		     bst1000.insert(node);
		     avl1000.root = avl1000.insert(avl1000.root, temp);
		     //System.out.println(temp);
		}
		
		for(int i = 1; i <= 1000;i++) {
			startTime = System.currentTimeMillis();
			if(bst1000.search(i) != null) {}
			
			stopTime = System.currentTimeMillis();
			if(global.operations < bestc) bestc = global.operations;
			if(global.operations > worstc) worstc = global.operations;
			avgc += global.operations;
			global.operations = 0;
	    	elapsedTime = stopTime - startTime;
	    	totalt += elapsedTime;
	    	if(elapsedTime < bestt) bestt = elapsedTime;
	    	if(elapsedTime > worstt) worstt = elapsedTime;
	    	
			global.operations = 0;
		}
		System.out.println();
		System.out.println("~~~~~~~~~BST WITH 1000 RANDOM NUMBERS~~~~~~~~~");
		System.out.println("Max Depth: "+bst1000.maxDepth());
		System.out.println("Best comparisons: "+bestc);
		System.out.println("Worst comparisons: "+worstc);
		System.out.println("Average comparisons: "+avgc/1000);
		System.out.println();
		System.out.println("Best time: "+bestt);
		System.out.println("Worst time: "+worstt);
		System.out.println("Average time: "+totalt/1000);
		System.out.println("Total time: "+totalt);
	     
	///////	
		
	/////10000//////
			  bestc = 100000;
			    worstc = 1;
			   avgc = 0;
			   bestt = 0;
			   worstt = 0;
			    totalt = 0;
			   temp = 0;
			  global.operations = 0;
			Scanner scanner10000 = new Scanner(new File("source10000.txt"));
			temp = 0;
			while(scanner10000.hasNextInt())
			{
				temp = scanner10000.nextInt();
			     BSTNode node = new BSTNode(temp);
			     bst10000.insert(node);
			     avl10000.root = avl10000.insert(avl10000.root, temp);
			     //System.out.println(temp);
			}
			
			for(int i = 1; i <= 10000;i++) {
				startTime = System.currentTimeMillis();
				if(bst10000.search(i) != null) {}
				
				stopTime = System.currentTimeMillis();
				if(global.operations < bestc) bestc = global.operations;
				if(global.operations > worstc) worstc = global.operations;
				avgc += global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	totalt += elapsedTime;
		    	if(elapsedTime < bestt) bestt = elapsedTime;
		    	if(elapsedTime > worstt) worstt = elapsedTime;
		    	
				global.operations = 0;
			}
			System.out.println();
			System.out.println("~~~~~~~~~BST WITH 10000 RANDOM NUMBERS~~~~~~~~~");
			System.out.println("Max Depth: "+bst10000.maxDepth());
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println("Average comparisons: "+avgc/10000);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			System.out.println("Average time: "+totalt/10000);
			System.out.println("Total time: "+totalt);
			
		/////////
			
		//////~~~~~~~~AVL~~~~~~~~//////
		/////10////
		
			bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		   global.operations = 0;
		   for(int i = 1; i <= 10;i++) {
				startTime = System.currentTimeMillis();
				if(avl10.search(i) != null) {}
				
				stopTime = System.currentTimeMillis();
				if(global.operations < bestc) bestc = global.operations;
				if(global.operations > worstc) worstc = global.operations;
				avgc += global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	totalt += elapsedTime;
		    	if(elapsedTime < bestt) bestt = elapsedTime;
		    	if(elapsedTime > worstt) worstt = elapsedTime;
		    	
				global.operations = 0;
			}
			System.out.println();
			System.out.println("~~~~~~~~~AVL WITH 10 RANDOM NUMBERS~~~~~~~~~");
			System.out.println("Max Depth: "+avl10.height());
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println("Average comparisons: "+avgc/10);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			System.out.println("Average time: "+totalt/10);
			System.out.println("Total time: "+totalt);
			
			///////
			
			///100////
			
			bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		   global.operations = 0;
		   for(int i = 1; i <= 100;i++) {
				startTime = System.currentTimeMillis();
				if(avl100.search(i) != null) {}
				
				stopTime = System.currentTimeMillis();
				if(global.operations < bestc) bestc = global.operations;
				if(global.operations > worstc) worstc = global.operations;
				avgc += global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	totalt += elapsedTime;
		    	if(elapsedTime < bestt) bestt = elapsedTime;
		    	if(elapsedTime > worstt) worstt = elapsedTime;
		    	
				global.operations = 0;
			}
			System.out.println();
			System.out.println("~~~~~~~~~AVL WITH 100 RANDOM NUMBERS~~~~~~~~~");
			System.out.println("Max Depth: "+avl100.height());
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println("Average comparisons: "+avgc/100);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			System.out.println("Average time: "+totalt/100);
			System.out.println("Total time: "+totalt);
			
			////////
			
			///1000////
			
			bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		   global.operations = 0;
		   for(int i = 1; i <= 1000;i++) {
				startTime = System.currentTimeMillis();
				if(avl1000.search(i) != null) {}
				
				stopTime = System.currentTimeMillis();
				if(global.operations < bestc) bestc = global.operations;
				if(global.operations > worstc) worstc = global.operations;
				avgc += global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	totalt += elapsedTime;
		    	if(elapsedTime < bestt) bestt = elapsedTime;
		    	if(elapsedTime > worstt) worstt = elapsedTime;
		    	
				global.operations = 0;
			}
			System.out.println();
			System.out.println("~~~~~~~~~AVL WITH 1000 RANDOM NUMBERS~~~~~~~~~");
			System.out.println("Max Depth: "+avl1000.height());
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println("Average comparisons: "+avgc/1000);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			System.out.println("Average time: "+totalt/1000);
			System.out.println("Total time: "+totalt);
			
			////////
			
			///1000////
			
			bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		   global.operations = 0;
		   for(int i = 1; i <= 10000;i++) {
				startTime = System.currentTimeMillis();
				if(avl10000.search(i) != null) {}
				
				stopTime = System.currentTimeMillis();
				if(global.operations < bestc) bestc = global.operations;
				if(global.operations > worstc) worstc = global.operations;
				avgc += global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	totalt += elapsedTime;
		    	if(elapsedTime < bestt) bestt = elapsedTime;
		    	if(elapsedTime > worstt) worstt = elapsedTime;
		    	
				global.operations = 0;
			}
			System.out.println();
			System.out.println("~~~~~~~~~AVL WITH 10000 RANDOM NUMBERS~~~~~~~~~");
			System.out.println("Max Depth: "+avl10000.height());
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println("Average comparisons: "+avgc/10000);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			System.out.println("Average time: "+totalt/10000);
			System.out.println("Total time: "+totalt);
			
			////////
			
			
			
			
			
			
			
			
			
			
			
			
		//System.out.println("BST Level Order:");
		//bst10.levelOrder();
		//System.out.println();
		
		//System.out.println("AVL Level Order");
	   // avl10.levelOrder();
	   // System.out.println();
	    
	   // System.out.println(bst10.search(numToSearch) );
	    
	    // Look for a number in the tree, always starts at root
	   // System.out.println(avl10.search(numToSearch) );
	  // System.out.println();
		/*
		/////////////////////////
		System.out.println();
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
		*/
	   /*
		////////RAYHAN/////////
		int num = 0;
		Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size hash table");
        int sizeholder =scan.nextInt();
        System.out.println("Enter size of inputs");
        int sizeholder_for_inputs =scan.nextInt();
        // Make object of HashTable 
        HashTable ht = new HashTable(sizeholder );

        char ch;
        //  Perform HashTable operations  
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
        // Display hash table 
            ht.printHashTable();  

        System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');
		
		*/
		
		///////////////////////
		
	}
}