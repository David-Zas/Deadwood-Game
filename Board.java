public class Board{
    //ATTRIBUTES
    private Player[] players;
    private Card[] cardsOnBoard;
    private Room[] sets;

    //CONSTRUCTORS
    public Board(Player[] players, Card[] cardsOnBoard, Room[] sets){
        this.players = players;
        this.cardsOnBoard = cardsOnBoard;
        this.sets = sets;

    }
    public Board(){}
    
    //SETTERS
    public void setPlayers(Player[] players){   
        this.players = players;
    }

    public void setCardsOnBoard(Card[] cardsOnBoard){
        this.cardsOnBoard = cardsOnBoard;
    }

    public void setRooms(Room[] sets){
        this.sets = sets;
    }

    //GETTERS
    public Player[] getPlayers(){
        return this.players;
    }

    public Card[] getCardsOnBoard(){
        return this.cardsOnBoard;
    }

    public Room[] getRooms(){
        return this.sets;
    }

    //METHODS
    /*
    replenishShotCounters(): DONE
        sets all rooms to max shot counters
    */
    public void replenishShotCounters(){
        for(int i = 0;i < sets.length;i++){
            sets[i].setNumShotCounters(sets[i].getMaxShotCounters());
        }
    }
    /*
    replenishCards(): DONE
        throws away last card and refills with new ones from
        the availible deck located in the card class
        returns: 
        NOTE: must update availible deck once this is called in the manager class?
    */
    /*public void replenishCards(Manager system){
        Card availibleDeck[] = system.getAvailibleDeck();
        for(int i = 0; i < sets.length;i++){
            this.sets[i] = availibleDeck[i];
        }
    }
    /*
    movePlayer(): DONE
        moves player to chosen adj. room
    */
    public void movePlayer(Room adjRoomOfChoice, Player player){
        player.setLocation(adjRoomOfChoice);
    }
    /*
    flipCard(): DONE
        flips the card
    */
    public void flipCard(Card card){
        card.setFlipped(true);
    }
    /*
    /*
    upgradeRank(): DONE
        upgrades the players rank
    */
    public void upgradeRank(int newRank, Player player){
        player.setRank(newRank);
    }
    
    /*
	 * 
	 * chooseTurns():DONE
	 * This method will create an array playerOrder
	 * playerOrder will be of size of number of players
	 * Each player will roll a die and the value will be stored in playerOrder
	 * Sort the array, then reversely sort it to indicate the player order
     * 
     * CHANGE TO REARANGE THE ACTUAL PLAYER ARR 
	 */

	/*public int[] chooseTurns() {

		// for each player, have them roll a dice
		// store each roll in players[]
		int[] playerOrder = new int[this.numPlayers];

		for (int i = 0; i < this.numPlayers; i++) {
			playerOrder[i] = chooseTurnsRoll();
		}

		// sort the array in ascending order
		Arrays.sort(playerOrder);

		// manually sorted array in reverse order
		for (int i = 0; i < playerOrder.length / 2; i++) {
			int tmp = playerOrder[i];
			playerOrder[i] = playerOrder[playerOrder.length - i - 1];
			playerOrder[playerOrder.length - i - 1] = tmp;
		}

		return playerOrder;
    } */
     
}