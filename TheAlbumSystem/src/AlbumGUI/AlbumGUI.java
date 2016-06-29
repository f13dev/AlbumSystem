/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlbumGUI;

import AlbumCore.*;

/**
 *
 * @author jamesvalentine
 */
public class AlbumGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new AlbumCoord object
        AlbumCoord coord = new AlbumCoord();
        
        // Create some Artist objects for testing
        coord.addArtist("Metallica");
        coord.addArtist("Guns n Roses");
        coord.addArtist("Queen");
        
        // Create some Album objects for testing
        coord.addAlbum("The Black Album", "Metallica", true);
        coord.addAlbum("S&M", "Metallica", true);
        coord.addAlbum("Ride the lightning", "Metallica", false);
        
        coord.addAlbum("Use your illusion I", "Guns n Roses", true);
        coord.addAlbum("Use your illusion II", "Guns n Roses", false);
        
        coord.addAlbum("Greatest hits", "Queen", true);
    }
    
}
