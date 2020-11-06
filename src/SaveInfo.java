import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class SaveInfo {

    //RAF for Names
    public static void saveName() throws IOException {
        int pos = 0;
        RandomAccessFile name = new RandomAccessFile("name.txt", "rw");
        name.seek(0);

        while (name.readLine() != null) {
            name.seek(pos);
            System.out.println(name.readLine());
            name.seek(pos);
            pos = name.readLine().length() + 1;
            name.seek(pos);
        }

        name.seek(pos);
        name.writeBytes(Swimmer.getFirstName() + " " + Swimmer.getLastName() + "\n");

    }

    static Integer position(Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        int pos = 0;
        int lineLength;
        for (int i = 0; i < line; i++) {
            raf.seek(pos);
            lineLength = raf.readLine().length();
            pos = pos + lineLength + 1;
        }
        return pos;
    }

    static void takeInfo(String info, String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
    }



    //RAF for Age
    public void saveAge() throws IOException {
        int pos1 = 0;
        RandomAccessFile age = new RandomAccessFile("age.txt", "rw");
        age.seek(0);

        while (age.readLine() != null) {
            age.seek(pos1);
            pos1 = age.readLine().length() + 1;
        }

        age.seek(pos1);
        age.writeBytes("\n" + Swimmer.getAge());

    }

    //RAF for Group
    public void saveGroup() throws IOException {
        int pos2 = 0;
        RandomAccessFile group = new RandomAccessFile("group.txt", "rw");
        group.seek(0);

        while (group.readLine() != null) {
            group.seek(pos2);
            pos2 = group.readLine().length() + 1;
        }

        group.seek(pos2);
        group.writeBytes("\n" + Swimmer.getGroup());

    }

    //RAF for Gender
    public void saveGender() throws IOException {
        int pos3 = 0;
        RandomAccessFile group = new RandomAccessFile("gender.txt", "rw");
        group.seek(0);

        while (group.readLine() != null) {
            group.seek(pos3);
            pos3 = group.readLine().length() + 1;
        }

        group.seek(pos3);
        group.writeBytes("\n" + Swimmer.getGender());

    }
}
