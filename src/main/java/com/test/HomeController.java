package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by abdul on 9/21/20.
 */

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }
}
