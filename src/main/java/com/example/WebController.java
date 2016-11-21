package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by christerhansen on 21.11.2016.
 */
@Controller
public class WebController {
    @GetMapping("/")
    public String getRoot(){
        return "index";
    }
}
