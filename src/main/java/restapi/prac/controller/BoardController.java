package restapi.prac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestController는 ResponseBody로 응답한다.
public class BoardController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
