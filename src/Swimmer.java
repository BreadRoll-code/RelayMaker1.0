public class Swimmer {

    //TODO Swimmer variables
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String group;
    private static int gender;
    private static double oneHundredFly;
    private static double oneHundredBack;
    private static double oneHundredBreast;
    private static double oneHundredFree;
    private static int injured;
    private static int primary;
    private static int mustSwimFly;
    private static int mustSwimBack;
    private static int mustSwimBreast;
    private static int mustSwimFree;
    private static int canSwimAll;

    
    //Sets variables
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge(Integer age) { this.age = age;}

    public void setGroup(String group) { this.group = group;}

    public void setGender(Integer gender) { this.gender = gender;}

    public void setOneHundredFly(Double timeFly) { this.oneHundredFly = timeFly;}

    public void setOneHundredBack(Double timeBack) { this.oneHundredBack = timeBack;}

    public void setOneHundredBreast(Double timeBreast) { this.oneHundredBreast = timeBreast;}

    public void setOneHundredFree(Double timeFree) { this.oneHundredFree = timeFree;}

    public void setMustSwimFly(Integer mustSwimFly) {this.mustSwimFly = mustSwimFly;}

    public void setMustSwimBack(Integer mustSwimBack) {this.mustSwimBack = mustSwimBack;}

    public void setMustSwimBreast(Integer mustSwimBreast) {this.mustSwimBreast = mustSwimBreast;}

    public void setMustSwimFree(Integer mustSwimFree) {this.mustSwimFree = mustSwimFree;}

    public void setCanSwimAll(Integer canSwimAll) {this.canSwimAll = canSwimAll;}

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

    public static Double getOneHundredFly() {
        return oneHundredFly;
    }

    public static Double getOneHundredBack() {
        return oneHundredBack;
    }

    public static Double getOneHundredBreast() {
        return oneHundredBreast;
    }

    public static Double getOneHundredFree() {
        return oneHundredFree;
    }

    public static Integer getMustSwimFly() {
        return mustSwimFly;
    }

    public static Integer getMustSwimBack() {
        return mustSwimBack;
    }

    public static Integer getMustSwimBreast() {
        return mustSwimBreast;
    }

    public static Integer getMustSwimFree() {
        return mustSwimFree;
    }

    public static Integer getCanSwimAll() {
        return canSwimAll;
    }
}
