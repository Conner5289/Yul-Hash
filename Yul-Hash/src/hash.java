import java.util.ArrayList;

public class hash {
private final ArrayList<Integer> blackBox = new ArrayList<>();

    public hash(){
        blackBox.add(67); //add C
        blackBox.add(111); //add o
        blackBox.add(78); //add N
        blackBox.add(110); //add n
        blackBox.add(69); //add E
        blackBox.add(114); //add r
        blackBox.add(89); //add Y
        blackBox.add(117); //add u
        blackBox.add(76); //add L
        blackBox.add(101); //add e

    }

    public void hashGen(String userText){
        int txtLength = userText.length();
        int offset = 0;
        for (int charOfString = 0; charOfString < txtLength; charOfString++){
            int totalPlus = 0;
            if (offset > 9){
                offset = 0;
            }
            int rounds = userText.charAt(charOfString);

            totalPlus = totalPlus + offset;
            while (rounds > 0){
               if (totalPlus > 9){
                   totalPlus = 0;
               }

                int holderVal;
                holderVal = blackBox.get(totalPlus);
                holderVal++;
                blackBox.set(totalPlus,holderVal);
                rounds--;
                totalPlus++;

            }
            offset++;
        }

    }

    public  void hashDisplay(){
        for (int i = 0; i < blackBox.size(); i++) {
            String hexVal = Integer.toHexString(blackBox.get(i));
            System.out.print(hexVal);
        }
    }







}
