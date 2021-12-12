public class Banker{

    //ATTRIBUTES
    private int numDollars;
    private int numCredits;

    // CONSTRUCTORS
    public Banker(){}
    public Banker(int numDollars, int numCredits){
        this.numDollars = numDollars;
        this.numCredits = numCredits;
    }
    
    // SETTERS
    public void setDollars(int numDollars){
        this.numDollars = numDollars;
    }

    public void setCredits(int numCredits){
        this.numCredits = numCredits;
    }

    // GETTERS
    public int getDollars(){
        return numDollars;
    }

    public int getCredits(){
        return numCredits;
    }

    /*  METHODS  */
    /*
    hasSufficientFunds: DONE
        takes in a player a rank that the player wishes to upgrade to and a string
        that tells the method what type of currency the player wishes to use
        
        RETURNS: true if player has enough of requested currency to upgrade to requested rank
            and returns false if they do not 
    */
    public boolean hasSufficientFunds(Player player, int rank, String currency){
        if(currency.equals("dollars")){
            if(rank == 2 && player.getDollars() >= 4){
                return true;
            }else if(rank == 3 && player.getDollars() >= 10){
                return true;
            }else if(rank == 4 && player.getDollars() >= 18){
                return true;
            }else if(rank == 5 && player.getDollars() >= 28){
                return true;
            }else if(rank == 6 && player.getDollars() >= 40){
                return true;
            }
        }else if(currency.equals("credits")){
            if(rank == 2 && player.getCredits() >= 5){
                return true;
            }else if(rank == 3 && player.getCredits() >= 10){
                return true;
            }else if(rank == 4 && player.getCredits() >= 15){
                return true;
            }else if(rank == 5 && player.getCredits() >= 20){
                return true;
            }else if(rank == 6 && player.getCredits() >= 25){
                return true;
            }            
        }
        return false;
    }
    /*
    awardPlayer(): DONE
        awards the player with specified amount of dollars
        and or credits
        NOTE: must specify logic for how many credits/dollars awarded in 
        controller class
    */
    public void awardPlayer(int dollars, int credits, Player player){
        player.setCredits(player.getCredits() + credits);
        player.setDollars(player.getDollars() + dollars);
    }
    public int bill(String currency, int rank, Player player){
        int bill = 0;
        if(currency.equalsIgnoreCase("dollars")){
            if(rank == 2){
                bill = 4;
            }else if(rank == 3 ){
                bill = 10;
            }else if(rank == 4 ){
                bill = 18;
            }else if(rank == 5 ){
                bill = 28;
            }else if(rank == 6 ){
                bill = 40;
            }
        }else if(currency.equalsIgnoreCase("credits")){
            if(rank == 2 && player.getCredits() >= 5){
                bill = 5;
            }else if(rank == 3 ){
                bill = 10;
            }else if(rank == 4 ){
                bill = 15;
            }else if(rank == 5){
                bill = 20;
            }else if(rank == 6 ){
                bill = 25;
            }            
        }
        return bill;
    }
    /*
    collectMoney(): DONE
        subtracts specified amount of dollars
        and or credits from players bank
        NOTE: must specify logic for how many credits/dollars collected in 
        controller class
    */
    public void collectMoney(int dollars, int credits, Player player){
        player.setCredits(player.getCredits() - credits);
        player.setDollars(player.getDollars() - dollars);        
    }
}