import java.util.ArrayList;

public class hash {
private ArrayList<Integer> blackBox = new ArrayList<>();

    public hash(){
//        blackBox.add(67); //add C
//        blackBox.add(111); //add o
//        blackBox.add(78); //add N
//        blackBox.add(110); //add n
//        blackBox.add(69); //add E
//        blackBox.add(114); //add r
//        blackBox.add(89); //add Y
//        blackBox.add(117); //add u
//        blackBox.add(76); //add L
//        blackBox.add(101); //add e

        blackBox.add(0); //add C
        blackBox.add(0); //add o
        blackBox.add(0); //add N
        blackBox.add(0); //add n
        blackBox.add(0); //add E
        blackBox.add(0); //add r
        blackBox.add(0); //add Y
        blackBox.add(0); //add u
        blackBox.add(0); //add L
        blackBox.add(0); //add e

    }

    public void hashGen(String userText){
        int txtLength = userText.length();
        for (int i = 0; i < txtLength; i++) {
            int rounds = userText.charAt(i);
            int j = 0;
            final int NUMBER_OF_OUTPUTS = 9; // do n - 1 for n being the number of output you want
            while (rounds > 0){
                if (j > 9){
                    j = 0;
                }
            int holderVal;
            holderVal = blackBox.get(j);
            holderVal++;
            blackBox.set(j,holderVal);
            rounds--;
            j++;

            }
        }









    }

    public  void hashDisplay(){
        for (int i = 0; i < blackBox.size(); i++) {
            int j = blackBox.get(i);
            char y = (char)j;
            System.out.print(j + " ");
        }
    }







}
