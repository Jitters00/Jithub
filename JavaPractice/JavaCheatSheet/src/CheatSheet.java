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
        System.out.println("System.out.print returns values on the same line:");
        System.out.print(a + " ");  
        System.out.print(b + " ");  //print will print variables on the same line.  Println includes a line break at the end of its output.
        System.out.println(c + " "); //Note the spaces.
        System.out.println(isTrue);

        int[] myNumbers = {1, 2, 3}; //Makes an array.
        String[] myCharacters = {"Jack", "Bob", "Tim"};
        System.out.println(myCharacters[0] + " " + myNumbers[2]); //Access the variables in your array like this, starting with 0.
    } 
}
