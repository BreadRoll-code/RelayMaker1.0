import javax.swing.*;
import java.io.IOException;

public class addSwimmer extends Swimmer {
    static void addGUI() throws IOException {

        SaveInfo info = new SaveInfo();
        JFrame box = new JFrame("frame");
        box.setBounds(150,100,1000,500);

        JLabel label1 = new JLabel("LABEL");
        label1.setBounds(500,30,50,100);

        JTextField text1 = new JTextField();
        text1.setBounds(100, 150, 100, 25);

        JTextField text2 = new JTextField();
        text2.setBounds(100, 200, 100, 25);

        JButton button1 = new JButton("Add Name");
        button1.setBounds(100,100,150,50);

        box.add(label1);
        box.add(button1);
        box.add(text1);
        box.add(text2);
        box.setLayout(null);
        box.setVisible(true);
        box.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Swimmer swimmer = new Swimmer();

        button1.addActionListener(arg0 -> {
            swimmer.setName(text1.getText(), text2.getText());
            box.setVisible(false);
            try {
                info.saveInfo(getFirstName() + "" + getLastName(), "name.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

