package hello.typeconverter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request){
        String data = request.getParameter("data");
        Integer integer = Integer.valueOf(data);
        return "okky";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam("data") Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }
}
