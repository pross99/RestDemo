package restdemodat20b.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restdemodat20b.demo.model.Student;
import restdemodat20b.demo.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    private StudentRepository studentRepository;

    //constructor injection i stedet for field injection (autowired)
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    //HTTP GET (/students)

    @GetMapping("/students")
    public ResponseEntity<List<Student>> findall(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return ResponseEntity.status(HttpStatus.OK).body(students);
    }

}
