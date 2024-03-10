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

        blackBox.add(40); //add C
        blackBox.add(40); //add o
        blackBox.add(40); //add N
        blackBox.add(40); //add n
        blackBox.add(40); //add E
        blackBox.add(40); //add r
        blackBox.add(40); //add Y
        blackBox.add(40); //add u
        blackBox.add(40); //add L
        blackBox.add(40); //add e

    }

    public void hashGen(String userText){

        int txtLength = userText.length();
        for (int i = 0; i < txtLength; i++) { //goes over every char in userTxt
            int amountUp = (int)userText.charAt(i);
            for (int j = 0; j < amountUp; j++) { //the count for the char ascii value
                for (int k = 0; k < blackBox.size(); k++) {// goes to each of the elements and counts up
                    int placeHold = blackBox.get(k);
                    placeHold++;
                    amountUp--;
                    if (placeHold > 126){
                        placeHold = 33;
                    }
                    blackBox.set(k,placeHold);
                }
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
