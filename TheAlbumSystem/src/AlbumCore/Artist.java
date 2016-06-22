/*
 * 
 */
package AlbumCore;

import java.util.*;

/**
 *
 * @author jamesvalentine
 */
public class Artist {
    
    /* Stores the artists name. */
    private String name;
    /* Stores the list of the linked Album objects */
    Set<Album> albums;
    
    /**
     * Initialises a new Artist object using the argument aName.
     * @param aName 
     */
    Artist(String aName)
    {
        this.name = aName;
        this.albums = new HashSet<>();
    }
    
    /**
     * Returns the name of the receiver.
     * @return name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Returns the set of Artist objects linked to the receiver.
     * @return Set<Album>
     */
    public Set<Album> getAlbums()
    {
        return this.albums;
    }
    
}
