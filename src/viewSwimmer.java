import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class viewSwimmer {
    static void addGUI() throws IOException {

        //Creation of Box
        JFrame viewBox = new JFrame("frame");
        viewBox.setBounds(150, 100, 1000, 500);

        //Creation of Text Fields
        JTextField NameText1 = new JTextField();
        NameText1.setBounds(240, 150, 100, 25);

        JTextField NameText2 = new JTextField();
        NameText2.setBounds(240, 200, 100, 25);

        //Creation of Labels
        JLabel Label1 = new JLabel("View Swimmer");
        Label1.setBounds(500,30,200,100);

        JLabel Label2 = new JLabel("Swimmer First Name");
        Label2.setBounds(100, 150, 200, 25);

        JLabel Label3 = new JLabel("Swimmer Last Name");
        Label3.setBounds(100, 200, 200, 25);

        JLabel Label4 = new JLabel();
        Label4.setBounds(450, 150, 200, 25);

        JLabel Label5 = new JLabel();
        Label5.setBounds(450, 200, 200, 25);

        JLabel Label6 = new JLabel();
        Label6.setBounds(450, 250, 200, 25);

        JLabel Label7 = new JLabel();
        Label7.setBounds(450, 300, 200, 25);

        JLabel Label9 = new JLabel();
        Label9.setBounds(700, 150, 200, 25);

        JLabel Label10 = new JLabel();
        Label10.setBounds(700, 200, 200, 25);

        JLabel Label11 = new JLabel();
        Label11.setBounds(700, 250, 200, 25);

        JLabel Label12 = new JLabel();
        Label12.setBounds(700, 300, 200, 25);

        //Creation of Buttons
        JButton BackButton = new JButton("Back");
        BackButton.setBounds(0,0,100,30);

        JButton Search = new JButton("Search");
        Search.setBounds(215,250,150,35);


        //Adding to Box
        viewBox.add(NameText1);
        viewBox.add(NameText2);

        viewBox.add(Label1);
        viewBox.add(Label2);
        viewBox.add(Label3);
        viewBox.add(Label4);
        viewBox.add(Label5);
        viewBox.add(Label6);
        viewBox.add(Label7);
        viewBox.add(Label9);
        viewBox.add(Label10);
        viewBox.add(Label11);
        viewBox.add(Label12);

        viewBox.add(BackButton);
        viewBox.add(Search);

        //Makes close on exit and sets visible
        viewBox.setLayout(null);
        viewBox.setVisible(true);
        viewBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Makes back button work

        Search.addActionListener(arg0 -> {
            try {
                Swimmer swimmer = SwimmerSort.getSwimmerOf(NameText1.getText() + " " + NameText2.getText());
                Label4.setText("Name: " + swimmer.getName());
                Label6.setText("Age: " + swimmer.getAge());
                Label7.setText("Gender: " + swimmer.getGender());
                Label9.setText("100 Fly Time: " + swimmer.getOneHundredFly());
                Label10.setText("100 Back Time: " + swimmer.getOneHundredBack());
                Label11.setText("100 Breast Time: " + swimmer.getOneHundredBreast());
                Label12.setText("100 Free Time: " + swimmer.getOneHundredFree());

            } catch (IOException e) {
                e.printStackTrace();
            }


        });

        BackButton.addActionListener(arg0 -> {
            viewBox.setVisible(false);
            Menu.addGUI();
        });
    }
}
