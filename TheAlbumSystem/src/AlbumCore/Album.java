/*
 * 
 */
package AlbumCore;

/**
 *
 * @author jamesvalentine
 */
public class Album {
    
    /* Stores the linked Artist object */
    private Artist artist;
    /* Stores the album titile */
    private String title;
    
    /**
     * Initialises a new Album object using the arguments anArtist and aTitle.
     * @param anArtist
     * @param aTitle 
     */
    Album(Artist anArtist, String aTitle)
    {
        this.artist = anArtist;
        this.title = aTitle;
    }
    
    /**
     * Returns the artist attribute of the receiver.
     * @return artist
     */
    public Artist getArtist()
    {
        return this.artist;
    }
    
    /**
     * Returns the name attribute of the receiver.
     * @return title
     */
    public String getTitle()
    {
        return this.title;
    }
    
}
