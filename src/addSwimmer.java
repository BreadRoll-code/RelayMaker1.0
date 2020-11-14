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

        JLabel Label7 = new JLabel("100 Fly Time");
        Label7.setBounds(400,110,250,100);

        JLabel Label8 = new JLabel("100 Back Time");
        Label8.setBounds(400,160,250,100);

        JLabel Label9 = new JLabel("100 Breast Time");
        Label9.setBounds(400,210,250,100);

        JLabel Label10 = new JLabel("100 Free Time");
        Label10.setBounds(400,260,250,100);

        JLabel Label11 = new JLabel("Cannot Swim:");
        Label11.setBounds(400,310,250,100);

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

        JTextField HundredFlyText = new JTextField();
        HundredFlyText.setBounds(525, 150, 100, 25);

        JTextField HundredBackText = new JTextField();
        HundredBackText.setBounds(525, 200, 100, 25);

        JTextField HundredBreastText = new JTextField();
        HundredBreastText.setBounds(525, 250, 100, 25);

        JTextField HundredFreeText = new JTextField();
        HundredFreeText.setBounds(525, 300, 100, 25);

        //Creation of Button
        JButton Button1 = new JButton("Create Swimmer");
        Button1.setBounds(800,350,150,50);

        //Creation of Drop Down Menu
        String[] strokes = {"Can swim all strokes", "Fly", "Back", "Breast", "Free"};
        JComboBox MustSwimX = new JComboBox(strokes);
        MustSwimX.setBounds(500,350,150,25);
        MustSwimX.setSelectedIndex(0);

        //Adding to Box
        box.add(Label1);
        box.add(Label2);
        box.add(Label3);
        box.add(Label4);
        box.add(Label5);
        box.add(Label6);
        box.add(Label7);
        box.add(Label8);
        box.add(Label9);
        box.add(Label10);
        box.add(Label11);

        box.add(Button1);
        box.add(MustSwimX);

        box.add(NameText1);
        box.add(NameText2);
        box.add(AgeText);
        box.add(GroupText);
        box.add(GenderText);
        box.add(HundredFlyText);
        box.add(HundredBackText);
        box.add(HundredBreastText);
        box.add(HundredFreeText);

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

            swimmer.setOneHundredFly(Double.parseDouble(HundredFlyText.getText()));
            try {
                info.saveInfo(HundredFlyText.getText(), "100fly.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            swimmer.setOneHundredBack(Double.parseDouble(HundredBackText.getText()));
            try {
                info.saveInfo(HundredBackText.getText(), "100back.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            swimmer.setOneHundredBreast(Double.parseDouble(HundredBreastText.getText()));
            try {
                info.saveInfo(HundredBreastText.getText(), "100breast.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            swimmer.setOneHundredFree(Double.parseDouble(HundredFreeText.getText()));
            try {
                info.saveInfo(HundredFreeText.getText(), "100free.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (MustSwimX.getSelectedIndex() == 1) { swimmer.setMustSwimFly(MustSwimX.getSelectedIndex());
            try {
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfly.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimback.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimbreast.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfree.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "canswimall.txt");
                } catch (IOException e) {
                e.printStackTrace();
                }
            }

            else if (MustSwimX.getSelectedIndex() == 2) {swimmer.setMustSwimBack(MustSwimX.getSelectedIndex());
            try {
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfly.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimback.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimbreast.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfree.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "canswimall.txt");
                } catch (IOException e) {
                e.printStackTrace();
                }
            }

            else if (MustSwimX.getSelectedIndex() == 3) {swimmer.setMustSwimBreast(MustSwimX.getSelectedIndex());
            try {
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfly.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimback.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimbreast.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfree.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "canswimall.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            else if (MustSwimX.getSelectedIndex() == 4) {swimmer.setMustSwimFree(MustSwimX.getSelectedIndex());
            try {
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfly.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimback.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimbreast.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfree.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "canswimall.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            else if (MustSwimX.getSelectedIndex() == 0) { swimmer.setMustSwimFree(MustSwimX.getSelectedIndex());
            try {
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfly.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimback.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimbreast.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "mustswimfree.txt");
                info.saveInfoInt(MustSwimX.getSelectedIndex(), "canswimall.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}

