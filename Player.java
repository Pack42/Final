import java.util.ArrayList;

/**
 * This class creates a Player. PLayer has 2 Card objects in their hand.
 * Player starts with 50 chips.
 */
public class Player {
    private ArrayList<Card> hand;
    private int chips;
    private String name;
    private boolean computer;
    private int chipsInPot;
    private boolean fold;
    public Player(String name, int chips){
        this.name = name;
        this.chips = chips;
        this.hand = new ArrayList<>();
        this.chipsInPot = 0;
        this.fold = false;
    }

    /**
     * This method add a Card to a players hand.
     * @param x A Card object
     */
    public void addToHand(Card x){
        this.hand.add(x);
    }

    /**
     * This method returns a player's hand
     * @return ArrayList<Card> hand
     */
    public ArrayList<Card> getHand(){
        return this.hand;
    }

    /**
     * This method returns the number of chips a player has.
     * @return int number of chips
     */
    public int getChips() {
        return this.chips;
    }

    /**
     * This method is used to get a player's name
     * @return String player's name
     */
    public String getName(){
        return this.name;
    }

    /**
     * This method is used to get the number of chips in the pot.
     * @return int the number of chips
     */
    public int getChipsInPot(){return this.chipsInPot;}

    /**
     * This method gets the 1st card in a player's hand.
     * @return A Card object within the hand Arraylist.
     */
    public Card getCard1() {
        return this.hand.get(0);
    }

    /**
     * This method gets the 2nd card in a player's hand.
     * @return A Card object within the hand Arraylist.
     */
    public Card getCard2() {
        return this.hand.get(1);
    }

    public boolean isFold() {return fold;}

    public void setChips(int chips) {this.chips = chips;}

    public void setFold(boolean fold) {this.fold = fold;}

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setChipsInPot(int chipsInPot) {
        this.chipsInPot = chipsInPot;
    }

    /**
     * This method is used to tell whether a player is the user or if the player is the computer.
     * @return boolean true if computer/ false if user
     */
    public boolean isComputer() {
        if(getName().equalsIgnoreCase("Computer")){
            computer = true;
        }
        return computer;
    }
}

