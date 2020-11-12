import javax.swing.*;
import java.io.IOException;

public class addSwimmer extends Swimmer {
    static void addGUI() throws IOException {

        SaveInfo info = new SaveInfo();


        //Creation of Box
        JFrame box = new JFrame("frame");
        box.setBounds(150,100,1000,500);

        //Creation of Labels
        JLabel Label1 = new JLabel("New Swimmer Creation");
        Label1.setBounds(450,30,200,100);

        JLabel Label2 = new JLabel("First name");
        Label2.setBounds(50,110,75,100);

        JLabel Label3 = new JLabel("Last name");
        Label3.setBounds(50,160,75,100);

        JLabel Label4 = new JLabel("Age");
        Label4.setBounds(50,210,75,100);

        JLabel Label5 = new JLabel("Group");
        Label5.setBounds(50,260,75,100);

        JLabel Label6 = new JLabel("Gender");
        Label6.setBounds(50,310,75,100);

        //Creation of Text Fields
        JTextField NameText1 = new JTextField();
        NameText1.setBounds(125, 150, 100, 25);

        JTextField NameText2 = new JTextField();
        NameText2.setBounds(125, 200, 100, 25);

        JTextField AgeText = new JTextField();
        AgeText.setBounds(125, 250, 100, 25);

        JTextField GroupText = new JTextField();
        GroupText.setBounds(125, 300, 100, 25);

        JTextField GenderText = new JTextField();
        GenderText.setBounds(125, 350, 100, 25);

        //Creation of Button
        JButton Button1 = new JButton("Create Swimmer");
        Button1.setBounds(800,350,150,50);

        //Adding to Box
        box.add(Label1);
        box.add(Label2);
        box.add(Label3);
        box.add(Label4);
        box.add(Label5);
        box.add(Label6);
        box.add(Button1);
        box.add(NameText1);
        box.add(NameText2);
        box.add(AgeText);
        box.add(GroupText);
        box.add(GenderText);

        //Makes close on exit and sets visible
        box.setLayout(null);
        box.setVisible(true);
        box.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Swimmer swimmer = new Swimmer();

        //When button is pressed all information in text fields is saved to .txt files
        Button1.addActionListener(arg0 -> {
            swimmer.setName(NameText1.getText(), NameText2.getText());
            box.setVisible(false);
            try {
                info.saveInfo(NameText1.getText() + " " + NameText2.getText(), "name.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            swimmer.setAge(Integer.parseInt(AgeText.getText()));
            try {
                info.saveInfo(AgeText.getText(), "age.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            swimmer.setGroup(GroupText.getText());
            box.setVisible(false);
            try {
                info.saveInfo(GroupText.getText(), "group.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            swimmer.setGender(Integer.parseInt(GenderText.getText()));
            try {
                info.saveInfo(GenderText.getText(), "gender.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}

