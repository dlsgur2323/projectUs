package us.cmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonIndexController {

    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
