package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/kyungwoon/Downloads/fword_list.txt")
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }
}
