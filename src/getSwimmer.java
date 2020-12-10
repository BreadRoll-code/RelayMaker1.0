import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class getSwimmer extends SaveInfo{
    public Swimmer getSwimmerOf(String name) throws IOException {
        Swimmer swimmer = new Swimmer();
        int l = getLineOf(name);
        swimmer.setName(name);
        swimmer.setAge(Integer.parseInt(getLine(l,"age.txt")));
        swimmer.setGender(Integer.parseInt(getLine(l,"gender.txt")));
        swimmer.setOneHundredFly(Double.parseDouble(getLine(l,"100fly.txt")));
        swimmer.setOneHundredBack(Double.parseDouble(getLine(l,"100back.txt")));
        swimmer.setOneHundredBreast(Double.parseDouble(getLine(l,"100breast.txt")));
        swimmer.setOneHundredFree(Double.parseDouble(getLine(l,"100free.txt")));
        swimmer.setCanSwimBreast(Integer.parseInt(getLine(l, "strokes.txt")));
        return swimmer;
    }

    public Swimmer[] getAllSwimmers() throws IOException {
        ArrayList<Swimmer> swimmers = new ArrayList<>();
        int i = 0;
        while (getLine(i, "name.txt") != null) {
            swimmers.set(i, getSwimmerOf(getLine(i,"name.txt")));
            i++;
        }
        return swimmers.toArray(new Swimmer[0]);
    }
    public Swimmer[] selectSwimmers(Swimmer[] swimmers, String stroke) {
        HashMap<Double, Swimmer> hashMap = new HashMap<>();

        String time;


        for(int i = 0; i < swimmers.length; i++) {
            switch (stroke) {
                case "100fly" :
                    time = ;

                case "100back":
                    filePath = "100back.txt";
                case "100breast":
                    filePath = "100breast.txt";
                case "100free":
                    filePath = "100free.txt";
            }
            hashMap.put(Double.parseDouble(swimmers[i].getName()), )
        }
    }


    Integer getLineOf(String name) throws IOException {
        int i = 0;
        while(!getLine(i, "name.txt").equals(name)) {
            i++;
        }
        return i;
    }




}
