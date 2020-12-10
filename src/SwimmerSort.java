import java.io.IOException;
import java.util.*;

public class SwimmerSort extends SaveInfo{
    public Swimmer getSwimmerOf(String name) throws IOException {
        Swimmer swimmer = new Swimmer();
        int line = getLineOf(name);
        try {
            swimmer.setAge(Integer.parseInt(getLine(line,"age.txt")));
            swimmer.setGender(Integer.parseInt(getLine(line,"gender.txt")));
            swimmer.setOneHundredFly(Double.parseDouble(getLine(line,"100fly.txt")));
            swimmer.setOneHundredBack(Double.parseDouble(getLine(line,"100back.txt")));
            swimmer.setOneHundredBreast(Double.parseDouble(getLine(line,"100breast.txt")));
            swimmer.setOneHundredFree(Double.parseDouble(getLine(line,"100free.txt")));
        } catch (NumberFormatException ignored) {}
        swimmer.setName(name);
        return swimmer;
    }

    public Swimmer[] getAllSwimmers() throws IOException {
        Swimmer[] swimmers = new Swimmer[10];
        int i = 0;
        while (!getLine(i, "name.txt").equals("")) {
            swimmers[i] = getSwimmerOf(getLine(i,"name.txt"));
            i++;
        }
        return swimmers;
    }
    public Swimmer[] selectStroke(Swimmer[] swimmers, String stroke) {
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
        return sortTimes(hashMap);
    }


    Integer getLineOf(String name) throws IOException {
        int i = 0;
        while(!getLine(i, "name.txt").equals(name)) {
            i++;
        }
        return i;
    }

    public Swimmer[] sortTimes(HashMap<Double, Swimmer> HMap) {
        Swimmer[] list = new Swimmer[HMap.size()];
        Map<Double, Swimmer> map = new TreeMap<>(HMap);
        Set<Map.Entry<Double, Swimmer>> entries = map.entrySet();
        int i = 0;
        for (Map.Entry<Double, Swimmer> entry : entries) {
            list[i] = entry.getValue();
            i++;
        }
        return list;
    }




}
