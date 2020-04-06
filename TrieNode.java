public class TrieNode { 
		
		static final int ALPHABET_SIZE = 26; 
        TrieNode[] children = new TrieNode[ALPHABET_SIZE]; 
        boolean isEndOfWord; 
        
        public  TrieNode(){ 
            isEndOfWord = false; 
            for (int i = 0; i < ALPHABET_SIZE; i++) 
                children[i] = null; 
        } 
    
       

	    public void insert(String key) 
	    { 
	        int level; 
	        int length = key.length(); 
	        int index; 
	       
	        TrieNode pCrawl = this; 
	       
	        for (level = 0; level < length; level++) 
	        { 
	            index = key.charAt(level) - 'a'; 
	            if (pCrawl.children[index] == null) 
	                pCrawl.children[index] = new TrieNode(); 
	       
	            pCrawl = pCrawl.children[index]; 
	        } 
	       
	        // mark last node as leaf 
	        pCrawl.isEndOfWord = true; 
	    } 
	       
	    // Returns true if key presents in trie, else false 
	    public boolean search(String key) 
	    { 
	        int level; 
	        int length = key.length(); 
	        int index; 
	        TrieNode pCrawl = this; 
	       
	        for (level = 0; level < length; level++) 
	        { 
	        	global.operations++;
	            index = key.charAt(level) - 'a'; 
	       
	            if (pCrawl.children[index] == null) 
	                return false; 
	            
	            pCrawl = pCrawl.children[index]; 
	        } 
	      
	        return (pCrawl != null && pCrawl.isEndOfWord); 
	    } 
       
} 
