import java.util.Scanner;
public class HWnov2 {
    public static void main(String[] args){
        guessingGame();
    }
    public static void guessingGame(){
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number 1-100");
        boolean guessed = false;
        int upper = 100;
        int lower = 1;
        while(!guessed){
            System.out.println("Is your number higher, lower, or equal to " + (upper+lower)/2 + "?");
            String ans = in.next();
            if(ans.equals("higher")){
                lower = (upper+lower)/2;
            } else if(ans.equals("lower")){
                upper = (upper+lower)/2;
            }else if(ans.equals("equal")){
                System.out.println("Number "+(upper+lower)/2+" guessed!");
                guessed = true;
            } else {
                System.out.println("(please answer by typing the word \"higher\", \"lower\", or \"equal\")");
            }
        }
    }
}
