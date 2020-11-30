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

        JTextField LastNameText1 = new JTextField();
        LastNameText1.setBounds(240, 150, 100, 25);

        JTextField LastNameText2 = new JTextField();
        LastNameText2.setBounds(240, 200, 100, 25);

        JTextField LastNameText3 = new JTextField();
        LastNameText3.setBounds(240, 250, 100, 25);

        JTextField AgeSwimmer1 = new JTextField();
        AgeSwimmer1.setBounds(250, 320, 30, 25);

        JTextField AgeSwimmer2 = new JTextField();
        AgeSwimmer2.setBounds(250, 350, 30, 25);

        JTextField AgeSwimmer3 = new JTextField();
        AgeSwimmer3.setBounds(250, 380, 30, 25);

        JTextField AgeSwimmer4 = new JTextField();
        AgeSwimmer4.setBounds(250, 410, 30, 25);


        //Drop Down Menu (Gender)
        String[] strokes1 = {"Any Gender", "Male", "Female"};
        JComboBox SwimmerOneGender = new JComboBox(strokes1);
        SwimmerOneGender.setBounds(620,320,100,25);
        SwimmerOneGender.setSelectedIndex(0);

        String[] strokes2 = {"Any Gender", "Male", "Female"};
        JComboBox SwimmerTwoGender = new JComboBox(strokes2);
        SwimmerTwoGender.setBounds(620,350,100,25);
        SwimmerTwoGender.setSelectedIndex(0);

        String[] strokes3 = {"Any Gender", "Male", "Female"};
        JComboBox SwimmerThreeGender = new JComboBox(strokes3);
        SwimmerThreeGender.setBounds(620,380,100,25);
        SwimmerThreeGender.setSelectedIndex(0);

        String[] strokes4 = {"Any Gender", "Male", "Female"};
        JComboBox SwimmerFourGender = new JComboBox(strokes4);
        SwimmerFourGender.setBounds(620,410,100,25);
        SwimmerFourGender.setSelectedIndex(0);

        String[] strokes5 = {"400 IM", "100 Butterfly", "100 Backstroke", "100 Breaststroke", "100 Freestlye"};
        JComboBox typeOfRace = new JComboBox(strokes5);
        typeOfRace.setBounds(400,150,150,25);
        typeOfRace.setSelectedIndex(0);


        //Add primary checkbox
        JCheckBox PrimaryOne = new JCheckBox();
        PrimaryOne.setBounds(430, 320, 60, 25);

        JCheckBox PrimaryTwo = new JCheckBox();
        PrimaryTwo.setBounds(430, 350, 60, 25);

        JCheckBox PrimaryThree = new JCheckBox();
        PrimaryThree.setBounds(430, 380, 60, 25);

        JCheckBox PrimaryFour = new JCheckBox();
        PrimaryFour.setBounds(430, 410, 60, 25);

        //Creation of Labels
        JLabel Label1 = new JLabel("Relay Creation");
        Label1.setBounds(500,30,200,100);

        JLabel Label2 = new JLabel("Include Swimmer:");
        Label2.setBounds(125,75,200,100);

        JLabel Label3 = new JLabel("Ages:");
        Label3.setBounds(125,250,200,100);

        JLabel Label4 = new JLabel("Swimmer 1");
        Label4.setBounds(160,280,200,100);

        JLabel Label5 = new JLabel("Swimmer 2");
        Label5.setBounds(160,310,200,100);

        JLabel Label6 = new JLabel("Swimmer 3");
        Label6.setBounds(160,340,200,100);

        JLabel Label7 = new JLabel("Swimmer 4");
        Label7.setBounds(160,370,200,100);

        JLabel Label8 = new JLabel("Primary:");
        Label8.setBounds(315,250,200,100);

        JLabel Label9 = new JLabel("Swimmer 1");
        Label9.setBounds(350,280,200,100);

        JLabel Label10 = new JLabel("Swimmer 2");
        Label10.setBounds(350,310,200,100);

        JLabel Label11 = new JLabel("Swimmer 3");
        Label11.setBounds(350,340,200,100);

        JLabel Label12 = new JLabel("Swimmer 4");
        Label12.setBounds(350,370,200,100);

        JLabel Label13 = new JLabel("Gender:");
        Label13.setBounds(505,250,200,100);

        JLabel Label14 = new JLabel("Swimmer 1");
        Label14.setBounds(540,280,200,100);

        JLabel Label15 = new JLabel("Swimmer 2");
        Label15.setBounds(540,310,200,100);

        JLabel Label16 = new JLabel("Swimmer 3");
        Label16.setBounds(540,340,200,100);

        JLabel Label17 = new JLabel("Swimmer 4");
        Label17.setBounds(540,370,200,100);

        JLabel Label18 = new JLabel("Type of Race:");
        Label18.setBounds(370,75,200,100);

        JLabel Label19 = new JLabel("1");
        Label19.setBounds(100, 110, 200, 100);

        JLabel Label20 = new JLabel("2");
        Label20.setBounds(100, 160, 200, 100);

        JLabel Label21 = new JLabel("3");
        Label21.setBounds(100, 210, 200, 100);

        //Creation of Button
        JButton CreateRelay = new JButton("Create Relay");
        CreateRelay.setBounds(775,350,150,50);;

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
        RelayBox.add(Label19);
        RelayBox.add(Label20);
        RelayBox.add(Label21);

        RelayBox.add(FirstNameText1);
        RelayBox.add(FirstNameText2);
        RelayBox.add(FirstNameText3);
        RelayBox.add(LastNameText1);
        RelayBox.add(LastNameText2);
        RelayBox.add(LastNameText3);

        RelayBox.add(AgeSwimmer1);
        RelayBox.add(AgeSwimmer2);
        RelayBox.add(AgeSwimmer3);
        RelayBox.add(AgeSwimmer4);

        RelayBox.add(PrimaryOne);
        RelayBox.add(PrimaryTwo);
        RelayBox.add(PrimaryThree);
        RelayBox.add(PrimaryFour);

        RelayBox.add(SwimmerOneGender);
        RelayBox.add(SwimmerTwoGender);
        RelayBox.add(SwimmerThreeGender);
        RelayBox.add(SwimmerFourGender);
        RelayBox.add(typeOfRace);

        RelayBox.add(CreateRelay);

        //Makes close on exit and sets visible
        RelayBox.setLayout(null);
        RelayBox.setVisible(true);
        RelayBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Swimmer swimmer = new Swimmer();

        //Reads info function

        //Find applicable swimmers
            //Will need true or false
            //Go through each raf
            //Find the widest
    }
}
