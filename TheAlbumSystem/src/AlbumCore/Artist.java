/*
 * 
 */
package AlbumCore;

/**
 *
 * @author jamesvalentine
 */
public class Artist {
    
    /* Stores the artists name. */
    private String name;
    
    /**
     * Initialises a new Artist object using the argument aName.
     * @param aName 
     */
    Artist(String aName)
    {
        this.name = aName;
    }
    
    /**
     * Returns the name of the receiver.
     * @return 
     */
    public String getName()
    {
        return this.name;
    }
    
}
