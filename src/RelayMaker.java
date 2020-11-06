import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RelayMaker {

    public static void main(String[] args) throws IOException {

        //Adds the GUI
        Menu.addGUI();

        //Adds Scanner
        Scanner in = new Scanner(System.in);

        //Asks for information
        Swimmer swimmer = new Swimmer();
        System.out.println("name please ");
        String n = in.nextLine();
        System.out.println("last name please ");
        String ln = in.nextLine();
        System.out.println("age please ");
        Integer a = Integer.parseInt(in.nextLine());
        System.out.println("group please ");
        String g = in.nextLine();
        System.out.println("gender please");
        Integer ge = Integer.parseInt(in.nextLine());
        swimmer.setName(n, ln);
        swimmer.setAge(a);
        swimmer.setGroup(g);
        swimmer.setGender(ge);

        SaveInfo info = new SaveInfo();
        info.saveName();
        info.saveAge();
        info.saveGroup();
        info.saveGender();



        //Runs the add swimmer class
        //addSwimmer.addSwimmer();

        //Compare swimmers

        }

    }


