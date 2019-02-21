package za.co.clinicalsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.co.clinicalsystem.helper.ClinicalSystemHelper;

@RestController
public class ClinicalSystemController {

    private final ClinicalSystemHelper clinicalSystemHelper;

    @Autowired
    ClinicalSystemController(ClinicalSystemHelper clinicalSystemHelper){
        this.clinicalSystemHelper=clinicalSystemHelper;
    }

    @RequestMapping(value = "/clinicalSystem", method = RequestMethod.GET, produces = {MediaType.TEXT_PLAIN_VALUE})
    public String getDocument(@RequestParam(name = "filePath") String filePath){
        return clinicalSystemHelper.networkMode(filePath);
    }
}
