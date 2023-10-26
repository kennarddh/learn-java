package kennarddh.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("README.md"));

            while (true) {
                String line = reader.readLine();

                if (line == null)
                    break;

                System.out.println(line);
            }
        } catch (Throwable throwable) {

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("error close reader " + e.getMessage());
                }
            }
        }

        try (BufferedReader reader2 = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader2.readLine();

                if (line == null)
                    break;

                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("error reading README.md " + throwable.getMessage());
        }
    }
}
