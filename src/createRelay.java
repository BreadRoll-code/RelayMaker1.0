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

        //Add primary checkbox

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


        //Adding to Box
        RelayBox.add(Label1);
        RelayBox.add(Label2);
        RelayBox.add(Label3);
        RelayBox.add(Label4);
        RelayBox.add(Label5);
        RelayBox.add(Label6);
        RelayBox.add(Label7);

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
