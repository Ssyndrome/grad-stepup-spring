package com.thoughtworks.serverproject.repository;

import com.thoughtworks.serverproject.domain.Classroom;
import com.thoughtworks.serverproject.domain.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
class ClassroomRepositoryTest {
    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private StudentRepository studentRepository;

    private Classroom gradeOne;
    private Student apple;
    private Student baby;
    private Student cell;

    @BeforeEach
    void setUp() {
        gradeOne = new Classroom();
        gradeOne.setName("one grade");

        apple = new Student();
        apple.setName("apple");
        apple.setAge(11);
        apple.setHeight(120);

        baby = new Student();
        baby.setName("baby");
        baby.setAge(66);
        baby.setHeight(190);

        cell = new Student();
        cell.setName("cell");
        cell.setAge(12);
        cell.setHeight(160);

    }

    @Test
    @Transactional
    void should_succeed_create_a_classroom_and_three_student() {
        classroomRepository.save(gradeOne);
        studentRepository.save(apple);
        studentRepository.save(baby);
        studentRepository.save(cell);
        gradeOne.setStudents(Arrays.asList(apple, baby, cell));

        List<Classroom> classes = classroomRepository.findAll();
        assertThat(classes).hasSize(1);

        List<Student> students = studentRepository.findAll();
        assertThat(students).hasSize(3);

        List<Student> foundStudents = classroomRepository.findByName("one grade").getStudents();
        assertThat(foundStudents).hasSize(3);
    }

    @Test
    void should_succeed_add_student_to_classroom() {
    }
}