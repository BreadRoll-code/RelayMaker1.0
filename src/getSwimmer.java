import java.io.IOException;

public class getSwimmer extends SaveInfo{
    public String[] getSwimmerOf(String firstName, String lastName) throws IOException {
        Swimmer swimmer = new Swimmer();
        int l = getLineOf(firstName + " " + lastName);
        swimmer.setName(firstName, lastName);
        swimmer.setAge(Integer.parseInt(getLine(l,"age.txt")));
        swimmer.setGender(Integer.parseInt(getLine(l,"gender.txt")));
        swimmer.s
    }

    Integer getLineOf(String name) throws IOException {
        int i = 0;
        while(!getLine(i, "name.txt").equals(name)) {
            i++;
        }
        return i;
    }
}
