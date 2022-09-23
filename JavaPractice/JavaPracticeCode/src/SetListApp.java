import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        //Set List.
        /* 
         * main:
         * write random line from list.
         * add new lines to list.
         * link lines to websites.
         * 
         * import scanner.
         * import array list.
         * while loop < 1 {
         * write line from array list.
         * request user input.
         * add user input to array list.
         * ++loop.
         * }
         * on press, --loop.  This one might have to be contained in some other sort of loop so the program doesn't end.
         */
        Scanner newSong = new Scanner(System.in);
        ArrayList<String> knownSongs = new ArrayList<String>();
        int runCondition;

        String song = newSong.nextLine();
        if (song = "") {
            while (song = "") {
                System.out.println(knownSongs.get(0)); //print song title.  There's likely a need for more code here. math.random wont cut it.
            }
        }
        else {
            knownSongs.add(song); //add song
        }
    }
}

//prevent user from adding songs more than once.
//implement removing songs.