import java.io.IOException;
import java.util.*;

public class SwimmerSort extends SaveInfo{
    public Swimmer getSwimmerOf(String name) throws IOException {
        Swimmer swimmer = new Swimmer();
        int line = getLineOf(name);
        swimmer.setAge(Integer.parseInt(getLine(line,"age.txt")));
        swimmer.setGender(Integer.parseInt(getLine(line,"gender.txt")));
        swimmer.setOneHundredFly(Double.parseDouble(getLine(line,"100fly.txt")));
        swimmer.setOneHundredBack(Double.parseDouble(getLine(line,"100back.txt")));
        swimmer.setOneHundredBreast(Double.parseDouble(getLine(line,"100breast.txt")));
        swimmer.setOneHundredFree(Double.parseDouble(getLine(line,"100free.txt")));
        swimmer.setName(name);
        return swimmer;
    }

    public Swimmer[] getAllSwimmers() throws IOException {
        ArrayList<Swimmer> swimmers = new ArrayList<>();
        int i = 0;
        while (getLine(i, "name.txt") != null) {
            swimmers.add(getSwimmerOf(getLine(i,"name.txt")));
            i++;
        }
        return swimmers.toArray(Swimmer[]::new);
    }
    public Swimmer[] selectStroke(Swimmer[] swimmers, String stroke) {
        HashMap<Swimmer, Double> hashMap = new HashMap<>();

        Double time;

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
            hashMap.put(swimmer, time);
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

    public Swimmer[] sortTimes(HashMap<Swimmer, Double> HMap) {
        Swimmer[] list = new Swimmer[HMap.size()];

        Map<Swimmer, Double> sorted = new LinkedHashMap<>();

        HMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        System.out.println(sorted);
        Set<Map.Entry<Swimmer, Double>> entries = sorted.entrySet();

        int i = 0;
        for (Map.Entry<Swimmer, Double> entry : entries) {
            list[i] = entry.getKey();
            i++;
        }
        return list;
    }

}


