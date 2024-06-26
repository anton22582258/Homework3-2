package ru.hogwarts.school1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school1.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByAge(int age);

    List<Student> findByAgeBetween(int minAge, int maxAge);

}
