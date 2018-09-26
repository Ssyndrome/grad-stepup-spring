package com.thoughtworks.serverproject.repository;

import com.thoughtworks.serverproject.domain.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {
    Classroom findByName(String name);
}
