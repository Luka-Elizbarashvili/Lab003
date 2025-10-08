public class Main {
    public static void main(String[] args) {
        CardManager manager = new CardManager();
        Player player1 = new Player("Bob");
        Player player2 = new Player("John");


        player1.addCard(manager.deal());
        player2.addCard(manager.deal());
        player1.addCard(manager.deal());
        player2.addCard(manager.deal());


        player1.showCards();
        player2.showCards();
        System.out.println("Total score of "+ player1.name+" is " + player1.getTotalScore());
        System.out.println("Total score of "+player2.name +" is "+ player2.getTotalScore());

        if(player1.getTotalScore()>player2.getTotalScore()){
            System.out.println("The winner is "+player1.name);
        } else if (player1.getTotalScore()<player2.getTotalScore()) {
            System.out.println("The winner is "+player2.name);
        }else{
            System.out.println("It is a tie ");
        }
    }
}