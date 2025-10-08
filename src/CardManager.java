import java.util.Random;

public class CardManager {
    String[] deckOfCards = { "Ace Spades", "2 Spades", "3 Spades", "4 Spades", "5 Spades", "6 Spades", "7 Spades", "8 Spades", "9 Spades", "10 Spades", "Jack Spades", "Queen Spades", "King Spades", "Ace Hearts", "2 Hearts", "3 Hearts", "4 Hearts", "5 Hearts",
            "6 Hearts", "7 Hearts", "8 Hearts", "9 Hearts", "10 Hearts", "Jack Hearts", "Queen Hearts", "King Hearts", "Ace Clubs", "2 Clubs", "3 Clubs", "4 Clubs", "5 Clubs", "6 Clubs", "7 Clubs", "8 Clubs", "9 Clubs", "10 Clubs", "Jack Clubs", "Queen Clubs", "KingClubs", "Ace Diamonds", "2 Diamonds", "3 Diamonds", "4 Diamonds", "5 Diamonds",
            "6 Diamonds", "7 Diamonds", "8 Diamonds", "9 Diamonds", "10 Diamonds", "Jack Diamonds", "Queen Diamonds", "King Diamonds" };
    int[] values = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8,
            9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7,
            8, 9, 10, 10, 10, 10 };

    Card[] cards= new Card[52];

        public CardManager(){
            for (int i=0; i<deckOfCards.length;i++){
                    cards[i]= new Card(deckOfCards[i],values[i],false);
            }
        }
    public Card deal(){
        Random number = new Random();

        int attempts = 0;
        int maxAttempts = cards.length;

        while (attempts < maxAttempts) {
            int randomNumber1 = number.nextInt(cards.length);

            if (!cards[randomNumber1].dealCard) {
                cards[randomNumber1].dealCard = true;
                return cards[randomNumber1];
            }

            attempts++;
        }
        return null;
    }


}
