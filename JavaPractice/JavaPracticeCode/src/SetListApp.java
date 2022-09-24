//Set List.
/* 
 * main:
 * requests user input.
 * if user input is blank, print random song title.
 * if user input is not blank, add song title to the list.
 * loop back to beginning.
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class SetListApp {
    public static void main(String[] args){
        ArrayList<String> knownSongs = new ArrayList<String>();
        Scanner newSong = new Scanner(System.in);
            for ( ; ; ){
            String song = newSong.nextLine();
            switch (song) {
                case "":
                System.out.println(knownSongs.get(0 + 1));               //??? Try this.
                break;
                default:
                System.out.println("uhhhh");
                knownSongs.add(song);
                System.out.println(knownSongs.size());
                System.out.println(knownSongs.get(0));
                break;
            }
        }
    }
}



//prevent user from adding songs more than once.
//implement removing songs.