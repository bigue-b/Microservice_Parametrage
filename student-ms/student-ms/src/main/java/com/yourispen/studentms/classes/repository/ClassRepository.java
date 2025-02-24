package com.yourispen.studentms.classes.repository;


import com.yourispen.studentms.classes.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;


@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
    Optional<ClassEntity> findByName(String name);
}
