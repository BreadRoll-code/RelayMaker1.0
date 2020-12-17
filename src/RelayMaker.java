import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RelayMaker extends Swimmer {

   public static void main(String[] args) throws IOException {

      //Adds the GUI
      Menu.addGUI();

      //Adds Scanner
      Scanner in = new Scanner(System.in);
      SwimmerSort swimmerSort = new SwimmerSort();
      Double time;

      //Asks for information (console)
      System.out.println("what stroke would you like to view?");
      String stroke = in.nextLine();

      Swimmer[] swimmers = swimmerSort.selectStroke(swimmerSort.getAllSwimmers(), stroke);

      for (Swimmer swimmer : swimmers) {
         switch (stroke) {
            case "100fly":
               time = swimmer.getOneHundredFly();
               break;
            case "100back":
               time = swimmer.getOneHundredBack();
               break;
            case "100breast":
               time = swimmer.getOneHundredBreast();
               break;
            case "100free":
               time = swimmer.getOneHundredFree();
               break;
            default:
               throw new IllegalStateException("Unexpected value: " + stroke);
         }
         System.out.println(swimmer.getName() + ": " + time);
      }

   }
}


