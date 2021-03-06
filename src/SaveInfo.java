import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class SaveInfo {

    void saveInfo(String info, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        if (raf.length() == 0) {
            raf.seek(0);
            raf.writeBytes(info);
        } else {
            raf.seek(raf.length());
            raf.writeBytes("\n" + info);
        }
    }

    void saveInfoInt(int info, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        if (raf.length() == 0) {
            raf.seek(0);
            raf.writeBytes(String.valueOf(info));
        } else {
            raf.seek(raf.length());
            raf.writeBytes("\n" + info);
        }

    }

    void saveInfoDouble(double info, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        if (raf.length() == 0) {
            raf.seek(0);
            raf.writeBytes(String.valueOf(info));
        } else {
            raf.seek(raf.length());
            raf.writeBytes("\n" + info);
        }

    }

    static Integer position(Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        int pos = 0;
        int lineLength;
        for (int i = 0; i < line; i++) {
            raf.seek(pos);
            String lineText = raf.readLine();
            lineLength = lineText.length();
            pos = pos + lineLength + 2;
        }
        return pos;
    }

    static String getLine(Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(position(line, filePath));
        return raf.readLine();
    }

    void saveSwimmer(Swimmer swimmer) throws IOException {
        saveInfo(swimmer.getName(), "name.txt");
        saveInfoInt(swimmer.getAge(),"age.txt");
        saveInfoInt(swimmer.getGender(),"gender.txt");
        saveInfoDouble(swimmer.getOneHundredFly(),"100fly.txt");
        saveInfoDouble(swimmer.getOneHundredBack(),"100back.txt");
        saveInfoDouble(swimmer.getOneHundredBreast(),"100breast.txt");
        saveInfoDouble(swimmer.getOneHundredFree(),"100free.txt");
    }

}
