package za.co.clinicalsystem.facade;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FileCotextProcessorImpl implements FileCotextProcessor {

    @Override
    public void consoleText(List<String> stringList) {

        if(stringList.size()<1){
            System.out.println("*** Either file is empty or file path is incorrect ***");
        }else{
            System.out.println("*** File content ***");
            for(String str : stringList){
                System.out.println(str);
            }
        }
    }

    @Override
    public String serverText(List<String> stringList) {
        return stringList.toString();
    }

    /**
     * If a new requirement comes
     * @param stringList
     */
    @Override
    public void databaseText(List<String> stringList) {

    }

    /**
     * If a new requirement comes
     * @param stringList
     */
    @Override
    public void writeTextToFile(List<String> stringList) {

    }
}
