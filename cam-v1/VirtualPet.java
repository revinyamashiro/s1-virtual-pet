/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    private int hunger = 0;   // how hungry the pet is.
    private int tiredness = 0;
    private int score = 0;
    private int oppScore = 0;
    private String name;
    
    // constructor
    public VirtualPet(String name) {
        this.name = name;
        face = new VirtualPetFace();
        // face.setImage("normal");
        face.setMessage("Welcome to the biggest basketball game of the Century! We have " + name + " vs. Mr. Morris");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");

        if(tiredness < 4){
            face.setMessage("That was great!");
            face.setImage("ecstatic");
        }
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void make(){
        int shot = (int)(Math.random()*3)+2;
        if(shot == 3){
        score = score + 3;
        face.setMessage("3-point Swish! The score is now: " + score + " - " + oppScore);
        face.setImage("swish");
        }
        else{
            score = score + 2;
        face.setMessage("2-point Splash! The score is now: " + score + " - " + oppScore);
        face.setImage("swish");
        }
    }

    public void oppMake(){
        int shot = (int)(Math.random()*3)+2;
        if(shot == 3){
        oppScore = oppScore + 3;
        face.setMessage("3-point Swish! The score is now: " + score + " - " + oppScore);
        face.setImage("swish");
        }
        else{
            oppScore = oppScore + 2;
        face.setMessage("2-point Splash! The score is now: " + score + " - " + oppScore);
        face.setImage("swish");
        }
    }

    public void block(){
        face.setMessage("I've got you now!...Blocked by " + name + "!");
        face.setImage("block");
    }

    public void oppBlock(){
        face.setMessage("I've got you now!...Blocked by Mr. Morris!");
        face.setImage("block");
    }

    public void dunk(){
        score = score + 2;
        face.setMessage("Slam Dunk! The score is now: " + score + " - " + oppScore);
        face.setImage("dunk");
    }

    public void dribble(){
        face.setMessage(name + " is dribbling up the court!");
        face.setImage("dribble");
    }

    public void oppDribble(){
        face.setMessage("Mr. Morris is dribbling up the court!");
        face.setImage("dribble");
    }

    public void steal(){
        face.setMessage("Stolen by Mr. Morris!");
        face.setImage("steal");
    }

    public void shot(){
        face.setMessage(name + " with the shot!");
        face.setImage("shot");
    }

    public void oppShot(){
        face.setMessage("Mr. Morris with the shot!");
        face.setImage("shot");
    }

    public void winner(){
        if(score > oppScore){
            face.setMessage(name + " wins " + score + " - " + oppScore + "!");
            face.setImage("win");
        }
        else{
            face.setMessage("Mr. Morris wins " + score + " - " + oppScore + "!");
            face.setImage("win");
        }
    }

    public void newGame(){
        score = 0;
    }

} // end Virtual Pet
