import javax.swing.*;
import java.io.IOException;

public class Menu {
    static void addGUI() {

        //Creation of Box
        JFrame MenuBox = new JFrame("frame");
        MenuBox.setBounds(150,100,1000,500);

        //Creation of Label
        JLabel MenuLabel1 = new JLabel("LABEL");
        MenuLabel1.setBounds(500,30,50,100);

        //Creation of Buttons
        JButton MenuButton1 = new JButton("Create Relay");
        MenuButton1.setBounds(100,300,150,50);

        JButton MenuButton2 = new JButton("Add Swimmers");
        MenuButton2.setBounds(300, 300, 150, 50);

        JButton MenuButton3 = new JButton("View Relay");
        MenuButton3.setBounds(500, 300, 150, 50);

        JButton MenuButton4 = new JButton("View Swimmers");
        MenuButton4.setBounds(700, 300, 150, 50);

        //Adding to Box
        MenuBox.add(MenuLabel1);
        MenuBox.add(MenuButton1);
        MenuBox.add(MenuButton2);
        MenuBox.add(MenuButton3);
        MenuBox.add(MenuButton4);

        //Makes close on exit and sets visible
        MenuBox.setLayout(null);
        MenuBox.setVisible(true);
        MenuBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //When buttons are pressed respective screen is displayed
        MenuButton1.addActionListener(arg0 -> {
            MenuBox.setVisible(false);
            try {
                addSwimmer.addGUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        MenuButton2.addActionListener(arg0 -> {
            MenuBox.setVisible(false);
            try {
                addSwimmer.addGUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}

