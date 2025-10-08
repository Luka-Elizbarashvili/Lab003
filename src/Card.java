public class Card {
    String name;
    int value;
    boolean dealCard;

    public  Card(String name,int value,boolean dealCard){
        this.name=name;
        this.value=value;
        this.dealCard =dealCard;
    }

    public String getDetails(){
        return "The card is "+name+" and the value is "+value;
    }
}