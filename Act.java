import java.util.*;
public class Act{
    //ATTRIBUTES
    private Player curActingPlayer;
    private Card scene;
    private Room curRoom;
    private Role curRole;
    // ADD ON AND OFF THE CARD 

    //CONSTRUCTORS
    public Act(){}
    public Act(Player curActingPlayer, Card scene, Room curRoom, Role curRole){
        this.curActingPlayer = curActingPlayer;
        this.scene = scene;
        this.curRoom = curRoom;
        this.curRole = curRole;
    }
    
    //SETTERS
    public void setCurActingPlayer(Player curActingPlayer){
        this.curActingPlayer = curActingPlayer;
    }

    public void setScene(Card scene){
        this.scene = scene;
    }

    public void setCurRoom(Room curRoom){
        this.curRoom = curRoom;
    }

    public void setCurRole(Role curRole){
        this.curRole = curRole;
    }

    //GETTER
    public Player getCurActingPlayer(){
        return this.curActingPlayer;
    }

    public Card getScene(){
        return this.scene;
    }

    public Room getCurRoom(){
        return this.curRoom;
    }

    public Role getCurRole(){
        return this.curRole;
    }
    
    /*      METHODS       */
    
    /*rollDice():  DONE
        spits out a random int from 1-6
    */
    public int rollDice(){
        int roll = (int)Math.floor((Math.random()*6) + 1);
        return roll;
    }   
    /*
    rollMoneyDice():  DONE
        if last shotcounter has been beat this method
        will be called and sorts the 6 dice and 
        distrubutes accordingly
        NOTE:
            may return array of size 2 or 3 depending 
            on the card beat
     */  
    public int[] rollMoneyDice(Room room, Card card){
       
    	// number of moneyDie rolled will equal the budget of the card
    	int[] moneyDie = new int[card.getBudget()];
    	
    	//number of die rolled will be equal to the budget of the card
    	for(int i = 0; i < card.getBudget(); i++) {
    		moneyDie[i] = (int)Math.floor((Math.random()*6) + 1);
        }
    	
    	// sort array
    	Arrays.sort(moneyDie, 0, moneyDie.length);
    	
    	// size of numRoles[] will equal numRoles on card
    	int[] numRoles = new int[card.getNumRoles()];
    	int j = 0; // counter
    	
    	// insert elements of moneyDie[] into a[] in reverse order
    	for(int i = moneyDie.length-1; i >= 0; i--) {
    		// if array reaches end, reset index to 0
    		if(j == card.getNumRoles()) {
    			j = 0;
    		}
    		numRoles[j] += moneyDie[i];
    		j++;
    	}
    	
    	// have to reverse numRoles[], since moneyDie[] elements 
    	// were inserted into numRoles[] in reverse order
    	for(int i = 0; i < numRoles.length/2; i++) {
    		int tmp = numRoles[i];
    		numRoles[i] = numRoles[numRoles.length -i -1];
    		numRoles[numRoles.length -i-1] = tmp;
    	}
    	 return numRoles;
    }
    /*
    beatCard():  DONE
        RETURNS: true if no shotcounters on the set
            false if there is shotcounters on the set
    */
    public boolean beatCard(Room room){      
    	if(room.getNumShotCounters() == 0){
    		return true;
    	}
    	return false;
    }
}

