import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //This code will display a list of meals based on the list of ingredients provided by the user.
        /* 
         * main:
         * user inputs ingredients
         * input ingredients into an array which is cleared each time the app is used
         * the tempArray is compared against meal and side arrays.
         * once all conditions for a entre or side are met, they are displayed.
         * 
         * class:
         * user enters necessary ingredients into arrays for meals and sides
         * input name of array
         * input ingredients
         * break operation
         */
        Scanner menuSelect = new Scanner(System.in);
        System.out.println("Ingredients [I] or New Recipe [N]");
        String selection = menuSelect.nextLine();
        
        if (selection == "N") {
            Scanner userFood = new Scanner(System.in);
            //Use scanner to fill recipe array.
        } else if (selection == "I") {
            //ingredient list loop.
        } else {
            System.out.println("error");
        }
    }
}
