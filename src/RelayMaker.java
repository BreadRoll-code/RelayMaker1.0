import java.io.IOException;
import java.util.Scanner;

public class RelayMaker extends Swimmer {

    public static void main(String[] args) throws IOException {

        //Adds the GUI
        Menu.addGUI();

        //Adds Scanner
        Scanner in = new Scanner(System.in);

        //Asks for information (console)
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
        System.out.println("hundred fly please");
        Double hf = Double.parseDouble(in.nextLine());
        System.out.println("hundred back please");
        Double hb = Double.parseDouble(in.nextLine());

        //Setters (console)
        swimmer.setName(n, ln);
        swimmer.setAge(a);
        swimmer.setGroup(g);
        swimmer.setGender(ge);
        swimmer.setOneHundredFly(hf);
        swimmer.setOneHundredBack(hb);

        //Calls save info
        SaveInfo info = new SaveInfo();
        info.saveInfo(getFirstName() + " " + getLastName(),"name.txt");
        info.saveInfo(String.valueOf(getAge()), "age.txt");
        info.saveInfo(getGroup(), "group.txt");
        info.saveInfo(String.valueOf(getGender()), "gender.txt");
        info.saveInfo(String.valueOf(getOneHundredFly()), "100fly.txt");
        info.saveInfo(String.valueOf(getOneHundredBack()), "100back.txt");

        //text field name.get text




        //Runs the add swimmer class
        //addSwimmer.addSwimmer();

        //Compare swimmers

        }

    }


