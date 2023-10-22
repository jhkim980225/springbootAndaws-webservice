package book.jo.org.web;


import book.jo.org.web.dto.HelloReponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloReponseDto helloDto(@RequestParam String name, @RequestParam int amount){

        return new HelloReponseDto(name,amount);
    }
}
