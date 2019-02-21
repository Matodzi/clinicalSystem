package za.co.clinicalsystem.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.clinicalsystem.facade.FileCotextProcessorImpl;
import za.co.clinicalsystem.service.FileReaderImpl;

import java.util.List;
import java.util.Scanner;

@Component
public class ClinicalSystemHelper {

    private final FileReaderImpl fileReader;
    private final FileCotextProcessorImpl fileCotextProcessor;

    @Autowired
    public ClinicalSystemHelper(FileReaderImpl fileReader, FileCotextProcessorImpl fileCotextProcessor){
        this.fileReader=fileReader;
        this.fileCotextProcessor=fileCotextProcessor;
    }

    /**
     * This helper method displays file content to the console on non-network mode
     */
    public void nonNetworkMde(){
        System.out.println("Please enter file path: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        List<String> stringFromFile = fileReader.readFile(filePath);
        fileCotextProcessor.consoleText(stringFromFile);
    }

    /**
     * This helper method displays file content to the client while on network mode
     * @param filePath
     * @return
     */
    public String networkMode(String filePath){
        List<String> fileContent = fileReader.readFile(filePath);
        return fileCotextProcessor.serverText(fileContent);
    }
}
