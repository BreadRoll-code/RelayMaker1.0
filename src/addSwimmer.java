import javax.swing.*;
import java.io.IOException;

public class addSwimmer extends Swimmer {
    static void addGUI() throws IOException {

        SaveInfo info = new SaveInfo();
        JFrame box = new JFrame("frame");
        box.setBounds(150,100,1000,500);

        JLabel Label1 = new JLabel("LABEL");
        Label1.setBounds(500,30,50,100);

        JTextField NameText1 = new JTextField();
        NameText1.setBounds(100, 150, 100, 25);

        JTextField NameText2 = new JTextField();
        NameText2.setBounds(100, 200, 100, 25);

        JTextField AgeText = new JTextField();
        AgeText.setBounds(100, 250, 100, 25);

        JTextField GroupText = new JTextField();
        GroupText.setBounds(100, 300, 100, 25);

        JTextField GenderText = new JTextField();
        GenderText.setBounds(100, 350, 100, 25);

        JButton Button1 = new JButton("Add Name");
        Button1.setBounds(100,100,150,50);

        box.add(Label1);
        box.add(Button1);
        box.add(NameText1);
        box.add(NameText2);
        box.add(AgeText);
        box.add(GroupText);
        box.add(GenderText);
        box.setLayout(null);
        box.setVisible(true);
        box.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Swimmer swimmer = new Swimmer();

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

