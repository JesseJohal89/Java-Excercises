import java.util.ArrayList;

/*
Java Exercise
Desert Island Playlist
Build Playlist.java with the best possible playlist of music using a Java ArrayList. Choose wisely.
*/

class Playlist {
  
  public static void main(String[] args) {

    //create new array;isy
   ArrayList<String> desertIslandPlaylist = new  ArrayList<String>();
   
   //8x items added to list
   desertIslandPlaylist.add("All Along the Watchtower");
   desertIslandPlaylist.add("Still D.R.E");
   desertIslandPlaylist.add("Blood Brother's");
   desertIslandPlaylist.add("Can't Stop");
   desertIslandPlaylist.add("The Bottle");
   desertIslandPlaylist.add("Feel Good Inc.");
   desertIslandPlaylist.add("Stairway to Heaven");
   desertIslandPlaylist.add("To Zanarkand");

   //print out all items within list
   System.out.println(desertIslandPlaylist);

   //check number of items in list
   System.out.println("number of items in list = " + desertIslandPlaylist.size());

   //removed items so list total = 5
   desertIslandPlaylist.remove("Still D.R.E");
   desertIslandPlaylist.remove("The Bottle");
   desertIslandPlaylist.remove("To Zanarkand");

   System.out.println(desertIslandPlaylist);
   System.out.println("number of items in list = " + desertIslandPlaylist.size());


   //swapping song order in list
   //printing index of songs to swap
   System.out.println(desertIslandPlaylist.indexOf("Blood Brother's"));
   System.out.println(desertIslandPlaylist.indexOf("Stairway to Heaven"));
    
  //creating variables to store index values
   int songSwapIndexA = desertIslandPlaylist.indexOf("Blood Brother's");
   int songSwapIndexB = desertIslandPlaylist.indexOf("Stairway to Heaven");

   //creating temp variables to store copy index values **note - can you use get here???**
   String tempA = "Blood Brother's";
   String tempB = "Stairway to Heaven";

   //Setting songs to their new positions
   desertIslandPlaylist.set(songSwapIndexA, tempB);
   desertIslandPlaylist.set(songSwapIndexB, tempA);

  System.out.println(desertIslandPlaylist);

  }
  
}
