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
import java.util.Random;

public class SetListApp {
    public static void main(String[] args){
        ArrayList<String> knownSongs = new ArrayList<String>();
        Scanner newSong = new Scanner(System.in);
        Random randomNumber = new Random();
            for ( ; ; ){
            String song = newSong.nextLine();
            switch (song) {
                case "":
                System.out.println(knownSongs.get(randomNumber.nextInt(knownSongs.size())));
                break;
                default:
                knownSongs.add(song);
                System.out.println(knownSongs.size());
                break;
            }
        }
    }
}



//prevent user from adding songs more than once.
//implement removing songs.