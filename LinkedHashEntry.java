class LinkedHashEntry 
{
    int key;
    int value;
    LinkedHashEntry next;
 
    /* Constructor */
    LinkedHashEntry(int key, int value) 
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}