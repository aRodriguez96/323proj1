/* Class HashTable */
class HashTable
{
    private int TABLE_SIZE;
    private int size; 
    private LinkedHashEntry[] table;
 
     /* Constructor */
    public HashTable(int ts) 
    {
        size = 0;
        TABLE_SIZE = ts;
        table = new LinkedHashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    } 
    /* Function to get number of key-value pairs */
    public int getSize()
    {
        return size;
    }
    /* Function to clear hash table */
    public void makeEmpty()
    {
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    }
    /* Function to get value of a key */
    public int get(int valuee) 
    {

        int hash = (valuee % TABLE_SIZE);
        if (table[hash] == null)
            return -1;
        else 
        {
            LinkedHashEntry entry = table[hash];
            while (entry.next != null && (entry.key == hash)) {
                entry = entry.next;
            if (entry.value == valuee)
                return 1;
            }
            
        }
        return -1;
 
    }
    
    
    /* Function to insert a key value pair */
    public void insert( int value) 
    {	
        int hash = (  value  % TABLE_SIZE);
        if (table[hash] == null)
            table[hash] = new LinkedHashEntry(hash, value);
        else 
        {
            LinkedHashEntry entry = table[hash];
            while (entry.next != null )
                entry = entry.next;
            if (entry.key == hash&&(entry.next == null))
            	
            	entry.next = new LinkedHashEntry(hash, value);
            else
                entry.next = new LinkedHashEntry(hash, value);
        }
        size++;
    }
 
    public void remove(int key) 
    {
        int hash = ( key  % TABLE_SIZE);
        if (table[hash] != null) 
        {
            LinkedHashEntry prevEntry = null;
            LinkedHashEntry entry = table[hash];
            while (entry.next != null && !(entry.key==key)) 
            {
                prevEntry = entry;
                entry = entry.next;
            }
            if (entry.key == key) 
            {
                if (prevEntry == null)
                    table[hash] = entry.next;
                else
                    prevEntry.next = entry.next;
                size--;
            }
        }
    }
    

    
    /* Function to print hash table */
    public void printHashTable()
    {
        for (int i = 0; i < TABLE_SIZE; i++)
        {
            System.out.print("\nBucket "+ (i + 1) +" : ");
            LinkedHashEntry entry = table[i];
            while (entry != null)
            {
                System.out.print(entry.value +" ");
                entry = entry.next;
            }            
        }
    }
}





