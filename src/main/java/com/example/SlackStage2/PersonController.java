package com.example.SlackStage2;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPerson(){
        List<Person> getPerson = personRepository.findAll();
        return  getPerson;
    }

    @PostMapping
    public Person addPerson(@RequestBody Person request){
        Person person = new Person();
        person.setName(request.getName());
        person.setAge(request.getAge());
        personRepository.save(person);
        return person;
    }

    @DeleteMapping
    public void deleteAllPersons(){
         personRepository.deleteAll();;
    }

    @PutMapping("{updatebyid}")
    public Person updatePersonById(@PathVariable("updatebyid") int id , @RequestBody Person request){
     var exist = personRepository.findById(id);
     exist.setName(request.getName());
     exist.setAge(request.getAge());

     return personRepository.save(exist);
    }
}
