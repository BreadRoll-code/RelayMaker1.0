import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RelayMaker extends Swimmer {

    public static void main(String[] args) throws IOException {

        //Adds the GUI
        Menu.addGUI();

        SwimmerSort swimmerSort = new SwimmerSort();

       Swimmer[] swimmers = swimmerSort.selectStroke(swimmerSort.getAllSwimmers(), "100back");

     for (Swimmer swimmer : swimmers) {
      System.out.println(swimmer.getOneHundredBack());
     }

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
        System.out.println("hundred breast please");
        Double hbr = Double.parseDouble(in.nextLine());
        System.out.println("hundred free please");
        Double hfr = Double.parseDouble(in.nextLine());

        //Setters (console)
        swimmer.setName(n + " " + ln);
        swimmer.setAge(a);
        swimmer.setGroup(g);
        swimmer.setGender(ge);
        swimmer.setOneHundredFly(hf);
        swimmer.setOneHundredBack(hb);
        swimmer.setOneHundredBreast(hbr);
        swimmer.setOneHundredFree(hfr);

        }

    }


