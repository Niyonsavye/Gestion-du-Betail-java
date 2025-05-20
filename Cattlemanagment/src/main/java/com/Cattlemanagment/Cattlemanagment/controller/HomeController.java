

package com.Cattlemanagment.Cattlemanagment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Spring cherchera une vue `index.jsp` ou `index.html`
    }
}
