public class Main {
    public static void main(String[] args) {
        CardManager dealer= new CardManager();
        Card c = dealer.deal();
            System.out.println(c.getDetails());

    }
}