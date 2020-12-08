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
    private static int canSwimFly;
    private static int canSwimBack;
    private static int canSwimBreast;
    private static int canSwimFree;
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

    public void setCanSwimFly(Integer mustSwimFly) {this.canSwimFly = mustSwimFly;}

    public void setCanSwimBack(Integer mustSwimBack) {this.canSwimBack = mustSwimBack;}

    public void setCanSwimBreast(Integer mustSwimBreast) {this.canSwimBreast = mustSwimBreast;}

    public void setCanSwimFree(Integer mustSwimFree) {this.canSwimFree = mustSwimFree;}

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

    public static Integer getCanSwimFly() {
        return canSwimFly;
    }

    public static Integer getCanSwimBack() {
        return canSwimBack;
    }

    public static Integer getCanSwimBreast() {
        return canSwimBreast;
    }

    public static Integer getCanSwimFree() {
        return canSwimFree;
    }

    public static Integer getCanSwimAll() {
        return canSwimAll;
    }


}
