import javax.swing.*;
import java.io.IOException;

public class Menu {
    static void addGUI() {

        JFrame MenuBox = new JFrame("frame");
        MenuBox.setBounds(150,100,1000,500);

        JLabel MenuLabel1 = new JLabel("LABEL");
        MenuLabel1.setBounds(500,30,50,100);

        JButton MenuButton1 = new JButton("Create Relay");
        MenuButton1.setBounds(100,300,150,50);

        JButton MenuButton2 = new JButton("Add Swimmers");
        MenuButton2.setBounds(300, 300, 150, 50);

        JButton MenuButton3 = new JButton("View Relay");
        MenuButton3.setBounds(500, 300, 150, 50);

        JButton MenuButton4 = new JButton("View Swimmers");
        MenuButton4.setBounds(700, 300, 150, 50);


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

