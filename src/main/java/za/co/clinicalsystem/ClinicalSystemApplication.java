package za.co.clinicalsystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import za.co.clinicalsystem.enums.ApplicationModes;
import za.co.clinicalsystem.facade.FileCotextProcessorImpl;
import za.co.clinicalsystem.helper.ClinicalSystemHelper;
import za.co.clinicalsystem.service.FileReaderImpl;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class ClinicalSystemApplication {

    public static void main(String[] args) {

        // Only a specific code can be passed to triger the non-network mode
        if(args.length>0 && args[0].equals(ApplicationModes.NONNETWORK.getNetworkCode())){
            System.out.println(ApplicationModes.NONNETWORK.getNetworkCode()+" mode was selected ...");
            ClinicalSystemHelper clinicalSystemHelper = new ClinicalSystemHelper(new FileReaderImpl(), new FileCotextProcessorImpl());
            clinicalSystemHelper.nonNetworkMde();

        }else{
            System.out.println(ApplicationModes.NETWORK.getNetworkCode()+" mode was selected ...");
            SpringApplication.run(ClinicalSystemApplication.class, args);
        }
    }
}
