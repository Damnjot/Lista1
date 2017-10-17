import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int typeOfDeck=0;
        System.out.println("Enter the type of deck: ");
        boolean isCorrect = false;

        while(!isCorrect) {
            try {
                typeOfDeck = Integer.parseInt(data.nextLine());
                if ((typeOfDeck == 24) || (typeOfDeck == 32) || (typeOfDeck == 52)) isCorrect = true;
                else System.out.println("This kind of deck doesn't exist.  Enter the correct type");
            } catch (NumberFormatException n) { System.out.println("Uncorrect data! " +
                    "\n Enter the correct type of deck ");
            }
        }
        Deck deck = new Deck(typeOfDeck);

        System.out.println("\nYour deck:\n");
        deck.write(typeOfDeck);
        System.out.println("\nCard from the top of deck\n");
        System.out.println(deck.cardOnTheTop().rank + " " + deck.cardOnTheTop().suit);
        System.out.println("\nYour deck after shuffling:\n");
        deck.shuffle(typeOfDeck);
        deck.write(typeOfDeck);
        System.out.println("\nCard from the top of deck\n");
        System.out.println(deck.cardOnTheTop().rank + " " + deck.cardOnTheTop().suit);
        System.out.println("\nYour deck sorted again:\n");
        deck.sort(typeOfDeck);
        deck.write(typeOfDeck);
        System.out.println("Konflikt na GitHubie");
    }
}
