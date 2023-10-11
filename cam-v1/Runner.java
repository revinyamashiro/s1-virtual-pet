import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet();
        // p.exercise();
        // takeABeat(1000);
        // p.feed();
        // takeABeat(1000);
        // p.exercise();
        // String ans = getResponse("How was your day?");
        // System.out.println(ans);
        // p.newGame();
        p.shoot();
        takeABeat(1000);
        p.block();
        takeABeat(1000);
        p.shoot();
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