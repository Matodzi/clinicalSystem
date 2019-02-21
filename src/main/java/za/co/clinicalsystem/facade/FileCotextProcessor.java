package za.co.clinicalsystem.facade;

import java.util.List;

public interface FileCotextProcessor {

    void consoleText(List<String> stringList);
    String serverText(List<String> stringList);
    void databaseText(List<String> stringList);
    void writeTextToFile(List<String> stringList);
}
