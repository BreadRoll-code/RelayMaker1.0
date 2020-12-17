import javax.swing.*;
import java.io.IOException;

public class viewRelay {

    static void addGUI() throws IOException {

        //Creation of Box
        JFrame relayBox = new JFrame("frame");
        relayBox.setBounds(150, 100, 1000, 500);

        //Creation of Text Fields
        JTextField RelayNumber = new JTextField();
        RelayNumber.setBounds(220, 150, 50, 25);

        //Creation of Labels
        JLabel Label1 = new JLabel("View Swimmer");
        Label1.setBounds(500,30,200,100);

        JLabel Label2 = new JLabel("Relay Number: ");
        Label2.setBounds(100, 150, 200, 25);

        JLabel Label3 = new JLabel("*Relay Number will be in the order of creation");
        Label3.setBounds(100, 200, 500, 50);

        JLabel Label4 = new JLabel(" ie. 1st relay will have a relay number of 1 etc.");
        Label4.setBounds(100, 225, 500, 50);

        JLabel Label5 = new JLabel("Swimmer 1: ");
        Label5.setBounds(450, 150, 200, 25);

        JLabel Label6 = new JLabel("Swimmer 2: ");
        Label6.setBounds(450, 200, 200, 25);

        JLabel Label7 = new JLabel("Swimmer 3: ");
        Label7.setBounds(450, 250, 200, 25);

        JLabel Label8 = new JLabel("Swimmer 4: ");
        Label8.setBounds(450, 300, 200, 25);

        JLabel Label9 = new JLabel("Time: ");
        Label9.setBounds(725, 150, 200, 25);

        JLabel Label10 = new JLabel("Time: ");
        Label10.setBounds(725, 200, 200, 25);

        JLabel Label11 = new JLabel("Time: ");
        Label11.setBounds(725, 250, 200, 25);

        JLabel Label12 = new JLabel("Time: ");
        Label12.setBounds(725, 300, 200, 25);

        //Creation of Button
        JButton BackButton = new JButton("Back");
        BackButton.setBounds(0,0,100,30);

        //Adding to Box
        relayBox.add(Label1);
        relayBox.add(Label2);
        relayBox.add(Label3);
        relayBox.add(Label4);
        relayBox.add(Label5);
        relayBox.add(Label6);
        relayBox.add(Label7);
        relayBox.add(Label8);
        relayBox.add(Label9);
        relayBox.add(Label10);
        relayBox.add(Label11);
        relayBox.add(Label12);

        relayBox.add(RelayNumber);
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
