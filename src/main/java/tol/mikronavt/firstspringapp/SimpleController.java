package tol.mikronavt.firstspringapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    public String index(){
        return "Loh! Pidr!";
    }
}
