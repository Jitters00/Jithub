public class CheatSheet {
    public static void main(String[] args) throws Exception {
        //variables
        int a = 2;
        double b = 3.333;
        String c = "Words."; //Remember to capitalize "String"
        Boolean isTrue = true; //Same here
        int emptyValue; //Declared without a value assigned.
        System.out.println("Use this to print to terminal");
        System.out.println(a + b);
        System.out.println(isTrue);
        System.out.println("You could print " + a + " and " + b + " like this.  Or with System.out.print");
        System.out.println("System.out.print without println returns values on the same line (remember to include spaces):")
        System.out.print(a, " ");  //System.out.print will print stuff on the same line.  Println prints everything on a new line.
        System.out.print(b, " ");
        System.out.print(c, " ");
        System.out.print(isTrue " ");

        /* There are lots of different variables for different sizes of data.
        Long is a datatype that holds huge numbers, but is kind of the same as a double
        (which doesn't hold as much as long).  Int and Double are the most common, I'm told.*/

        System.out.println()
        int[] myNumbers = {1, 2, 3}; //Makes an array.
        char[] myCharacters = {a, b, c, d};
        System.out.println(myCharacters[0], myNumbers[2]); //Access the variables in your array like this, starting with 0.
    } 
}
