package Utils;

import Model.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FileIO {

    public static void WriteToFile(String filePath, List<String> stringList, boolean append) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, append))) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Object data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> ReadFromFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
