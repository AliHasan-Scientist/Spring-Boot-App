package com.example.demo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
class HelloController {
@RequestMapping(value = "/Hello")
public String hello()
{
    return "Roy Ali Hasan ";
}
}
