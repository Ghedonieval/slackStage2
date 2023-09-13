package com.example.SlackStage2;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{user_id}")
    public Person getByUser_id(@PathVariable("user_id") int id){
        var exist = personRepository.findById(id);
        return exist;
    }


//    @GetMapping("/userName/{name}")
//    public Person getByName(@PathVariable("name") String name){
//        var exist = personRepository.findByName(name);
//        return exist;
//    }

    @GetMapping("/name")
    public Person getByName(@RequestParam("name") String name){
        var exist = personRepository.findByName(name);
        return exist;
    }

    @PostMapping
    public Person addPerson(@RequestBody Person request ){
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

    @DeleteMapping("/{user_id}")
    public String deleteByUser_id(@PathVariable("user_id") int user_id){
        var exist = personRepository.findById(user_id);
        if (exist != null){
            personRepository.delete(exist);
            return "DELETED SUCCESSFULLY";
        }
        return "USER DOES NOT EXIST";
    }

//    @DeleteMapping("/userName/{user_name}")
//    public String deleteByName(@PathVariable("user_name") String name){
//        var exist = personRepository.findByName(name);
//        if (exist != null){
//            personRepository.delete(exist);
//            return "DELETED SUCCESSFULLY";
//        }
//        return "USER DOES NOT EXIST";
//    }

    @DeleteMapping("/name")
    public String deleteByName(@RequestParam("name") String name){
        var exist = personRepository.findByName(name);
        if (exist != null){
            personRepository.delete(exist);
            return "DELETED SUCCESSFULLY";
        }
        return "USER DOES NOT EXIST";
    }

    @PutMapping("{user_id}")
    public Person updatePersonById(@PathVariable("user_id") int user_id , @RequestBody Person request){
     var exist = personRepository.findById(user_id);
     exist.setName(request.getName());
     exist.setAge(request.getAge());

     return personRepository.save(exist);
    }

//    @PutMapping("/userName/{user_name}")
//    public Person updatePersonByName(@PathVariable("user_name") String name , @RequestBody Person request){
//        var exist = personRepository.findByName(name);
//        exist.setName(request.getName());
//        exist.setAge(request.getAge());
//
//        return personRepository.save(exist);
//    }

    @PutMapping("/name")
    public Person updatePersonByName(@RequestParam("name") String name , @RequestBody Person request){
        var exist = personRepository.findByName(name);
        exist.setName(request.getName());
        exist.setAge(request.getAge());

        return personRepository.save(exist);
    }
}
