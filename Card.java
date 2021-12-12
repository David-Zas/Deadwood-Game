import java.util.ArrayList;
public class Card{
   
    //ATTRIBUTES
    private String name;
    private String cardImg;
    private int sceneNum;
    private String description;
    private int budget;
    private boolean flipped = false;  
    private int numRoles;
    private ArrayList<Role> roles;
   
 
    //CONSTRUCTORS
    public Card(){}
    public Card(String name, String cardImg, int sceneNum, String description, int budget, int numRoles, ArrayList<Role> roles){
        this.name = name;
        this.cardImg = cardImg;
        this.sceneNum = sceneNum;
        this.description = description;
        this.budget = budget;
        this.numRoles = numRoles;
        this.roles = roles;
    }
 
    // SETTERS
    public void setName(String name){
        this.name = name;
    }
    public String getCardImg() {
        return cardImg;
    }
    public void setSceneNum(int sceneNum) {
        this.sceneNum = sceneNum;
    }
    public void setCardImg(String cardImg) {
        this.cardImg = cardImg;
    }
    public void setDescription(String description){
        this.description = description;
    }
 
    public void setBudget(int budget){
        this.budget = budget;
    }
 
    public void setFlipped(boolean flipped){
        this.flipped = flipped;
    }
    public void setNumRoles(int numRoles) {
        this.numRoles = numRoles;
    }
    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }
 
   
    // GETTERS
    public String getName(){
        return this.name;
    }
 
    public String getDescription(){
        return this.description;
    }
 
    public int getBudget(){
        return this.budget;
    }
   
    public int getSceneNum() {
        return sceneNum;
    }
 
    public boolean getFlipped(){
        return this.flipped;
    }
   
    public int getNumRoles() {
        return this.numRoles;
    }
    public ArrayList<Role> getRoles(){
        return this.roles;
    }

    }

