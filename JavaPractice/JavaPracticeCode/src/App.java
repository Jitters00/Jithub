import java.util.Scanner;

public class App {
    public static Scanner purpose;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!  What is my purpose?");
            purpose = new Scanner(System.in);
            String meaning = purpose.nextLine();
            System.out.println("I've always wanted " + meaning);
    }
}
