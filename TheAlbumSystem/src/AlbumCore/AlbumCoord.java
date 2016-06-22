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
    
}
