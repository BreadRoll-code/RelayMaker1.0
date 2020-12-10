import java.io.IOException;

public class getSwimmer extends SaveInfo{
    public Swimmer getSwimmerOf(String firstName, String lastName) throws IOException {
        Swimmer swimmer = new Swimmer();
        int l = getLineOf(firstName + " " + lastName);
        swimmer.setName(firstName, lastName);
        swimmer.setAge(Integer.parseInt(getLine(l,"age.txt")));
        swimmer.setGender(Integer.parseInt(getLine(l,"gender.txt")));
        swimmer.setOneHundredFly(Double.parseDouble(getLine(l,"100fly.txt")));
        swimmer.setOneHundredBack(Double.parseDouble(getLine(l,"100back.txt")));
        swimmer.setOneHundredBreast(Double.parseDouble(getLine(l,"100breast.txt")));
        swimmer.setOneHundredFree(Double.parseDouble(getLine(l,"100free.txt")));
        swimmer.setCanSwimBreast(Integer.parseInt(getLine(l, "strokes.txt")));
        return swimmer;
    }

    Integer getLineOf(String name) throws IOException {
        int i = 0;
        while(!getLine(i, "name.txt").equals(name)) {
            i++;
        }
        return i;
    }


}
