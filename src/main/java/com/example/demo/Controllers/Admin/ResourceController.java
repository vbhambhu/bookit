package com.example.demo.Controllers.Admin;

import com.example.demo.models.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ResourceController {

    @RequestMapping("/admin/resource")
    String showResourcesList(){
        return "admin/resources/list";
    }

    @RequestMapping("/admin/resource/create")
    String createResource(Resource resource){
        return "admin/resources/createResource";
    }



    @RequestMapping(value = "/admin/resource/create", method = RequestMethod.POST)
    String doCreateResource(@Valid Resource resource, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "admin/resources/createResource";
        }

        return "redirect:/results";
    }
}
