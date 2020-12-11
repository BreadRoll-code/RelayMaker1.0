import javax.swing.*;
import java.io.IOException;

public class viewRelay {

    static void addGUI() throws IOException {

        //Creation of Box
        JFrame relayBox = new JFrame("frame");
        relayBox.setBounds(150, 100, 1000, 500);

        //Creation of Button
        JButton BackButton = new JButton("Back");
        BackButton.setBounds(0,0,100,30);

        //Adding to Box
        relayBox.add(BackButton);

        //Makes close on exit and sets visible
        relayBox.setLayout(null);
        relayBox.setVisible(true);
        relayBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Makes back button work
        BackButton.addActionListener(arg0 -> {
            relayBox.setVisible(false);
            Menu.addGUI();
        });





    }
}
