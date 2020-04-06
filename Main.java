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
	 	int maxLength = 0;
	 	String shortest = "";
	 	String longest = "";
	     String str = "";
	     
		BST bst10 = new BST();
		AVLTree avl10 = new AVLTree();
		BST bst100 = new BST();
		AVLTree avl100 = new AVLTree();
		BST bst1000 = new BST();
		AVLTree avl1000 = new AVLTree();
		BST bst10000 = new BST();
		AVLTree avl10000 = new AVLTree();
		TrieNode trie10 = new TrieNode(); 
		TrieNode trie100 = new TrieNode(); 
		TrieNode trie1000 = new TrieNode();
		TrieNode trie10000 = new TrieNode(); 
	
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
		   for(int i = 1; i <= 10;i++) {
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
			
			//////TRIE////////
			System.out.println();
			///////10///////
			
			bestc = 100000;
		    worstc = 1;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		    shortest = "";
			 longest = "";
		   global.operations = 0;
		   maxLength = 0;
		    
			Scanner textscanner10 = new Scanner(new File("wordsource10.txt"));
			str = "";
			while(textscanner10.hasNextLine())
			{
				 str = textscanner10.nextLine();
				 trie10.insert(str); 
				 if(str.length() > maxLength) {
					 maxLength = str.length();
					 longest = str;
				 }
				 if(str.length()==1) {
					 shortest = str;
				 }
			     //System.out.println(temp);
			}
			//adds 1 to account for root
			maxLength++;
			 
			
				startTime = System.currentTimeMillis();
				if(trie10.search(shortest) == true) {}
				stopTime = System.currentTimeMillis();
				bestc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	bestt = elapsedTime;
		    
		    	
		    	startTime = System.currentTimeMillis();
				if(trie10.search(longest) == true) {}
				stopTime = System.currentTimeMillis();
			    worstc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	worstt = elapsedTime;
		    	
		    	
				global.operations = 0;
				
				
			
			
			System.out.println("~~~~~~~~~TRIE WITH 10 RANDOM WORDS~~~~~~~~~");
			System.out.println("Max Depth: "+maxLength);
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);

		
		//////////////////
		System.out.println();
		//////100////////
			
			bestc = 100000;
		    worstc = 1;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		    shortest = "";
			 longest = "";
		   global.operations = 0;
		   maxLength = 0;
		    
			Scanner textscanner100 = new Scanner(new File("wordsource100.txt"));
			str = "";
			while(textscanner100.hasNextLine())
			{
				 str = textscanner100.nextLine();
				 trie100.insert(str); 
				 if(str.length() > maxLength) {
					 maxLength = str.length();
					 longest = str;
				 }
				 if(str.length()==1) {
					 shortest = str;
				 }
			     //System.out.println(temp);
			}
			//adds 1 to account for root
			maxLength++;
			 
			
				startTime = System.currentTimeMillis();
				if(trie100.search(shortest) == true) {}
				stopTime = System.currentTimeMillis();
				bestc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	bestt = elapsedTime;
		    
		    	
		    	startTime = System.currentTimeMillis();
				if(trie100.search(longest) == true) {}
				stopTime = System.currentTimeMillis();
			    worstc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	worstt = elapsedTime;
		    	
		    	
				global.operations = 0;
				
				
			
			
			System.out.println("~~~~~~~~~TRIE WITH 100 RANDOM WORDS~~~~~~~~~");
			System.out.println("Max Depth: "+maxLength);
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			
			///////////////
			System.out.println();
			///////1000///////
		
			bestc = 100000;
		    worstc = 1;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		    shortest = "";
			 longest = "";
		   global.operations = 0;
		   maxLength = 0;
		    
			Scanner textscanner1000 = new Scanner(new File("wordsource1000.txt"));
			str = "";
			while(textscanner1000.hasNextLine())
			{
				 str = textscanner1000.nextLine();
				 trie1000.insert(str); 
				 if(str.length() > maxLength) {
					 maxLength = str.length();
					 longest = str;
				 }
				 if(str.length()==1) {
					 shortest = str;
				 }
			     //System.out.println(temp);
			}
			//adds 1 to account for root
			maxLength++;
			 
			
				startTime = System.currentTimeMillis();
				if(trie1000.search(shortest) == true) {}
				stopTime = System.currentTimeMillis();
				bestc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	bestt = elapsedTime;
		    
		    	
		    	startTime = System.currentTimeMillis();
				if(trie1000.search(longest) == true) {}
				stopTime = System.currentTimeMillis();
			    worstc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	worstt = elapsedTime;
		    	
		    	
				global.operations = 0;
				
				
			
			
			System.out.println("~~~~~~~~~TRIE WITH 1000 RANDOM WORDS~~~~~~~~~");
			System.out.println("Max Depth: "+maxLength);
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
		
		////////////
		System.out.println();
		////////10000////////
			
			bestc = 100000;
		    worstc = 1;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		    shortest = "";
			 longest = "";
		   global.operations = 0;
		   maxLength = 0;
		    
			Scanner textscanner10000 = new Scanner(new File("wordsource10000.txt"));
			str = "";
			while(textscanner10000.hasNextLine())
			{
				 str = textscanner10000.nextLine();
				 trie10000.insert(str); 
				 if(str.length() > maxLength) {
					 maxLength = str.length();
					 longest = str;
				 }
				 if(str.length()==1) {
					 shortest = str;
				 }
			     //System.out.println(temp);
			}
			//adds 1 to account for root
			maxLength++;
			 
			
				startTime = System.currentTimeMillis();
				if(trie10000.search(shortest) == true) {}
				stopTime = System.currentTimeMillis();
				bestc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	bestt = elapsedTime;
		    
		    	
		    	startTime = System.currentTimeMillis();
				if(trie10000.search(longest) == true) {}
				stopTime = System.currentTimeMillis();
			    worstc = global.operations;
				global.operations = 0;
		    	elapsedTime = stopTime - startTime;
		    	worstt = elapsedTime;
		    	
		    	
				global.operations = 0;
				
				
			
			
			System.out.println("~~~~~~~~~TRIE WITH 10000 RANDOM WORDS~~~~~~~~~");
			System.out.println("Max Depth: "+maxLength);
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
		
			/////////////
			System.out.println();
			///////HASHMAP WITH CHAINING////////
			//////10///////
			bestc = 100000;
		    worstc = 1;
		   avgc = 0;
		   bestt = 0;
		   worstt = 0;
		    totalt = 0;
		   temp = 0;
		   global.operations = 0;
			HashTable ht10 = new HashTable(5);
			Scanner hashscanner10 = new Scanner(new File("source10.txt"));
			
			while(hashscanner10.hasNextInt())
			{
				temp = hashscanner10.nextInt();
			     ht10.insert(temp);
			     //System.out.println(temp);
			}
			
			for(int i = 1; i <= 10;i++) {
				startTime = System.currentTimeMillis();
				if(ht10.get(i)==1) {}
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
			//ht10.printHashTable();  

			System.out.println("~~~~~~~~~HT WITH 10 RANDOM NUMBERS~~~~~~~~~");
			System.out.println("Size of Table: 5");
			System.out.println("Best comparisons: "+bestc);
			System.out.println("Worst comparisons: "+worstc);
			System.out.println("Average comparisons: "+avgc/10);
			System.out.println();
			System.out.println("Best time: "+bestt);
			System.out.println("Worst time: "+worstt);
			System.out.println("Average time: "+totalt/10);
			System.out.println("Total time: "+totalt);
			
			/////////////
			System.out.println();
			/////////////
			
			//////100///////
					bestc = 100000;
				    worstc = 1;
				   avgc = 0;
				   bestt = 0;
				   worstt = 0;
				    totalt = 0;
				   temp = 0;
				   global.operations = 0;
					HashTable ht100 = new HashTable(50);
					Scanner hashscanner100 = new Scanner(new File("source100.txt"));
					
					while(hashscanner100.hasNextInt())
					{
						temp = hashscanner100.nextInt();
					     ht100.insert(temp);
					     //System.out.println(temp);
					}
					
					for(int i = 1; i <= 100;i++) {
						startTime = System.currentTimeMillis();
						if(ht100.get(i)==1) {}
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
				
					System.out.println("~~~~~~~~~HT WITH 100 RANDOM NUMBERS~~~~~~~~~");
					System.out.println("Size of Table: 50");
					System.out.println("Best comparisons: "+bestc);
					System.out.println("Worst comparisons: "+worstc);
					System.out.println("Average comparisons: "+avgc/100);
					System.out.println();
					System.out.println("Best time: "+bestt);
					System.out.println("Worst time: "+worstt);
					System.out.println("Average time: "+totalt/100);
					System.out.println("Total time: "+totalt);
					
					/////////////
					System.out.println();
					//////1000///////
					bestc = 100000;
				    worstc = 1;
				   avgc = 0;
				   bestt = 0;
				   worstt = 0;
				    totalt = 0;
				   temp = 0;
				   global.operations = 0;
					HashTable ht1000 = new HashTable(500);
					Scanner hashscanner1000 = new Scanner(new File("source1000.txt"));
					
					while(hashscanner1000.hasNextInt())
					{
						temp = hashscanner1000.nextInt();
					     ht1000.insert(temp);
					     //System.out.println(temp);
					}
					
					for(int i = 1; i <= 1000;i++) {
						startTime = System.currentTimeMillis();
						if(ht1000.get(i)==1) {}
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
				
					System.out.println("~~~~~~~~~HT WITH 1000 RANDOM NUMBERS~~~~~~~~~");
					System.out.println("Size of Table: 500");
					System.out.println("Best comparisons: "+bestc);
					System.out.println("Worst comparisons: "+worstc);
					System.out.println("Average comparisons: "+avgc/1000);
					System.out.println();
					System.out.println("Best time: "+bestt);
					System.out.println("Worst time: "+worstt);
					System.out.println("Average time: "+totalt/1000);
					System.out.println("Total time: "+totalt);
					//ht1000.printHashTable(); 
					/////////////
					System.out.println();
					/////////10000////////
					bestc = 100000;
				    worstc = 1;
				   avgc = 0;
				   bestt = 0;
				   worstt = 0;
				    totalt = 0;
				   temp = 0;
				   global.operations = 0;
					HashTable ht10000 = new HashTable(5000);
					Scanner hashscanner10000 = new Scanner(new File("source10000.txt"));
					
					while(hashscanner10000.hasNextInt())
					{
						temp = hashscanner10000.nextInt();
					     ht10000.insert(temp);
					     //System.out.println(temp);
					}
					
					for(int i = 1; i <= 10000;i++) {
						startTime = System.currentTimeMillis();
						if(ht10000.get(i)==1) {}
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
				
					System.out.println("~~~~~~~~~HT WITH 10000 RANDOM NUMBERS~~~~~~~~~");
					System.out.println("Size of Table: 5000");
					System.out.println("Best comparisons: "+bestc);
					System.out.println("Worst comparisons: "+worstc);
					System.out.println("Average comparisons: "+avgc/10000);
					System.out.println();
					System.out.println("Best time: "+bestt);
					System.out.println("Worst time: "+worstt);
					System.out.println("Average time: "+totalt/10000);
					System.out.println("Total time: "+totalt);
					

			
					
					
					
					
					
					
	
			
		
	}
}