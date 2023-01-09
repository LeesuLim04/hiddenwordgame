import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a hidden word");
        String hidden = kb.nextLine().toUpperCase();
        String guess = "";

        do {
            System.out.println("Guess the hidden word");
            guess = kb.nextLine().toUpperCase();
            for (int i = 0; i < guess.length(); i++) {
                String hint = "";
                if (guess.substring(i, i + 1).equals(hidden.substring(i, i + 1))) {
                    System.out.print(guess.substring(i, i + 1));
                } else if (hidden.indexOf(guess.substring(i, i + 1)) > -1) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
            while (!guess.equals(hidden));
                System.out.println("Correct!");
        }
    }

