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
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
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
        face.setMessage("3-point Swish! The score is now: " + score);
        face.setImage("swish");
        }
        else{
            score = score + 2;
        face.setMessage("2-point Splash! The score is now: " + score);
        face.setImage("swish");
        }
    }

    public void block(){
        face.setMessage("I've got you now!...Blocked!");
        face.setImage("block");
    }

    public void dunk(){
        score = score + 2;
        face.setMessage("Slam Dunk! The score is now: " + score);
        face.setImage("dunk");
    }

    public void dribble(){
        // face.setMessage("Player 1 is dribbling up the court!");
        // int steal = (int)(Math.random()*10);
        // if(steal >= 5){
        //     face.setMessage("Stolen and scored by the defender!");
        //     face.setImage("steal");
        // }
            face.setMessage("Tween-Tween, Cross!");
            face.setImage("dribble");
        }

    public void steal(){
        face.setMessage("Stolen and scored by the defender!");
        face.setImage("steal");
    }

    public void shot(){
        face.setMessage("Player 1 with the shot!");
        face.setImage("shot");
    }

    public void newGame(){
        score = 0;
    }

} // end Virtual Pet
