package com.flexisaf.student_management.repository;

import com.flexisaf.student_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
