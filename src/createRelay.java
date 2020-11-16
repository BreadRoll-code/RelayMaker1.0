import javax.swing.*;
import java.io.IOException;

public class createRelay {
    static void addGUI() {

        SaveInfo RelayInfo = new SaveInfo();


        //Creation of Box
        JFrame RelayBox = new JFrame("frame");
        RelayBox.setBounds(150,100,1000,500);

        //Creation of Labels
        JLabel Label1 = new JLabel("New Swimmer Creation");
        Label1.setBounds(450,30,200,100);

        //Adding to Box
        RelayBox.add(Label1);

        //Makes close on exit and sets visible
        RelayBox.setLayout(null);
        RelayBox.setVisible(true);
        RelayBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Swimmer swimmer = new Swimmer();
    }
}
