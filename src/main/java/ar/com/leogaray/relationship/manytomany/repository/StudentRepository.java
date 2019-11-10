package ar.com.leogaray.relationship.manytomany.repository;

import ar.com.leogaray.relationship.manytomany.model.Course;
import ar.com.leogaray.relationship.manytomany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}