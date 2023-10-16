import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet(getResponse("What's your name?"));
        p.newGame();
        p.dribble();
        takeABeat(5000);
        p.shot();
        takeABeat(5000);
        p.make();
        takeABeat(5000);
        p.oppDribble();
        takeABeat(5000);
        p.oppShot();
        takeABeat(5000);
        p.oppMake();
        takeABeat(5000);
        p.dribble();
        takeABeat(5000);
        p.dunk();
        takeABeat(5000);
        p.oppDribble();
        takeABeat(5000);
        p.oppShot();
        takeABeat(5000);
        p.block();
        takeABeat(5000);
        p.dribble();
        takeABeat(5000);
        p.shot();
        takeABeat(5000);
        p.make();
        takeABeat(5000);
        p.dribble();
        takeABeat(7000);
        p.steal();
        takeABeat(5000);
        p.oppDribble();
        takeABeat(5000);
        p.oppShot();
        takeABeat(5000);
        p.oppMake();
        takeABeat(5000);
        p.winner();


        // p.make();
        // takeABeat(3000);
        // p.block();
        // takeABeat(3000);
        // p.make();
        // takeABeat(3000);
        // p.dribble();
        // takeABeat(5000);
        // p.dribble();
        // takeABeat(5000);
        // p.dribble();
        // takeABeat(5000);
        // p.dunk();
    
        }

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
    );
    return s;

    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){

    }
}



    public static void main(String[] args){
        new Runner();
        // v.sleep();
        // // v.feed();
        // v.exercise();
    }
}