package org.itnavigator.testtask.web;

import org.itnavigator.testtask.model.Phone;
import org.itnavigator.testtask.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.regex.Pattern;

/**
 * Created by bender on 25.04.2017.
 */
@Controller
public class PhoneController {


    private final PhoneService phoneService;
    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping(value="/*")
    public String root() {
        return "index";
    }

    @GetMapping("/phones")
    public String phones(Model model) {
        model.addAttribute("phones",phoneService.getAll());
        return "phones";
    }
    @GetMapping(value="/phones/edit/{id}")
    public String edit(Model model,@PathVariable("id")int id){
        model.addAttribute("phoneToEdit",phoneService.get(id));
        return"edit";
    }
    @PostMapping(value="phones/edit/save")
    public String save(@ModelAttribute("id")int id,
                       @ModelAttribute("number")String number,
                       @ModelAttribute("description")String description,
                       @ModelAttribute("comments")String comments){
        Pattern p=Pattern.compile("\\d-(\\d{3})-(\\d{3})-(\\d{4})");
        phoneService.update(new Phone(id,number,description,comments));
        return "redirect:/phones";
    }
}
