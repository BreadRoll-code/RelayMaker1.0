import com.sun.jdi.StringReference;

import javax.swing.*;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.IOException;

public class createRelay {
    static void addGUI() {

        SaveInfo RelayInfo = new SaveInfo();


        //Creation of Box
        JFrame RelayBox = new JFrame("frame");
        RelayBox.setBounds(150,100,1000,500);

        //Creation of Text Fields
        JTextField FirstNameText1 = new JTextField();
        FirstNameText1.setBounds(125, 150, 100, 25);

        JTextField FirstNameText2 = new JTextField();
        FirstNameText2.setBounds(125, 200, 100, 25);

        JTextField FirstNameText3 = new JTextField();
        FirstNameText3.setBounds(125, 250, 100, 25);

        JTextField FirstNameText4 = new JTextField();
        FirstNameText4.setBounds(125, 300, 100, 25);

        JTextField LastNameText1 = new JTextField();
        LastNameText1.setBounds(240, 150, 100, 25);

        JTextField LastNameText2 = new JTextField();
        LastNameText2.setBounds(240, 200, 100, 25);

        JTextField LastNameText3 = new JTextField();
        LastNameText3.setBounds(240, 250, 100, 25);

        JTextField LastNameText4 = new JTextField();
        LastNameText4.setBounds(240, 300, 100, 25);

        JTextField AgeSwimmer1 = new JTextField();
        AgeSwimmer1.setBounds(485, 145, 30, 25);

        JTextField AgeSwimmer2 = new JTextField();
        AgeSwimmer2.setBounds(485, 175, 30, 25);

        JTextField AgeSwimmer3 = new JTextField();
        AgeSwimmer3.setBounds(485, 205, 30, 25);

        JTextField AgeSwimmer4 = new JTextField();
        AgeSwimmer4.setBounds(485, 235, 30, 25);

        JTextField RelayName = new JTextField();
        RelayName.setBounds(700, 275, 100, 25);



        //Drop Down Menu (Gender)
        JComboBox SwimmerOneGender = new JComboBox(new String[]{"Any Gender", "Male", "Female"});
        SwimmerOneGender.setBounds(485,320,100,25);
        SwimmerOneGender.setSelectedIndex(0);

        JComboBox SwimmerTwoGender = new JComboBox(new String[]{"Any Gender", "Male", "Female"});
        SwimmerTwoGender.setBounds(485,350,100,25);
        SwimmerTwoGender.setSelectedIndex(0);

        JComboBox SwimmerThreeGender = new JComboBox(new String[]{"Any Gender", "Male", "Female"});
        SwimmerThreeGender.setBounds(485,380,100,25);
        SwimmerThreeGender.setSelectedIndex(0);

        JComboBox SwimmerFourGender = new JComboBox(new String[]{"Any Gender", "Male", "Female"});
        SwimmerFourGender.setBounds(485,410,100,25);
        SwimmerFourGender.setSelectedIndex(0);

        String[] Long = {"400 IM", "100 Butterfly", "100 Backstroke", "100 Breaststroke", "100 Freestlye"};
        JComboBox typeOfRace = new JComboBox(Long);
        typeOfRace.setBounds(125,365,200,25);
        typeOfRace.setSelectedIndex(0);

        String[] AlsoLong = {"No Primary Swimmer", "Swimmer one", "Swimmer two", "Swimmer three", "Swimmer four"};
        JComboBox Primary = new JComboBox(AlsoLong);
        Primary.setBounds(125,415,200,25);
        Primary.setSelectedIndex(0);

        //Creation of Labels
        JLabel Label1 = new JLabel("Relay Creation");
        Label1.setBounds(500,30,200,100);

        JLabel Label2 = new JLabel("Include Swimmer:");
        Label2.setBounds(125,75,200,100);

        JLabel Label3 = new JLabel("Ages:");
        Label3.setBounds(370,75,200,100);

        JLabel Label4 = new JLabel("Swimmer 1");
        Label4.setBounds(405,105,200,100);

        JLabel Label5 = new JLabel("Swimmer 2");
        Label5.setBounds(405,135,200,100);

        JLabel Label6 = new JLabel("Swimmer 3");
        Label6.setBounds(405,165,200,100);

        JLabel Label7 = new JLabel("Swimmer 4");
        Label7.setBounds(405,195,200,100);

        JLabel Label8 = new JLabel("Primary:");
        Label8.setBounds(125,350,200,100);

        JLabel Label9 = new JLabel("Gender:");
        Label9.setBounds(370,250,200,100);

        JLabel Label10 = new JLabel("Swimmer 1");
        Label10.setBounds(405,280,200,100);

        JLabel Label11 = new JLabel("Swimmer 2");
        Label11.setBounds(405,310,200,100);

        JLabel Label12 = new JLabel("Swimmer 3");
        Label12.setBounds(405,340,200,100);

        JLabel Label13 = new JLabel("Swimmer 4");
        Label13.setBounds(405,370,200,100);

        JLabel Label14 = new JLabel("Type of Race:");
        Label14.setBounds(125,300,200,100);

        JLabel Label15 = new JLabel("1");
        Label15.setBounds(100, 110, 200, 100);

        JLabel Label16 = new JLabel("2");
        Label16.setBounds(100, 160, 200, 100);

        JLabel Label17 = new JLabel("3");
        Label17.setBounds(100, 210, 200, 100);

        JLabel Label18 = new JLabel("4");
        Label18.setBounds(100, 260, 200, 100);

        JLabel Label19 = new JLabel("Name of Relay");
        Label19.setBounds(100, 100, 100, 100);

        //Creation of Button
        JButton CreateRelay = new JButton("Create Relay");
        CreateRelay.setBounds(700,350,150,50);;

        //Adding to Box
        RelayBox.add(Label1);
        RelayBox.add(Label2);
        RelayBox.add(Label3);
        RelayBox.add(Label4);
        RelayBox.add(Label5);
        RelayBox.add(Label6);
        RelayBox.add(Label7);
        RelayBox.add(Label8);
        RelayBox.add(Label9);
        RelayBox.add(Label10);
        RelayBox.add(Label11);
        RelayBox.add(Label12);
        RelayBox.add(Label13);
        RelayBox.add(Label14);
        RelayBox.add(Label15);
        RelayBox.add(Label16);
        RelayBox.add(Label17);
        RelayBox.add(Label18);

        RelayBox.add(FirstNameText1);
        RelayBox.add(FirstNameText2);
        RelayBox.add(FirstNameText3);
        RelayBox.add(FirstNameText4);
        RelayBox.add(LastNameText1);
        RelayBox.add(LastNameText2);
        RelayBox.add(LastNameText3);
        RelayBox.add(LastNameText4);

        RelayBox.add(AgeSwimmer1);
        RelayBox.add(AgeSwimmer2);
        RelayBox.add(AgeSwimmer3);
        RelayBox.add(AgeSwimmer4);

        RelayBox.add(SwimmerOneGender);
        RelayBox.add(SwimmerTwoGender);
        RelayBox.add(SwimmerThreeGender);
        RelayBox.add(SwimmerFourGender);
        RelayBox.add(typeOfRace);
        RelayBox.add(Primary);
        RelayBox.add(RelayName);

        RelayBox.add(CreateRelay);

        //Makes close on exit and sets visible
        RelayBox.setLayout(null);
        RelayBox.setVisible(true);
        RelayBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Makes button do things
        CreateRelay.addActionListener(arg0 -> {

            Relay relay = new Relay();
            SaveInfo info = new SaveInfo();

            if (!FirstNameText1.getText().equals("") && !LastNameText1.getText().equals("")) {
                relay.setSwimmer1(FirstNameText1.getText() + " " + LastNameText1);
            }
            if (!FirstNameText2.getText().equals("") && !LastNameText2.getText().equals("")) {
                relay.setSwimmer2(FirstNameText2.getText() + " " + LastNameText2);
            }
            if (!FirstNameText3.getText().equals("") && !LastNameText3.getText().equals("")) {
                relay.setSwimmer3(FirstNameText3.getText() + " " + LastNameText3);
            }
            if (!FirstNameText4.getText().equals("") && !LastNameText4.getText().equals("")) {
                relay.setSwimmer4(FirstNameText4.getText() + " " + LastNameText4);
            }

            if (!AgeSwimmer1.getText().equals("")) {
                relay.setSwimmerAge1(Integer.valueOf(AgeSwimmer1.getText()));
            }
            if (!AgeSwimmer2.getText().equals("")) {
                relay.setSwimmerAge2(Integer.valueOf(AgeSwimmer2.getText()));
            }
            if (!AgeSwimmer3.getText().equals("")) {
                relay.setSwimmerAge3(Integer.valueOf(AgeSwimmer3.getText()));
            }
            if (!AgeSwimmer4.getText().equals("")) {
                relay.setSwimmerAge4(Integer.valueOf(AgeSwimmer4.getText()));
            }

            //Primary drop down
            if (Primary.getSelectedIndex() == 1) {relay.setSwimmerPrimary(Primary.getSelectedIndex());}

            else if (Primary.getSelectedIndex() == 2) {relay.setSwimmerPrimary(Primary.getSelectedIndex());}

            else if (Primary.getSelectedIndex() == 3) {relay.setSwimmerPrimary(Primary.getSelectedIndex());}

            else if (Primary.getSelectedIndex() == 4) {relay.setSwimmerPrimary(Primary.getSelectedIndex());}

            else if (Primary.getSelectedIndex() == 0) {relay.setSwimmerPrimary(Primary.getSelectedIndex());}

            //Gender 1 drop down
            if (SwimmerOneGender.getSelectedIndex() == 1) { relay.setSwimmerGender1(SwimmerOneGender.getSelectedIndex());}

            else if (SwimmerOneGender.getSelectedIndex() == 2) {relay.setSwimmerGender1(SwimmerOneGender.getSelectedIndex());}

            else if (SwimmerOneGender.getSelectedIndex() == 0) {relay.setSwimmerGender1(SwimmerOneGender.getSelectedIndex());}

            //Gender 2 drop down
            if (SwimmerTwoGender.getSelectedIndex() == 1) { relay.setSwimmerGender2(SwimmerTwoGender.getSelectedIndex());}

            else if (SwimmerTwoGender.getSelectedIndex() == 2) {relay.setSwimmerGender2(SwimmerTwoGender.getSelectedIndex());}

            else if (SwimmerTwoGender.getSelectedIndex() == 0) {relay.setSwimmerGender2(SwimmerTwoGender.getSelectedIndex());}

            //Gender 3 drop down
            if (SwimmerThreeGender.getSelectedIndex() == 1) { relay.setSwimmerGender3(SwimmerThreeGender.getSelectedIndex());}

            else if (SwimmerThreeGender.getSelectedIndex() == 2) {relay.setSwimmerGender3(SwimmerThreeGender.getSelectedIndex());}

            else if (SwimmerThreeGender.getSelectedIndex() == 0) {relay.setSwimmerGender3(SwimmerThreeGender.getSelectedIndex());}

            //Gender 4 drop down
            if (SwimmerFourGender.getSelectedIndex() == 1) { relay.setSwimmerGender4(SwimmerFourGender.getSelectedIndex());}

            else if (SwimmerFourGender.getSelectedIndex() == 2) {relay.setSwimmerGender4(SwimmerFourGender.getSelectedIndex());}

            else if (SwimmerFourGender.getSelectedIndex() == 0) {relay.setSwimmerGender4(SwimmerFourGender.getSelectedIndex());}

            //Set race drop down
            if (typeOfRace.getSelectedIndex() == 1) { relay.setRaceChosen(typeOfRace.getSelectedIndex());}

            else if (typeOfRace.getSelectedIndex() == 2) {relay.setRaceChosen(typeOfRace.getSelectedIndex());}

            else if (typeOfRace.getSelectedIndex() == 3) {relay.setRaceChosen(typeOfRace.getSelectedIndex());}

            else if (typeOfRace.getSelectedIndex() == 4) {relay.setRaceChosen(typeOfRace.getSelectedIndex());}

            else if (typeOfRace.getSelectedIndex() == 0) {relay.setRaceChosen(typeOfRace.getSelectedIndex());
            }
        });

        //Reads info function

        //Find applicable swimmers
            //Will need true or false
            //Go through each raf
            //Find the widest
    }

    static void bullShit(){

    }

}
