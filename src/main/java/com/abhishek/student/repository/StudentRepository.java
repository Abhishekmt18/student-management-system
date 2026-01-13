
package com.abhishek.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abhishek.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
