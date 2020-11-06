public class Swimmer {

    //Swimmer variables
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String group;
    private static int gender;
    private double oneHundredFly;
    private double oneHundredBack;
    private double oneHundredBreast;
    private double oneHundredFree;
    private boolean injured;
    private boolean primary;
    private boolean mustSwimFly;
    private boolean mustSwimBack;
    private boolean mustSwimBreast;
    private boolean mustSwimFree;

    
    //Sets variables
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    protected void setGender(Integer gender) { this.gender = gender;}

    //Output variables
    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static Integer getAge() {
        return age;
    }

    public static String getGroup() {
        return group;
    }

    public static Integer getGender() {
        return gender;
    }


    //TODO Find number of lines in random access file and add to the end of it
}
