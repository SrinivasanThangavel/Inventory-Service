package com.stackroute.InventoryService.webAppController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping
    public String productWebapp(){
        return "index.html";
    }
}

