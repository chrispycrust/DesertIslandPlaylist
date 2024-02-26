import java.util.ArrayList;
import java.util.Random;

public class DesertIslandPlaylist {

	//methods
	
	public static void reportPlaylist(ArrayList<String> list) {
		System.out.println("Songs in current playlist: " + list);
	}
	
	public static void removeSongs(ArrayList<String> list, int songNumber) {
		
		System.out.println();
		System.out.println("Deleting extra songs...");

	    if (songNumber > 5) {	
	    	
	      int i = songNumber - 1;
	      
	      while (i != 4) {
	    	list.remove(i);
	        i--;   
	        System.out.println("Deleted: " + list.get(i));
	      }
	      
	    } else {
	      System.out.println("Perfect playlist length - nothing to remove");
	    }
	}
	
	
	public static void randomiseSongs(ArrayList<String> list, int songNumber) {
		
		songNumber -= 1;
		
		Random rand = new Random();
	    int song1 = rand.nextInt(songNumber);
	    int song2 = rand.nextInt(songNumber);
	    
	    if (song1 == song2) {
	    	System.out.println("Song " + song1 + " is same as song " + song2);
			System.out.println("searching for another song to swap...");
	    	randomiseSongs(list, songNumber);
	    } else {
	    	swapSongs(list, song1, song2);
	    }
	    
	}
	
	public static void swapSongs(ArrayList<String> list, int song1, int song2) {
		
		String valueA = list.get(song1);
		String valueB = list.get(song2);
		
		System.out.println("Swapping song " + (song1 + 1) + ": " + valueA + " and song " + (song2 + 1) + ": " + valueB);
		
		list.set(song1, valueB);
		list.set(song2, valueA);
		
		System.out.println(list);
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
		
		reportPlaylist(desertIslandPlaylist);
		
	    desertIslandPlaylist.add("Water ~ Tyla");
	    desertIslandPlaylist.add("Cry Me A River ~ Justin Timberlake");
	    desertIslandPlaylist.add("Enter Sandman ~ Metallica");
	    desertIslandPlaylist.add("Wildest Dreams ~ Taylor Swift");
	    desertIslandPlaylist.add("Hotter Than Hell ~ Dua Lipa");
	    desertIslandPlaylist.add("That Don't Impress Me Much ~ Shania Twain");
	    desertIslandPlaylist.add("Yes And ~ Ariana Grande");

	    reportPlaylist(desertIslandPlaylist);

	    int songNumber = desertIslandPlaylist.size();
	    
	    System.out.println();
	    System.out.println("Number of extra songs: " + (songNumber - 5));
	    
	    removeSongs(desertIslandPlaylist, songNumber);
	    
	    System.out.println();
		System.out.println("Randomising songs...");
	    randomiseSongs(desertIslandPlaylist, songNumber);
	    
	}

}
