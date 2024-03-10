import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    hash main = new hash();
    Scanner scnr = new Scanner(System.in);

    String userText;

    System.out.println("What is it you want to hash?");
    userText = scnr.next();

    main.hashGen(userText);

    main.hashDisplay();





    }
}
