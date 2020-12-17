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

        Double time;


        for (Swimmer swimmer : swimmers) {
            switch (stroke) {
                case "100fly":
                    time = swimmer.getOneHundredFly();
                case "100back":
                    time = swimmer.getOneHundredBack();
                case "100breast":
                    time = swimmer.getOneHundredBreast();
                case "100free":
                    time = swimmer.getOneHundredFree();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + stroke);
            }
            hashMap.put(time, swimmer);
        }
        return null;
    }


    Integer getLineOf(String name) throws IOException {
        int i = 0;
        while(!getLine(i, "name.txt").equals(name)) {
            i++;
        }
        return i;
    }




}
