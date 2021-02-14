package ru.goryachev.outline.minimaljar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinController {
    @GetMapping("/one")
    public String message() {
        return "Message by Lev: RestController works, Minimal WAR APP";
    }
}
