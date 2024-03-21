import javax.swing.*;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
        String defaultKeyYes;
        String userKey;
        String userText;
        String yesNo;
        boolean keepGoing = true;

        hash mainHash;
        Scanner scnr = new Scanner(System.in);
        guiForm myFrame = new guiForm();
        myFrame.setVisible(true);
        myFrame.setSize(500,500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        while (keepGoing) {
            System.out.println("Do you want to use the default private key y/n?");
            defaultKeyYes = scnr.next();
            if (defaultKeyYes.equalsIgnoreCase("y")){
                mainHash = new hash();
            }else{
                System.out.println("What is your private key?");
                userKey = scnr.next();
                mainHash = new hash(userKey);
            }

            System.out.println("What is it you want to hash?");
            userText = scnr.next();

            mainHash.hashGen(userText);
            System.out.println("Your hash ");
            mainHash.hashDisplay();


            System.out.println("Do you want to do another hash?(y/n)");
            yesNo = scnr.next().toLowerCase();
            if (yesNo.equals("n")){
                keepGoing = false;
            }
        }
    }
}