import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

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

    static Integer position(Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        int pos = 0;
        int lineLength;
        for (int i = 0; i < line; i++) {
            raf.seek(pos);
            if (raf.readLine() != null) {
                raf.seek(pos);
                lineLength = raf.readLine().length();
                pos = pos + lineLength + 1;
            }
            if (pos > 0) {
                pos = pos - 1;
            }
        }
        System.out.println(pos);
        return pos;
    }
}
