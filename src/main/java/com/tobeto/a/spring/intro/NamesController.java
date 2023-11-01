package com.tobeto.a.spring.intro;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/names")
public class NamesController {
    //Query Selector (çoklu)
    @GetMapping
    public String get(@RequestParam String name, @RequestParam(required = false) String surname){
        return "Hello! " + name +" " + surname;
    }

    //Pathvariable (tek parametre)
    @GetMapping("get2/{name}/{surname}") //Second "get mapping" needs to be identified
    public String get2(@PathVariable String name,@PathVariable String surname){
        return "Hello! " + name + " " + surname;
    }
    @GetMapping("get3")
    public String get3(@RequestParam String name){
        return "Hello!" + name;
    }
    //JSON
    @PostMapping
    public String post(@RequestBody Person person)
    {
        return "Hello! Tobeto Post ";
    }
}
