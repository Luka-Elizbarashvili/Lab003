import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Card> cards;
    int totalScore;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
        this.totalScore = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
        totalScore += card.value;
    }

    public void showCards() {
        System.out.println(name + "'s cards:");
        for (Card card : cards) {
            System.out.println(card.getDetails());
        }
    }

    public int getTotalScore() {
        return totalScore;
    }
}
