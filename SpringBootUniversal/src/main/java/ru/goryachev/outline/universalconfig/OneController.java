package ru.goryachev.outline.universalconfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OneController {
    @GetMapping("/page")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Hello Java Spring Boot!") String name, Model model) {
        model.addAttribute("name", name);
        return "hellopage";
    }
}
