package za.co.clinicalsystem.service;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileReaderImpl implements FileReader {

    @Override
    public List<String> readFile(String filePath) {

        List<String> fileLines = new ArrayList<>();

        try {
            fileLines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);

        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }
        return fileLines;
    }
}
