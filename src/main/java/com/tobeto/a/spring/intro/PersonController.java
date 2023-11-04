package com.tobeto.a.spring.intro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/persons")
public class PersonController {
    //In-Memory DB
    private List<Person> personList = new ArrayList<>();
    @GetMapping
    public List<Person> getAll(){
        return personList;
    }

    @GetMapping("{id}")
    public Person getBeyId(@PathVariable int id){
        Person person = personList
                .stream()
                .filter(p -> p.id ==id )
                .findFirst()
                .orElseThrow();
        return person;


    }

    @PostMapping
    public void add(@RequestBody Person person){
        personList.add(person);
    }

    @PutMapping
    public String update(@RequestParam Person person){
        Person personToUpdate = personList
                .stream()
                .filter(p -> p.id == person.id)
                .findFirst()
                .orElseThrow();
        personToUpdate.name = person.name;
        personToUpdate.surname = person.surname;
        return "Updated";

    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        Person personToDelete = personList
                .stream()
                .filter(p -> p.id==id)
                .findFirst()
                .orElseThrow();
        personList.remove(personToDelete);
        return "Deleted";
    }
}
