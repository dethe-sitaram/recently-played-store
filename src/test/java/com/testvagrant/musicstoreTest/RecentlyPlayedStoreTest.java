package com.testvagrant.musicstoreTest;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testvagrant.musicstore.RecentlyPlayedStore;

public class RecentlyPlayedStoreTest {
	
    private RecentlyPlayedStore store;

    @BeforeMethod
    public void setUp() {
        store = new RecentlyPlayedStore(3);
    }

    @Test(priority = 1)
    public void testAddPlayedSong() {
    	 // Add three songs to the RecentlyPlayedStore for user1
        store.addPlayedSong("user1", "S1");
        store.addPlayedSong("user1", "S2");
        store.addPlayedSong("user1", "S3");
        // Define the expected result
        List<String> expectedSongs = Arrays.asList("S1", "S2", "S3");
        // Get the actual result
        List<String> actualSongs = store.getRecentlyPlayedSongs("user1");
        // Print the expected and actual results
        System.out.println("Expected result: " + expectedSongs);
        System.out.println("Actual result: " + actualSongs);
        // Compare the actual and expected results using assertEquals
        assertEquals(actualSongs, expectedSongs);
    }

    @Test(priority = 2)
    public void testAddPlayedSongS4() {
    	// Add four songs to the RecentlyPlayedStore for user1
        store.addPlayedSong("user1", "S1");
        store.addPlayedSong("user1", "S2");
        store.addPlayedSong("user1", "S3");
        store.addPlayedSong("user1", "S4");
        // Define the expected result
        List<String> expectedSongs = Arrays.asList("S2", "S3", "S4");
        // Get the actual result
        List<String> actualSongs = store.getRecentlyPlayedSongs("user1");
        // Print the expected and actual results
        System.out.println("Expected result: " + expectedSongs);
        System.out.println("Actual result: " + actualSongs);
        // Compare the actual and expected results using assertEquals
        assertEquals(actualSongs, expectedSongs);
    }

    @Test(priority = 3)
    public void testAddPlayedSongS2() {
    	 // Add five songs to the RecentlyPlayedStore for user1
        store.addPlayedSong("user1", "S1");
        store.addPlayedSong("user1", "S2");
        store.addPlayedSong("user1", "S3");
        store.addPlayedSong("user1", "S4");
        store.addPlayedSong("user1", "S2");
        // Define the expected result
        List<String> expectedSongs = Arrays.asList("S3", "S4", "S2");
        // Get the actual result
        List<String> actualSongs = store.getRecentlyPlayedSongs("user1");
        // Print the expected and actual results
        System.out.println("Expected result: " + expectedSongs);
        System.out.println("Actual result: " + actualSongs);
        // Compare the actual and expected results using assertEquals
        assertEquals(actualSongs, expectedSongs);
    }

    @Test(priority = 4)
    public void testAddPlayedSongS1() {
    	 // Add some songs to the user's recently played list
        store.addPlayedSong("user1", "S1");
        store.addPlayedSong("user1", "S2");
        store.addPlayedSong("user1", "S3");
        store.addPlayedSong("user1", "S4");
        store.addPlayedSong("user1", "S2");
        store.addPlayedSong("user1", "S1");

        // Define the expected and actual recently played song lists
        List<String> expectedSongs = Arrays.asList("S4", "S2", "S1");
        List<String> actualSongs = store.getRecentlyPlayedSongs("user1");

        // Print the expected and actual results for debugging purposes
        System.out.println("Expected result: " + expectedSongs);
        System.out.println("Actual result: " + actualSongs);

        // Assert that the actual recently played song list matches the expected list
        assertEquals(actualSongs, expectedSongs);
    }
}
