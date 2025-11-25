package org.biukhanhhau.learningrestcontroller;


import org.biukhanhhau.learningrestcontroller.model.Information;
import org.biukhanhhau.learningrestcontroller.service.InforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    InforService inforService;

    @GetMapping("informations")
    public List<Information> getInformations(){
        return inforService.findInfors();
    }

    @PostMapping("information")
    public Information addInformation(@RequestBody Information information){
        inforService.addInformation(information);
        return inforService.findInfor(information.getId());
    }

    @PutMapping("information")
    public Information putInformation(@RequestBody Information information){
        inforService.putInformation(information);
        return inforService.findInfor(information.getId());
    }

    @GetMapping("information/{infoId}")
    public Information findInfo(@PathVariable("infoId") int infoId){
        return inforService.findInfor(infoId);
    }

    @DeleteMapping("informations/{infoId}")
    public Information delInformation(@PathVariable("infoId") int infoId){
        inforService.delInfor(infoId);
        return inforService.findInfor(infoId);
    }
}
