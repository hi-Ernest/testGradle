package edu.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * create by Ernest on 2020/3/28.
 */
@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public  String Home() {
        return "Hello";
    }
}
