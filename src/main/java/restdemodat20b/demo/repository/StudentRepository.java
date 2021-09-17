package restdemodat20b.demo.repository;

import org.springframework.data.repository.CrudRepository;
import restdemodat20b.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {


}
