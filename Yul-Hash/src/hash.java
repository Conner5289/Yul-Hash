import java.util.ArrayList;
import java.util.Arrays;

public class hash {
private final ArrayList<Integer> blackBox = new ArrayList<>();

    public hash(){ //Constructor for default key CoNnErYuLe
        blackBox.add(67);
        blackBox.add(111);
        blackBox.add(78);
        blackBox.add(110);
        blackBox.add(69);
        blackBox.add(114);
        blackBox.add(89);
        blackBox.add(117);
        blackBox.add(76);
        blackBox.add(101);

    }

    public  hash(String userKey){ //Constructor if the user wants their own private key
        int keyLength = userKey.length();
        char charToAdd;
        int charToInt;
        for (int i = 0; i < keyLength; i++) {
            charToAdd = userKey.charAt(i);
            charToInt = charToAdd;
            blackBox.add(charToInt); //get char form userKey cast it to in then adds it to array list blackBox
        }
    }

    public void hashGen(String userText){
        int txtLength = userText.length();
        int lengthOfArray = blackBox.size() - 1;
        int offset = 0;
        int indexOf = 0;
        int holderVal;

        for (int charOfString = 0; charOfString < txtLength; charOfString++){//main for loop to go over every char of user text
            if (offset > lengthOfArray){ //offset so that the main loop walks through arraylist. First char is at index one of the arraylist, second char is at index 1.
                offset = 0; //until offset equals lengthOfArray then get sets back down to zero.
            }
            int rounds = userText.charAt(charOfString);//tells the while loop how many times to go through
            indexOf = indexOf + offset;
            while (rounds > 0){ //tells which index of the arraylist to access
               if (indexOf > lengthOfArray){
                   indexOf = 0;
               }

                holderVal = blackBox.get(indexOf);
                holderVal++;
                blackBox.set(indexOf,holderVal);
                rounds--;
                indexOf++; //Somewhat main part of the program, just gets a value increase its by one then puts it back.

            }
            offset++; //increase the offset so the next while loop will start at the next index.
        }

    }

    public String hashDisplay(){ //turns the stored decimal ascii value into a hex value then prints it out to the screen
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < blackBox.size(); i++) {
            int preHexVal = blackBox.get(i);
            while (preHexVal > 255){
                preHexVal -= 255;
            }
            String hexVal = Integer.toHexString(preHexVal);
            finalString.append(hexVal.toUpperCase());

        }
        return finalString.toString();
    }







}
