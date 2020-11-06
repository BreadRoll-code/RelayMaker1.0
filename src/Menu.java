import javax.swing.*;
import java.io.IOException;

public class Menu {
    static void addGUI() {

        JFrame MenuBox = new JFrame("frame");
        MenuBox.setBounds(150,100,1000,500);

        JLabel MenuLabel1 = new JLabel("LABEL");
        MenuLabel1.setBounds(500,30,50,100);

        JButton MenuButton1 = new JButton("Create Relay");
        MenuButton1.setBounds(125,100,150,340);

        JButton MenuButton2 = new JButton("Add Swimmers");
        MenuButton2.setBounds(275, 100, 150, 340);

        JButton MenuButton3 = new JButton("View Relay");
        MenuButton3.setBounds(300, 100, 200, 340);

        JButton MenuButton4 = new JButton("View Swimmers");
        MenuButton4.setBounds(400, 100, 200, 340);


        MenuBox.add(MenuLabel1);
        MenuBox.add(MenuButton1);
        MenuBox.add(MenuButton2);
        MenuBox.add(MenuButton3);
        MenuBox.add(MenuButton4);

        MenuBox.setLayout(null);
        MenuBox.setVisible(true);
        MenuBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

