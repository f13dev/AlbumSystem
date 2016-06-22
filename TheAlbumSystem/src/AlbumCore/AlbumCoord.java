package AlbumCore;

import java.util.*;

/*
 * 
 */

/**
 *
 * @author jamesvalentine
 */
public class AlbumCoord {
    
    /* Stores a set of all artists on the system */
    private Set<Artist> artists;
    /* Stores a set of all albums on the system */
    private Set<Album> albums;
    
    /**
     * Initialises a new AlbumCoord object with empty sets for the
     * artists and albums attributes.
     */
    public AlbumCoord()
    {
        this.artists = new HashSet<>();
        this.albums = new HashSet<>();
    }
    
    /**
     * Returns the set of Artist objects on the system.
     * @return Set<Artist>
     */
    public Set<Artist> getArtists()
    {
        return this.artists;
    }
    
    /**
     * Returns the set of Album objects on the system
     * @return Set<Album>
     */
    public Set<Album> getAlbums()
    {
        return this.albums;
    }
    
    /**
     * Sets the receivers artists attribute to the value of aSet.
     * @param aSet 
     */
    public void setArtists(Set<Artist> aSet)
    {
        this.artists = aSet;
    }
    
    /**
     * Adds a new Artist object to the artists set with the name
     * attribute aName.
     * @param aName 
     */
    public void newArtist(String aName)
    {
        Set<Artist> temp = this.getArtists();
        temp.add(new Artist(aName));
        this.setArtists(temp);
    }
    
}
