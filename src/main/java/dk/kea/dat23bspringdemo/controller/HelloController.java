package dk.kea.dat23bspringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String rootMapping(){
        return "Root page!";
    }

    @GetMapping("/second")
    public String secondMapping(){
        return "Again and again!";
    }

    @GetMapping("/parameter")
    public String parameter(@RequestParam String inddata){
        return inddata + " er dagens tekst!";
    }
}
