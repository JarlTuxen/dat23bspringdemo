package dk.kea.dat23bspringdemo.controller;

import dk.kea.dat23bspringdemo.service.FridayCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private FridayCalculator fridayCalculator;

    public HelloController(FridayCalculator fridayCalculator){
        this.fridayCalculator = fridayCalculator;
    }

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

    @GetMapping("/erdetfredag")
    public String erdetfredag(){
        //FridayCalculator fridayCalculator = new FridayCalculator();
        return fridayCalculator.erdetfredag();
    }

    @GetMapping("/erdetx")
    public String erDetX(@RequestParam("day") int dag){
        //FridayCalculator fridayCalculator = new FridayCalculator();
        return fridayCalculator.erDetX(dag);
    }

}
